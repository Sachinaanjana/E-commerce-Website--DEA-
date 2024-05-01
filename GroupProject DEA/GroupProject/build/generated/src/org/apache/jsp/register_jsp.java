package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Regester</title>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/changes.css\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<link href=\"css/signup.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- //Custom Theme files -->\n");
      out.write("<!-- web font -->\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i\" rel=\"stylesheet\">\n");
      out.write("<!-- //web font -->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    ");

	String message = request.getParameter("message");
	
      out.write("\n");
      out.write("    \n");
      out.write("\t<!-- main -->\n");
      out.write("\t<div class=\"main-w3layouts wrapper\">\n");
      out.write("\t\t<h1>Regester !</h1>\n");
      out.write("\t\t<div class=\"main-agileinfo\">\n");
      out.write("\t\t\t<div class=\"agileits-top\">\n");
      out.write("\t\t\t\t<form action=\"./RegisterSrv\" method=\"post\">\n");
      out.write("                                    \n");
      out.write("                                    ");

					if (message != null) {
					
      out.write("\n");
      out.write("\t\t\t\t\t<p style=\"color: blue;\">\n");
      out.write("\t\t\t\t\t\t");
      out.print(message);
      out.write("\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t");

					}
					
      out.write("\n");
      out.write("                                    \n");
      out.write("                                    <input class=\"text\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\tname=\"username\" class=\"form-control\" id=\"first_name\"\n");
      out.write("\t\t\t\t\t\t\tname=\"first_name\" placeholder=\"Username\" required>\n");
      out.write("                                    \n");
      out.write("                                    <input class=\"text\" type=\"email\"\n");
      out.write("\t\t\t\t\t\t\tname=\"email\" class=\"form-control\" id=\"last_name\" name=\"last_name\"\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Email\" required>\n");
      out.write("                                    \n");
      out.write("                                  <input class=\"text\" type=\"text\" name=\"address\" class=\"form-control\" id=\"last_name\"\n");
      out.write("                                            name=\"last_name\" placeholder=\"Address\" required>\n");
      out.write("                                    \n");
      out.write("                                   <input class=\"text\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\tname=\"mobile\"  id=\"last_name\"\n");
      out.write("\t\t\t\t\t\t\tname=\"last_name\" placeholder=\"Mobile number\" required> \n");
      out.write("                                    \n");
      out.write("                                   \n");
      out.write("                                   <input class=\"text\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\tname=\"pincode\"  id=\"last_name\"\n");
      out.write("\t\t\t\t\t\t\tname=\"last_name\" placeholder=\"Pin Code\" required>\n");
      out.write("                                    \n");
      out.write("                                   \n");
      out.write("                                   <input class=\"text\" type=\"password\"\n");
      out.write("\t\t\t\t\t\t\tname=\"password\" class=\"form-control\" id=\"last_name\"\n");
      out.write("\t\t\t\t\t\t\tname=\"last_name\" placeholder=\"Password\" required>\n");
      out.write("                                   \n");
      out.write("                                   <input class=\"text\"\n");
      out.write("\t\t\t\t\t\t\ttype=\"password\" name=\"confirmPassword\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\tid=\"last_name\" name=\"last_name\" placeholder=\"Confirm Password\" required>\n");
      out.write("                                   \n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"> </div>\n");
      out.write("                        </div> \n");
      out.write("                                        \n");
      out.write("                                   <div class=\"row text-center\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\" style=\"margin-bottom: 2px;\">\n");
      out.write("                                            <button type=\"Reset\" class=\"btn btn-danger\">Reset</button>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-success\">Register</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>     \n");
      out.write("                                        \n");
      out.write("\t\t\t\t</form>\n");
      out.write("                                        <br>\n");
      out.write("\t\t\t\t<p>Already Have Account? <a href=\"login.jsp\"> Login Here!</a></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- copyright -->\n");
      out.write("\t\t<div class=\"colorlibcopy-agile\">\n");
      out.write("\t\t\t<p class=\"copyright_text\">© 2024 Built Better. All Rights Reserved.</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- //copyright -->\n");
      out.write("\t\t<ul class=\"colorlib-bubbles\">\n");
      out.write("\t\t\t<li></li>\n");
      out.write("\t\t\t<li></li>\n");
      out.write("\t\t\t<li></li>\n");
      out.write("\t\t\t<li></li>\n");
      out.write("\t\t\t<li></li>\n");
      out.write("\t\t\t<li></li>\n");
      out.write("\t\t\t<li></li>\n");
      out.write("\t\t\t<li></li>\n");
      out.write("\t\t\t<li></li>\n");
      out.write("\t\t\t<li></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- //main -->\n");
      out.write("</body>\n");
      out.write("</html>");
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
