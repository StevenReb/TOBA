<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <!-- Importing header -->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:import url="/header.html" />
        
        <!-- Message showing account has been created -->
        <h3 style="padding-left: 50px; padding-top: 25px;"> Account has been successfully created! </h3>
        
        <!-- Table displaying data entered into NewCostumerServlet -->
        <table style="padding-left: 65px; padding-bottom: 25px;" cellspacing="5">
            <tr align="right">
                <th> First Name: </th>
                <th> <c:out value="${user.firstName}" /> </th>
            </tr>
            
            <tr align="right">
                <th> Last Name: </th>
                <th> <c:out value="${user.lastName}" /> </th>
            </tr>
            
            <tr align="right">
                <th> Phone: </th>
                <th> <c:out value="${user.phone}" /> </th>
            </tr>
            
            <tr align="right">
                <th> Address: </th>
                <th> <c:out value="${user.address}" /> </th>
            </tr>
            
            <tr align="right">
                <th> City: </th>
                <th> <c:out value="${user.city}" /> </th>
            </tr>
            
            <tr align="right">
                <th> State: </th>
                <th> <c:out value="${user.state}" /> </th>
            </tr>
            
            <tr align="right">
                <th> Zip Code: </th>
                <th> <c:out value="${user.zipCode}" /> </th>
            </tr>
            
            <tr align="right">
                <th>  Email: </th>
                <th> <c:out value="${user.email}" /> </th>
            </tr>
            
            <tr align="right">
                <th> &nbsp; </th>
                <th> &nbsp; </th>
            </tr>
            
            <tr align="right">
                <th> Username: </th>
                <th> <c:out value="${user.username}" /> </th>
            </tr>
            
            <tr align="right">
                <th> Password: </th>
                <th> <c:out value="${user.password}" /> </th>
            </tr>
      
        </table>        
        
<!-- Importing footer -->
<c:import url="footer.jsp" />