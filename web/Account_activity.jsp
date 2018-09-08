<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- Importing header -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.html" />
      
   <!-- If user is not empty display welcome and name -->
   <c:if test="${user != null}">
       <p style="padding-left: 20px;"> Welcome ${user.lastName} ${user.firstName}, </p>
   </c:if>
       
    <c:if test="${sessionScope.account == 'jsmith'}" >
        <p style="padding-left: 20px;"> 
            Welcome jsmith,  </p>
    </c:if>
           
   
       <h3 style="padding-top: 25px; padding-left: 50px;"> Account Activity Coming Soon </h3>
       
   <!-- If user is empty display message -->
   <c:if test="${sessionScope.account == null}">
       <p style="padding-left: 50px;"> Not Logged In </p>
   </c:if>

<!-- Importing footer -->
<c:import url="footer.jsp" />
