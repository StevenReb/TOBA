<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- Importing header -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.html" />
    
    <!-- Message displaying login was unsuccessful and providing link to create account -->
    <h3 style="padding-left: 50px"> Login was incorrect go back and try again! </h3>
        <h3 style="padding-left: 50px"> Don't have an account? 
            <a style="text-decoration: underline; font-size: 1em; color: blue;" 
               href="New_customer.jsp"> Click Here </a></h3>

<!-- Importing footer -->
<c:import url="footer.jsp" />