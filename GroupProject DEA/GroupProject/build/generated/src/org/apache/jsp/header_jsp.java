package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import service.impl.*;
import services.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Logout Header</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/changes.css\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color: #E6F9E6;\">\n");
      out.write("\t<!--Company Header Starting  -->\n");
      out.write("\t<div class=\"container-fluid text-center\"\n");
      out.write("\t\tstyle=\"margin-top: 45px; background-color: #fcec19; color: white; padding: 5px;\">\n");
      out.write("\t\t<h2>BUILT BETTER</h2>\n");
      out.write("\t\t<h6>We Specialize in Furnitures</h6>\n");
      out.write("\t\t<form class=\"form-inline\" action=\"index.jsp\" method=\"get\">\n");
      out.write("\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control\" size=\"50\" name=\"search\"\n");
      out.write("\t\t\t\t\tplaceholder=\"Search Items\" required>\n");
      out.write("\t\t\t\t<div class=\"input-group-btn\">\n");
      out.write("\t\t\t\t\t<input type=\"submit\" class=\"btn btn-danger\" value=\"Search\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t<p align=\"center\"\n");
      out.write("\t\t\tstyle=\"color: blue; font-weight: bold; margin-top: 5px; margin-bottom: 5px;\"\n");
      out.write("\t\t\tid=\"message\"></p>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- Company Header Ending -->\n");
      out.write("\n");
      out.write("\t");

	/* Checking the user credentials */
	String userType = (String) session.getAttribute("usertype");
	if (userType == null) { //LOGGED OUT
	
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Starting Navigation Bar -->\n");
      out.write("\t<nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\t\tdata-target=\"#myNavbar\">\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"index.jsp\"><span\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-home\">&nbsp;</span>Shopping Center</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t<li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"register.jsp\">Register</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"index.jsp\">Products</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\">Category <span class=\"caret\"></span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"index.jsp?type=PANTRY\">PANTRY</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"index.jsp?type=DINING ROOM\">DINING ROOM</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"index.jsp?type=LIVING ROOM\">LIVING ROOM</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"index.jsp?type=BEDROOM\">BEDROOM</a></li>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\t");

	} else if ("customer".equalsIgnoreCase(userType)) { //CUSTOMER HEADER

	int notf = new CartServiceImpl().getCartCount((String) session.getAttribute("username"));
	
      out.write("\n");
      out.write("\t<nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\t\tdata-target=\"#myNavbar\">\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"userHome.jsp\"><span\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-home\">&nbsp;</span>Shopping Center</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t<li><a href=\"userHome.jsp\"><span\n");
      out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-home\">Products</span></a></li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\">Category <span class=\"caret\"></span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"index.jsp?type=PANTRY\">PANTRY</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"index.jsp?type=DINING ROOM\">DINING ROOM</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"index.jsp?type=LIVING ROOM\">LIVING ROOM</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"index.jsp?type=BEDROOM\">BEDROOM</a></li>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t");

					if (notf == 0) {
					
      out.write("\n");
      out.write("\t\t\t\t\t<li><a href=\"cartDetails.jsp\"> <span\n");
      out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-shopping-cart\"></span>Cart\n");
      out.write("\t\t\t\t\t</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t");

					} else {
					
      out.write("\n");
      out.write("\t\t\t\t\t<li><a href=\"cartDetails.jsp\"\n");
      out.write("\t\t\t\t\t\tstyle=\"margin: 0px; padding: 0px;\" id=\"mycart\"><i\n");
      out.write("\t\t\t\t\t\t\tdata-count=\"");
      out.print(notf);
      out.write("\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-shopping-cart fa-3x icon-white badge\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"background-color: #333; margin: 0px; padding: 0px; padding-bottom: 0px; padding-top: 5px;\">\n");
      out.write("\t\t\t\t\t\t</i></a></li>\n");
      out.write("\t\t\t\t\t");

					}
					
      out.write("\n");
      out.write("\t\t\t\t\t<li><a href=\"orderDetails.jsp\">Orders</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"userProfile.jsp\">Profile</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"./LogoutSrv\">Logout</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\t");

	} else { //ADMIN HEADER
	
      out.write("\n");
      out.write("\t<nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\t\tdata-target=\"#myNavbar\">\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"adminViewProduct.jsp\"><span\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-home\">&nbsp;</span>Shopping Center</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t<li><a href=\"adminViewProduct.jsp\">Products</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\">Category <span class=\"caret\"></span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"adminViewProduct.jsp?type=PANTRY\">PANTRY</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"adminViewProduct.jsp?type=DINING ROOM\">DINING ROOM</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"adminViewProduct.jsp?type=LIVING ROOM\">LIVING ROOM</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"adminViewProduct.jsp?type=BEDROOM\">BEDROOM</a></li>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"adminStock.jsp\">Stock</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"shippedItems.jsp\">Shipped</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"unshippedItems.jsp\">Orders</a></li>\n");
      out.write("\t\t\t\t\t<!-- <li><a href=\"\"> <span class=\"glyphicon glyphicon-shopping-cart\"></span>&nbsp;Cart</a></li> -->\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\">Update Items <span\n");
      out.write("\t\t\t\t\t\t\tclass=\"caret\"></span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"addProduct.jsp\">Add Product</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"removeProduct.jsp\">Remove Product</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"updateProductById.jsp\">Update Product</a></li>\n");
      out.write("\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"./LogoutSrv\">Logout</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\t");

	}
	
      out.write("\n");
      out.write("\t<!-- End of Navigation Bar -->\n");
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
