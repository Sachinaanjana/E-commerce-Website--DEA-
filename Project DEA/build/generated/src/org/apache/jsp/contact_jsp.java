package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Built Better</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("    <link rel=\"icon\" href=\"images/fevicon.png\" type=\"image/gif\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css\" media=\"screen\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"index.jsp\"><img src=\"images/logo.png\"></a>\n");
      out.write("            </div>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"index.jsp\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"services.jsp\">Services</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"about.jsp\">About Us</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"collections.jsp\">Collections</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"contact.jsp\">Contact Us</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <div>\n");
      out.write("                    <a  href=\"Shoppingcart.jsp\"><img src =\"images/3.jpg\" style=\"width:30px;height:30px;\"></a>\n");
      out.write("                </div>\n");
      out.write("                &nbsp;\n");
      out.write("                &nbsp;\n");
      out.write("                &nbsp;\n");
      out.write("                &nbsp;\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"login.jsp\"><button class=\"button1\" >LOGIN</button></a>\n");
      out.write("                    <a href=\"signup.jsp\"><button class=\"button2\" >SIGN UP</button></a>\n");
      out.write("                </div>\n");
      out.write("            </div>                \n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"contact_section layout_padding\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <h1 class=\"contact_text\">CONTACT US</h1>\n");
      out.write("                    <form action=\"contactservlet\" method=\"post\">\n");
      out.write("                        <div class=\"mail_sectin\">\n");
      out.write("                            <input type=\"text\" class=\"email-bt\" placeholder=\"Name\" name=\"name\">\n");
      out.write("                            <input type=\"text\" class=\"email-bt\" placeholder=\"Email\" name=\"email\">\n");
      out.write("                            <input type=\"text\" class=\"email-bt\" placeholder=\"Phone Number\" name=\"pnumber\">\n");
      out.write("                            <textarea class=\"massage-bt\" placeholder=\"Message\" rows=\"5\" id=\"comment\" name=\"message\"></textarea>\n");
      out.write("                            <div class=\"send_bt\"><a href=\"#\">SEND</a></div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"image_9\"><img src=\"images/img-9.png\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"footer_section layout_padding\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-3 col-sm-6\">\n");
      out.write("                    <div class=\"fooer_logo\"><img src=\"images/footer-logo.png\"></div>\n");
      out.write("                    <p class=\"footer_lorem_text\">\n");
      out.write("                        The premier destination \n");
      out.write("                  for elegant, luxurious and \n");
      out.write("                  chic furniture in Sri Lanka. \n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-sm-6\">\n");
      out.write("                    <h1 class=\"customer_text\">LET US HELP YOU</h1>\n");
      out.write("                    <p class=\"footer_lorem_text\">\n");
      out.write("                        Our team is here to assist \n");
      out.write("                  you with any questions or\n");
      out.write("                  issues you may have. \n");
      out.write("                  Whether you need help navigating\n");
      out.write("                  our website, placing an order, \n");
      out.write("                  or have a general inquiry, \n");
      out.write("                  we're here to help.\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-sm-6\">\n");
      out.write("                    <h1 class=\"customer_text\">INFORMATION</h1>\n");
      out.write("                    <p class=\"footer_lorem_text1\">\n");
      out.write("                        <br>\n");
      out.write("                        Call Us<br>\n");
      out.write("                        +94777582147<br>\n");
      out.write("                        Email Us<br>\n");
      out.write("                        BuildBetter@gmail.com<br>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-sm-6\">\n");
      out.write("                    <h1 class=\"customer_text\">OUR Design</h1>\n");
      out.write("                    <p class=\"footer_lorem_text\">\n");
      out.write("                        At Build Better, we are passionate about providing high-quality furniture that not only enhances your living space but also reflects your unique taste. \n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"copyright_section\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"social_icon\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#\"><img src=\"images/fb-icon.png\"></a></li>\n");
      out.write("                    <li><a href=\"#\"><img src=\"images/twitter-icon.png\"></a></li>\n");
      out.write("                    <li><a href=\"#\"><img src=\"images/instagram-icon.png\"></a></li>\n");
      out.write("                    <li><a href=\"#\"><img src=\"images/linkedin-icon.png\"></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <p class=\"copyright_text\">© 2024 Built Better. All Rights Reserved.<a href=\"https://html.design\"></a></p>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery-3.0.0.min.js\"></script>\n");
      out.write("        <script src=\"js/plugin.js\"></script>\n");
      out.write("        <script src=\"js/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
      out.write("        <script src=\"js/owl.carousel.js\"></script\n");
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
