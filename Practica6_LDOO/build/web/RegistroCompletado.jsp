<%-- 
    Document   : RegistroJSP
    Created on : 8/11/2018, 11:14:37 PM
    Author     : akats
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Práctica 4</title>
    </head>
    <body background = "f16.jpg">>
        <h1>
            <font face =  "Cabin Sketch">
                ¡Su registro se completo con exito!
            </font>
        </h1>
        
        <%
         String nombre = request.getParameter("nombre");
         String apellido = request.getParameter("apellido");
         String correo = request.getParameter("correo");
        %>
        
   
        <h2>Tus datos son los siguientes:</h2>         

        <p>Nombre: <%=nombre%></p>
        <p>Apellido: <%=apellido%> </p>
        <p>Correo: <%=correo%> </p>
        
        <h3>
            <font face =  "Cabin Sketch">
                Puedes seguir navegando en nuestra página.
            </font>
        </h3>
    </body>
</html>
