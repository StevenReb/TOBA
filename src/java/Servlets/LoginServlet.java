package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/login.html";
 
        // Get parameters
        String userID = request.getParameter("userID");
        String password = request.getParameter("password");
   
        String message = "";
            
            if (userID.equals("jsmith@toba.com") && password.equals("letmein")){
                url = "/Account_activity.html";
            }
     
            else if (userID.isEmpty() || password.isEmpty()) {
                message = "Please fill out all text boxes.";
                url = "/login_failure.html";
            } 
            
            else {
                url = "/login_failure.html";
            }
            
            request.setAttribute("message", message);
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
}

