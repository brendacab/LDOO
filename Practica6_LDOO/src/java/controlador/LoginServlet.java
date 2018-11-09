/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author akats
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            // obtener la sesión, o crearla si no existe
            HttpSession sesion = request.getSession(true);
            // obtenar el atributo guardado "nombre", si es que existe previamente
            String nombre = (String) sesion.getAttribute("nombre");

            // leer las credenciales del usuario
            String usuario = (String) request.getParameter("usuario");
            String password = (String) request.getParameter("password");
            
            if (nombre == null || nombre.equals("")) {
                // primera vez
                // valida el usuario (temporalmente en "hardcode")
                // ...este "hardcode" es temporal. No lo hagan en sus proyectos. :)
                if (usuario.equalsIgnoreCase("brenda11") && password.equalsIgnoreCase("nico11")) {
                    // login válido
                    // welcome
                    sesion.setAttribute("nombre", usuario);

                    // redirige a la página de bienvenida
                    response.sendRedirect("Bienvenido.jsp");

                } else {
                    // el usuario es inválido
                    response.sendRedirect("login.jsp?mensaje=datos incorrectos");
                }

            } else {
                // ya había iniciado sesión
                response.sendRedirect("Bienvenido.jsp");

            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
