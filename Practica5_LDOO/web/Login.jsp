<%-- 
    Document   : Login
    Created on : 9/11/2018, 12:25:10 AM
    Author     : akats
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Practica 4</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
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

    <h3>
        <font face =  "Cabin Sketch"> 
        La mejor compañaria de la soledad es un libro. 
        </font>
    </h3> <hr>

    <h4> A continuación rellene el siguiente formulario para completar su registro.</h4>

    <p>
    <form action = "RegistroCompletado.jsp"
          method = "post">
        Nombre: <br>
        <input type = "text" name = "nombre"> <br>
        Apellido: <br>
        <input type = "text" name = "apellido">

        Sexo:
        <select name = "sex">
            <option value = "O">Otro</option>
            <option value = "F">Femenino</option>
            <option value = "M">Masculino</option>   
        </select>

        Birthday:
        <input type = "date" name = "bday"><br>

        Usuario: <br>
        <input type = "text" name = "usuario"><br>
        Contraseña: <br>
        <input type = "password" name = "contrasena"><br>

        Correo:
        <input type = "email" name = "correo">

        <p>
            <input type="submit" value= "enviar">
            <input type="reset">
        </p>
    </form><hr>
    </body>
</html>
