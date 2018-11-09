package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Practica 4</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel = \"stylesheet\" href = \"textoimagen.css\" type = \"text/css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body background = \"f16.jpg\">\n");
      out.write("    <center>\n");
      out.write("        <h1>\n");
      out.write("            <div class = \"contenedor\">\n");
      out.write("                <img src = \"banderin.png\" />\n");
      out.write("                <div class = \"centrado\">\n");
      out.write("                    <font face = \"AR CARTER\" color = \"purple\" > \n");
      out.write("                    Rincón de la lectura\n");
      out.write("                    </font>\n");
      out.write("                </div>\n");
      out.write("        </h1>\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("    <h3>\n");
      out.write("        <font face =  \"Cabin Sketch\"> \n");
      out.write("        La mejor compañaria de la soledad es un libro. \n");
      out.write("        </font>\n");
      out.write("    </h3> <hr>\n");
      out.write("\n");
      out.write("    <h4> A continuación rellene el siguiente formulario para completar su registro.</h4>\n");
      out.write("\n");
      out.write("    <p>\n");
      out.write("    <form action = \"RegistoCompletado.jsp\"\n");
      out.write("          method = \"POST\">\n");
      out.write("        Nombre: <br>\n");
      out.write("        <input type = \"text\" name = \"nombre\"> <br>\n");
      out.write("        Apellido: <br>\n");
      out.write("        <input type = \"text\" name = \"apellido\">\n");
      out.write("\n");
      out.write("        Sexo:\n");
      out.write("        <select name = \"sex\">\n");
      out.write("            <option value = \"O\">Otro</option>\n");
      out.write("            <option value = \"F\">Femenino</option>\n");
      out.write("            <option value = \"M\">Masculino</option>   \n");
      out.write("        </select>\n");
      out.write("\n");
      out.write("        Birthday:\n");
      out.write("        <input type = \"date\" name = \"bday\"><br>\n");
      out.write("\n");
      out.write("        Usuario: <br>\n");
      out.write("        <input type = \"text\" name = \"usuario\"><br>\n");
      out.write("        Contraseña: <br>\n");
      out.write("        <input type = \"password\" name = \"contrasena\"><br>\n");
      out.write("\n");
      out.write("        Correo:\n");
      out.write("        <input type = \"email\" name = \"correo\">\n");
      out.write("\n");
      out.write("        <p>\n");
      out.write("            <input type=\"submit\" value=\"Submit\">\n");
      out.write("            <input type=\"reset\">\n");
      out.write("        </p>\n");
      out.write("    </form><hr>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
