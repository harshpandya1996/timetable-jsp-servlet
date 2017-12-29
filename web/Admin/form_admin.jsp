<%-- 
    Document   : form_admin
    Created on : Oct 10, 2015, 1:14:31 PM
    Author     : 1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="insert_admin.jsp">
        <table>
            <tr>
                 
                <td>
                    Email:<input type="text" name="txtemail">
                </td>
            </tr>
            <tr>
                <td>
                    password:<input type="password" name="txtpassword">
                </td>
            </tr>
               <tr>
                   <td>
                   <input type="submit" value="Insert">
                   </td>
               </tr>
        </table>
        </form>
    </body>
</html>
