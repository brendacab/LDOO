<%-- 
    Document   : CloseSession
    Created on : 9/11/2018, 03:25:24 PM
    Author     : akats
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Session</title>
    </head>
    <%
        HttpSession sesion = request.getSession(false);
        session.invalidate();

        response.sendRedirect("login.jsp");
    %>
</html>
