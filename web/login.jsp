<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- Importing header -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.html" />
    

    <h3 style="padding-left: 10px;"><i>${message}</i></h3>

    <!-- form for LoginServlet -->
    <form class="login" action="LoginServlet" method="post">
                <table style="padding-left: 10px;">
                    <tr>
                        <td> UserID: </td>
                        <td><input type="text" name="userID" value=""></td>
                    </tr>

                    <tr>
                        <td> Password: </td>
                        <td><input type="text" name="password" value=""></td>
                    </tr>

                    <tr>
                        <td> &nbsp; </td>
                        <td style="padding-bottom: 10px;"> <input type="submit" value="Login"> </td>

                    </tr>

                </table>
            </form>

            <a Style="font-size: .9em; padding-left: 10px;" href="New_customer.jsp"> New Customer? </a>
            <a Style="font-size: .9em;" href="password_reset.jsp"> Reset Password </a>

<!-- Importing footer -->
<c:import url="footer.jsp" />