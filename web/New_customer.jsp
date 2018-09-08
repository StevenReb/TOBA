<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- Importing header -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.html" />
        
        <!-- NewCustomerServlet message displayed here -->
        <h3><i>${message}</i></h3>
        
        <!-- Form for user to enter information to create account -->
        <form action="NewCustomerServlet" method="post">
            <table cellspacing="8" border="0">
                <tr>
                    <td align="right"> First Name: </td>
                    <td> <input type="text" name="firstName" > </td>
                </tr>
                
                <tr>
                    <td align="right"> Last Name: </td>
                    <td> <input type="text" name="lastName" > </td>
                </tr>
                
                <tr>
                    <td align="right"> Phone: </td>
                    <td> <input type="text" name="phone" > </td>
                </tr>
                
                <tr>
                    <td align="right"> Address: </td>
                    <td> <input type="text" name="address" > </td>
                </tr>
                
                <tr>
                    <td align="right"> City: </td>
                    <td> <input type="text" name="city" > </td>
                </tr>
                
                <tr>
                    <td align="right"> State: </td>
                    <td> <input type="text" name="state" > </td>
                </tr>
                
                <tr>
                    <td align="right"> Zip Code: </td>
                    <td> <input type="text" name="zipCode" > </td>
                </tr>
                
                <tr>
                    <td align="right"> Email: </td>
                    <td> <input type="text" name="email" > </td>
                </tr>
                
                <tr>
                    <td><input type="submit" value="Submit"></td>
                </tr>
                
            </table>    
        </form>
        
<!-- Importing footer -->
<c:import url="footer.jsp" />