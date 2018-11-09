<%-- 
    Document   : Cookie
    Created on : 9/11/2018, 03:26:21 PM
    Author     : akats
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <<title>Cookies</title>
    </head>
    <body>
        <%
            Cookie[] cookie;
            cookie = request.getCookies();
            
            for(int i=0;i<cookie.length;i++){
                out.println("<p><b> Nombre: </b> "+cookie[i+1].getName()+"</p>");
                out.println("<p><b> Valor: </b> "+cookie[i+1].getValue()+"</p>");
                out.println("<hr>");
            }
        %>
    </body>
</html>
