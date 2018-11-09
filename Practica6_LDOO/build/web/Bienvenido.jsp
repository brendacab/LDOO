<%-- 
    Document   : Bienvenido
    Created on : 9/11/2018, 11:14:03 AM
    Author     : akats
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <% 
        String nombre = (String)session.getAttribute("nombre");
        
        if (nombre == null) {
            // sesión inválida
            response.sendRedirect("login.jsp");
        }
 
    %>
    
    <body>
        <h1>Bienvenido, <%=nombre%></h1>
    </body>
</html>
