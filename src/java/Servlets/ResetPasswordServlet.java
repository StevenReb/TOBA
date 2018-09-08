package Servlets;

import JavaBeans.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;


public class ResetPasswordServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Getting session
        HttpSession session = request.getSession();
      
        String url = "";
        
        // Getting user object from session
        User user = (User) session.getAttribute("user");
        
        String message = "";
        
        // If user object exists
        if (user != null) {
        
            // Getting new password from form
            String newPassword = request.getParameter("newPassword");
            
            // If newPassword field is not empty set new password 
            if (newPassword != "") {
                     user.setPassword(newPassword);
                     url = "/login.jsp";
            }
            
            // If newPassword field is not null
            else if (newPassword != null) {
                     user.setPassword(newPassword);
                     url = "/login.jsp";
            }
            
      
            // If newPassword field is empty display message
            else if (newPassword == null) {
                message = "No Password Entered";
                url = "/password_reset.jsp";
            }
        }
        else {
            message = "No Accounts Exists. Create Account";
            url = "/password_reset.jsp";
        }
                
            
            request.setAttribute("message", message);
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
}
