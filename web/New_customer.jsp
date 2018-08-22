<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    
    <head>
        <title> TOBA New Customer </title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    </head>
    
    <body>
        
        <div class="head">
          <h1> TOBA </h1>
          <h2> Titan Online Banking Application </h2>
        </div>
        
         <nav>
            <ul>
                <li style="padding-left: 120px;"><a href="index.html"> Home </a></li>
                <li><a href="login.html"> Login </a></li>
                <li><a href="New_customer.jsp"> New Customer </a></li>
                <li><a href="Account_activity.html"> Account Activity </a></li>
                <li><a href="Transaction.html"> Transaction </a></li>
            </ul>
        </nav>
        
        <h3><i>${message}</i></h3>
        
        <form action="NewCustomerServlet" method="post">
            <table cellspacing="5" border="0">
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
                    <td align="right"> Zipcode: </td>
                    <td> <input type="text" name="zipcode" > </td>
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
        
    </body>
    
</html>
