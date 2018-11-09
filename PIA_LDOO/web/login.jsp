<%-- 
    Document   : login
    Created on : Sep 13, 2016, 6:34:08 PM
    Author     : romeo.sanchez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel = "stylesheet" href = "textoimagen.css" type = "text/css">
    </head>

    <body background = "f16.jpg">
    <center>
        <h1>
            <div class = "contenedor">
                <img src = "banderin.png" />
                <div class = "centrado">
                    <font face = "AR CARTER" color = "purple" > 
                    Rincón de la lectura
                    </font>
                </div>
        </h1>
    </center>

    <h1>Login</h1>
        <form action = "Controller.htm" method = "post">
            <p>
                Nombre
                <input type = "text" name = "usuario">
            </p>
            <p>
                Password
                <input type="password" name="password">
            </p>

            <input type = "submit" name = "Enviar">

            <p>
                <a href="Registro.jsp">Registrarse</a>
            </p>
        </form>
    </body>
</html>
