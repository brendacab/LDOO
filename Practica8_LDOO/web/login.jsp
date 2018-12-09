<%-- 
    Document   : login
    Created on : Sep 13, 2016, 6:34:08 PM
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
    
        <h1>Login</h1>
        
       <form action="LoginServlet">   
            <font face =  "Cabin Sketch"> 
                <h2>Usurio: <input type = "text" name = "usuario"><br></h2>
                <h2>Password: <input type = "password" name = "password"><br></h2>
                <input type = "submit" value = "Enviar">
            </font>
       </form>
    </body>
</html>
