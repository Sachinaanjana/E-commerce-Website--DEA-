package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("      <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("      \r\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("      <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1\">\r\n");
      out.write("      \r\n");
      out.write("      <title>Built Better</title>\r\n");
      out.write("      <meta name=\"keywords\" content=\"\">\r\n");
      out.write("      <meta name=\"description\" content=\"\">\r\n");
      out.write("      <meta name=\"author\" content=\"\">\r\n");
      out.write("      \r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("      \r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("      \r\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/responsive.css\">\r\n");
      out.write("      \r\n");
      out.write("      <link rel=\"icon\" href=\"images/fevicon.png\" type=\"image/gif\" />\r\n");
      out.write("      \r\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.min.css\">\r\n");
      out.write("      \r\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\">\r\n");
      out.write("      \r\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css\" media=\"screen\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"header_section\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("                    <div class=\"logo\"><a href=\"index.jsp\"><img src=\"images/logo.png\"></a></div>\r\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                        <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"index.jsp\">Home</a>\r\n");
      out.write("                     </li>\r\n");
      out.write("                     <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"services.jsp\">services</a>\r\n");
      out.write("                     </li>\r\n");
      out.write("                     \r\n");
      out.write("                     <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"about.jsp\">About Us</a>\r\n");
      out.write("                     </li>\r\n");
      out.write("                     <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"collections.jsp\">Collections</a>\r\n");
      out.write("                     </li>\r\n");
      out.write("                     <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"contact.jsp\">Contact Us</a>\r\n");
      out.write("                     </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <a  href=\"Shoppingcart.jsp\"><img src =\"images/3.jpg\" style=\"width:30px;height:30px;\"></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        &nbsp;\r\n");
      out.write("                        &nbsp;\r\n");
      out.write("                        &nbsp;\r\n");
      out.write("                        &nbsp;\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <a href=\"login.jsp\"><button class=\"button1\" >LOGIN</button></a>\r\n");
      out.write("                            <a href=\"signup.jsp\"><button class=\"button2\" >SIGN UP</button></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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