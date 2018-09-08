package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import JavaBeans.User;

public class NewCustomerServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/New_customer.jsp";
        
        // Get parameters
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zipCode = request.getParameter("zipCode");
        String email = request.getParameter("email");
   
        String message = "";
        
            // If one of the variables are emtpy it displays message
            if ( firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() ||
                   address.isEmpty() ||     city.isEmpty() || state.isEmpty() ||
                   zipCode.isEmpty() ||    email.isEmpty()) {
                message = "Please fill out all text boxes.";
            } 
            
            // If all fields are filled out
            else {
                // Getting session
                HttpSession session = request.getSession();
                
                // Creating user with constructor 
                User user = new User (firstName, lastName, phone, address, 
                                    city, state, zipCode, email);
                
               // Setting the user as session attribute
                session.setAttribute("user", user);
                
                // Setting a session attribute for the userId and password
                //      to user getAttribute to use in the LoginServlet
                session.setAttribute("userName", user.getUsername());
                session.setAttribute("userPassword", user.getPassword());
                
                
                url = "/Success.jsp";
            }
            
            request.setAttribute("message", message);
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
}
