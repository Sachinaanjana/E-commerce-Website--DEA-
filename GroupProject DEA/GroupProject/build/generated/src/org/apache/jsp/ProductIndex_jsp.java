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

public final class ProductIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title></title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min1.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/changes.css\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap1.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t");

	/* Checking the user credentials */
	String userName = (String) session.getAttribute("username");
	String password = (String) session.getAttribute("password");
	String userType = (String) session.getAttribute("usertype");

	boolean isValidUser = true;

	if (userType == null || userName == null || password == null || !userType.equals("customer")) {

		isValidUser = false;
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
      out.write("\t<!-- Start of Product Items List -->\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row text-center\">\n");
      out.write("\n");
      out.write("\t\t\t");

			for (ProductBean product : products) {
				int cartQty = new CartServiceImpl().getCartItemCount(userName, product.getProdId());
			
      out.write("\n");
      out.write("\t\t\t<div class=\"col-sm-4\" style='height: 350px;'>\n");
      out.write("\t\t\t\t<div class=\"thumbnail\">\n");
      out.write("\t\t\t\t\t<img src=\"./ShowImage?pid=");
      out.print(product.getProdId());
      out.write("\" alt=\"Product\"\n");
      out.write("\t\t\t\t\t\tstyle=\"height: 150px; max-width: 180px\">\n");
      out.write("\t\t\t\t\t<p class=\"productname\">");
      out.print(product.getProdName());
      out.write("\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t");

					String description = product.getProdInfo();
					description = description.substring(0, Math.min(description.length(), 100));
					
      out.write("\n");
      out.write("\t\t\t\t\t<p class=\"productinfo\">");
      out.print(description);
      out.write("..\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p class=\"price\">\n");
      out.write("\t\t\t\t\t\tRs\n");
      out.write("\t\t\t\t\t\t");
      out.print(product.getProdPrice());
      out.write("\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<form method=\"post\">\n");
      out.write("\t\t\t\t\t\t");

						if (cartQty == 0) {
						
      out.write("\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\"\n");
      out.write("\t\t\t\t\t\t\tformaction=\"./AddtoCart?uid=");
      out.print(userName);
      out.write("&pid=");
      out.print(product.getProdId());
      out.write("&pqty=1\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-success\">Add to Cart</button>\n");
      out.write("\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\"\n");
      out.write("\t\t\t\t\t\t\tformaction=\"./AddtoCart?uid=");
      out.print(userName);
      out.write("&pid=");
      out.print(product.getProdId());
      out.write("&pqty=1\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-primary\">Buy Now</button>\n");
      out.write("\t\t\t\t\t\t");

						} else {
						
      out.write("\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\"\n");
      out.write("\t\t\t\t\t\t\tformaction=\"./AddtoCart?uid=");
      out.print(userName);
      out.write("&pid=");
      out.print(product.getProdId());
      out.write("&pqty=0\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-danger\">Remove From Cart</button>\n");
      out.write("\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" formaction=\"cartDetails.jsp\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-success\">Checkout</button>\n");
      out.write("\t\t\t\t\t\t");

						}
						
      out.write("\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t<br />\n");
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
