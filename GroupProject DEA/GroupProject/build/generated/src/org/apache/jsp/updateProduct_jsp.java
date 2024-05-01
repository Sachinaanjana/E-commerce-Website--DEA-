package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import service.impl.*;
import services.*;
import beans.*;
import java.util.*;
import javax.servlet.ServletOutputStream;
import java.io.*;

public final class updateProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/footer.html");
  }

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
      out.write("<title>Update Product</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/changes.css\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color: #E6F9E6;\">\n");
      out.write("\t");

	/* Checking the user credentials */
	String utype = (String) session.getAttribute("usertype");
	String uname = (String) session.getAttribute("username");
	String pwd = (String) session.getAttribute("password");
	String prodid = request.getParameter("prodid");
	ProductBean product = new ProductServiceImpl().getProductDetails(prodid);
	if (prodid == null || product == null) {
		response.sendRedirect("updateProductById.jsp?message=Please Enter a valid product Id");
		return;
	} else if (utype == null || !utype.equals("admin")) {
		response.sendRedirect("login.jsp?message=Access Denied, Login as admin!!");
		return;
	} else if (uname == null || pwd == null) {
		response.sendRedirect("login.jsp?message=Session Expired, Login Again!!");
		return;
	}
	
      out.write("\n");
      out.write("\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\t");

	String message = request.getParameter("message");
	
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row\"\n");
      out.write("\t\t\tstyle=\"margin-top: 5px; margin-left: 2px; margin-right: 2px;\">\n");
      out.write("\t\t\t<form action=\"./UpdateProductSrv\" method=\"post\"\n");
      out.write("\t\t\t\tclass=\"col-md-6 col-md-offset-3\"\n");
      out.write("\t\t\t\tstyle=\"border: 2px solid black; border-radius: 10px; background-color: #FFE5CC; padding: 10px;\">\n");
      out.write("\t\t\t\t<div style=\"font-weight: bold;\" class=\"text-center\">\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<img src=\"./ShowImage?pid=");
      out.print(product.getProdId());
      out.write("\"\n");
      out.write("\t\t\t\t\t\t\talt=\"Product Image\" height=\"100px\" />\n");
      out.write("\t\t\t\t\t\t<h2 style=\"color: green;\">Product Update Form</h2>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t");

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
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"pid\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(product.getProdId());
      out.write("\" id=\"last_name\" required>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"last_name\">Product Name</label> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Enter Product Name\" name=\"name\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(product.getProdName());
      out.write("\" id=\"last_name\" required>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 form-group\">\n");
      out.write("\t\t\t\t\t\t");

						String ptype = product.getProdType();
						
      out.write("\n");
      out.write("\t\t\t\t\t\t<label for=\"producttype\">Product Type</label> <select name=\"type\"\n");
      out.write("\t\t\t\t\t\t\tid=\"producttype\" class=\"form-control\" required>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"PANTRY\"\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print("PANTRY".equalsIgnoreCase(ptype) ? "selected" : "");
      out.write(">PANTRY</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"DINING ROOM\"\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print("DINING ROOM".equalsIgnoreCase(ptype) ? "selected" : "");
      out.write(">DINING ROOM</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"LIVING ROOM\"\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print("LIVING ROOM".equalsIgnoreCase(ptype) ? "selected" : "");
      out.write(">LIVING ROOM</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"BEDROOM\"\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print("BEDROOM".equalsIgnoreCase(ptype) ? "selected" : "");
      out.write(">BEDROOM</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"other\"\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print("other".equalsIgnoreCase(ptype) ? "selected" : "");
      out.write(">Some\n");
      out.write("\t\t\t\t\t\t\t\tOther Appliances</option>\n");
      out.write("\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"last_name\">Product Description</label>\n");
      out.write("\t\t\t\t\t<textarea name=\"info\" class=\"form-control text-align-left\"\n");
      out.write("\t\t\t\t\t\tid=\"last_name\" required>");
      out.print(product.getProdInfo());
      out.write("</textarea>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"last_name\">Unit Price</label> <input type=\"number\"\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(product.getProdPrice());
      out.write("\"\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Enter Unit Price\" name=\"price\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\tid=\"last_name\" required>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"last_name\">Stock Quantity</label> <input type=\"number\"\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(product.getProdQuantity());
      out.write("\"\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Enter Stock Quantity\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\tid=\"last_name\" name=\"quantity\" required>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row text-center\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4\" style=\"margin-bottom: 2px;\">\n");
      out.write("\t\t\t\t\t\t<button formaction=\"adminViewProduct.jsp\" class=\"btn btn-danger\">Cancel</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-success\">Update\n");
      out.write("\t\t\t\t\t\t\tProduct</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Shoping Center</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/changes.css\">\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color: #E6F9E6;\">\n");
      out.write("\t<!-- Start the footer Contacts -->\n");
      out.write("\t<!-- <a name=\"contact\"></a> -->\n");
      out.write("\t<div class=\"container-fluid\"\n");
      out.write("\t\tstyle=\"background-color: #454545; color: white; margin-top: 200px;\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h3 class=\"text-center\">Contact</h3>\n");
      out.write("\t\t\t<p class=\"text-center\">\n");
      out.write("\t\t\t\t<em>We love our fans!</em>\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t\t<div class=\"row test\">\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t<p>Fan? Drop a note.</p>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-map-marker\"></span>BUILT BETTER\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-phone\"></span>Phone: +94\n");
      out.write("\t\t\t\t\t\t779024903\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-envelope\"></span>Email:\n");
      out.write("\t\t\t\t\t\tbuiltbetter@gmail.com\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-copyright-mark\"></span>\n");
      out.write("\t\t\t\t\t\tBUILT BETTER - 2024\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t\t\t<form action=\"fansMessage\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"form-control\" id=\"name\" name=\"name\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Name\" type=\"text\" required>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"form-control\" id=\"email\" name=\"email\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Email\" type=\"email\" required>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<textarea class=\"form-control\" id=\"comments\" name=\"comments\"\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Comment\" rows=\"5\" required></textarea>\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn pull-right\" type=\"submit\">Send</button>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- End of Contact or about us -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
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
