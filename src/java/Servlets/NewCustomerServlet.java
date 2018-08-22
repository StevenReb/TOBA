package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        String zipcode = request.getParameter("zipcode");
        String email = request.getParameter("email");
      
   
        String message = "";
            
            if ( firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() ||
                   address.isEmpty() ||     city.isEmpty() || state.isEmpty() ||
                   zipcode.isEmpty() ||    email.isEmpty()) {
                message = "Please fill out all text boxes.";
            } 
            
            else {
                url = "/Success.html";
            }
            
            request.setAttribute("message", message);
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
}
