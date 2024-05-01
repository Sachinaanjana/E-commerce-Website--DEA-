package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.shashi.service.impl.*;
import com.shashi.service.*;
import com.shashi.beans.*;
import java.util.*;
import javax.servlet.ServletOutputStream;
import java.io.*;

public final class adminViewProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>View Products</title>\n");
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
      out.write("\n");
      out.write("\t");

	/* Checking the user credentials */
	String userName = (String) session.getAttribute("username");
	String password = (String) session.getAttribute("password");
	String userType = (String) session.getAttribute("usertype");

	if (userType == null || !userType.equals("admin")) {

		response.sendRedirect("login.jsp?message=Access Denied, Login as admin!!");

	}

	else if (userName == null || password == null) {

		response.sendRedirect("login.jsp?message=Session Expired, Login Again!!");

	}
	ProductServiceImpl prodDao = new ProductServiceImpl();
	List<ProductBean> products = new ArrayList<ProductBean>();

	String search = request.getParameter("search");
	String type = request.getParameter("type");
	String message = "All Products";
	if (search != null) {
		products = prodDao.searchAllProducts(search);
		message = "Showing Results for '" + search + "'";
	} else if (type != null) {
		products = prodDao.getAllProductsByType(type);
		message = "Showing Results for '" + type + "'";
	} else {
		products = prodDao.getAllProducts();
	}
	if (products.isEmpty()) {
		message = "No items found for the search '" + (search != null ? search : type) + "'";
		products = prodDao.getAllProducts();
	}
	
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\t<div class=\"text-center\"\n");
      out.write("\t\tstyle=\"color: black; font-size: 14px; font-weight: bold;\">");
      out.print(message);
      out.write("</div>\n");
      out.write("\t<!-- Start of Product Items List -->\n");
      out.write("\t<div class=\"container\" style=\"background-color: #E6F9E6;\">\n");
      out.write("\t\t<div class=\"row text-center\">\n");
      out.write("\n");
      out.write("\t\t\t");

			for (ProductBean product : products) {
			
      out.write("\n");
      out.write("\t\t\t<div class=\"col-sm-4\" style='height: 450px;'>\n");
      out.write("\t\t\t\t<div class=\"thumbnail\">\n");
      out.write("\t\t\t\t\t<img src=\"./ShowImage?pid=");
      out.print(product.getProdId());
      out.write("\" alt=\"Product\"\n");
      out.write("\t\t\t\t\t\tstyle=\"height: 150px; max-width: 180px;\">\n");
      out.write("\t\t\t\t\t<p class=\"productname\">");
      out.print(product.getProdName());
      out.write("\n");
      out.write("\t\t\t\t\t\t(\n");
      out.write("\t\t\t\t\t\t");
      out.print(product.getProdId());
      out.write("\n");
      out.write("\t\t\t\t\t\t)\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p class=\"productinfo\">");
      out.print(product.getProdInfo());
      out.write("</p>\n");
      out.write("\t\t\t\t\t<p class=\"price\">\n");
      out.write("\t\t\t\t\t\tRs\n");
      out.write("\t\t\t\t\t\t");
      out.print(product.getProdPrice());
      out.write("\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<form method=\"post\">\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\"\n");
      out.write("\t\t\t\t\t\t\tformaction=\"./RemoveProductSrv?prodid=");
      out.print(product.getProdId());
      out.write("\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-success btn-danger\">Remove Product</button>\n");
      out.write("\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                <br><br><button type=\"submit\"\n");
      out.write("\t\t\t\t\t\t\tformaction=\"updateProduct.jsp?prodid=");
      out.print(product.getProdId());
      out.write("\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-success\">Update Product</button>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t");

			}
			
      out.write("\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- ENd of Product Items List -->\n");
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
