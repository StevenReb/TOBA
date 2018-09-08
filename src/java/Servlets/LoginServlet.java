package Servlets;

import JavaBeans.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {

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
        
        // Get parameters
        String userID = request.getParameter("userID");
        String password = request.getParameter("password");
        
        String message = "";
        
        // If fields are empty displays message
        if (userID.isEmpty() || password.isEmpty()) {
                    message = "Please fill out all text boxes.";
                    url = "/login.jsp";
                }
        
        // If hardcoded login is used
        else if (userID.equals("jsmith@toba.com") && password.equals("letmein")){
                    url = "/Account_activity.jsp";
                    session.setAttribute("account", "jsmith");
                }
        
        // If a user object exists
        else if (user != null) {
        
        // Getting new users username and password from user object
        String userUsername = user.getUsername();
        String userPassword = user.getPassword();
        
            // If login information equals user login
            if (userID.equals(userUsername) && password.equals(userPassword)){
                    url = "/Account_activity.jsp";
                    session.setAttribute("account", user);
                }
            
            // Else login failure
            else {
                    url = "/login_failure.jsp";
                }
            }
        
        // If everything fails login failure
        else {
            url = "/login_failure.jsp";
            }
            
            request.setAttribute("message", message);
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
}
