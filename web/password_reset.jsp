<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- Importing header -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.html" />
        
        <h3 style="padding-left: 85px;"> Password Reset </h3>
        
        <h3 style="padding-left: 85px;"><i>${message}</i></h3>
        
        <!-- Form for reseting password -->
        <form class="login" action="ResetPasswordServlet" method="post"
              style="margin-top: 30px;">
            
            <table>
                <tr>
                    <td> Password: </td>
                    <td><input type="text" name="newPassword"
                               value="<c:out value="${sessionScope.userPassword}"  />"> </td>
                </tr>
                
                <tr>
                    <td> &nbsp; </td>
                    <td style="padding-bottom: 10px;"> <input type="submit" value="Reset"> </td>
                </tr>
            </table>
        </form>
   
<!-- Importing footer -->
<c:import url="footer.jsp" />