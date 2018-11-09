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
    
    <%
        HttpSession sesion = request.getSession();
        
        String usuario,contrasena;
        
        usuario = sesion.getAttribute("username").toString();
        
        contrasena = sesion.getAttribute("password").toString();
        
        Usuario u = new Usuario(usuario,contrasena);
    %> 
    
    <body>
        <font >
            <h1>Bienvenido</h1>
            <p>
                Nombre: <%=u.getUsuario()%><br>
                Contraseña: <%=u.getPassword()%>
            </p>
        </font>
        
        <form action="Salir.jsp">
            <input type="submit" name="Salir"/>
        </form>
        <br>
        <a href="Cookie.jsp">
            <input type="submit" value="cookie" name="Ver cookie"/>
        </a>
        <br>
    </body>
</html>
