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

public final class cartDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Cart Details</title>\n");
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
      out.write("\n");
      out.write("\t");

	/* Checking the user credentials */
	String userName = (String) session.getAttribute("username");
	String password = (String) session.getAttribute("password");

	if (userName == null || password == null) {

		response.sendRedirect("login.jsp?message=Session Expired, Login Again!!");

	}

	String addS = request.getParameter("add");
	if (addS != null) {

		int add = Integer.parseInt(addS);
		String uid = request.getParameter("uid");
		String pid = request.getParameter("pid");
		int avail = Integer.parseInt(request.getParameter("avail"));
		int cartQty = Integer.parseInt(request.getParameter("qty"));
		CartServiceImpl cart = new CartServiceImpl();

		if (add == 1) {
			//Add Product into the cart
			cartQty += 1;
			if (cartQty <= avail) {
		cart.addProductToCart(uid, pid, 1);
			} else {
		response.sendRedirect("./AddtoCart?pid=" + pid + "&pqty=" + cartQty);
			}
		} else if (add == 0) {
			//Remove Product from the cart
			cart.removeProductFromCart(uid, pid);
		}
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
      out.write("\t\tstyle=\"color: green; font-size: 24px; font-weight: bold;\">Cart\n");
      out.write("\t\tItems</div>\n");
      out.write("\t<!-- <script>document.getElementById('mycart').innerHTML='<i data-count=\"20\" class=\"fa fa-shopping-cart fa-3x icon-white badge\" style=\"background-color:#333;margin:0px;padding:0px; margin-top:5px;\"></i>'</script>\n");
      out.write(" -->\n");
      out.write("\t<!-- Start of Product Items List -->\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t<table class=\"table table-hover\">\n");
      out.write("\t\t\t<thead\n");
      out.write("\t\t\t\tstyle=\"background-color: #186188; color: white; font-size: 16px; font-weight: bold;\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>Picture</th>\n");
      out.write("\t\t\t\t\t<th>Products</th>\n");
      out.write("\t\t\t\t\t<th>Price</th>\n");
      out.write("\t\t\t\t\t<th>Quantity</th>\n");
      out.write("\t\t\t\t\t<th>Add</th>\n");
      out.write("\t\t\t\t\t<th>Remove</th>\n");
      out.write("\t\t\t\t\t<th>Amount</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</thead>\n");
      out.write("\t\t\t<tbody\n");
      out.write("\t\t\t\tstyle=\"background-color: white; font-size: 15px; font-weight: bold;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

				CartServiceImpl cart = new CartServiceImpl();
				List<CartBean> cartItems = new ArrayList<CartBean>();
				cartItems = cart.getAllCartItems(userName);
				double totAmount = 0;
				for (CartBean item : cartItems) {

					String prodId = item.getProdId();

					int prodQuantity = item.getQuantity();

					ProductBean product = new ProductServiceImpl().getProductDetails(prodId);

					double currAmount = product.getProdPrice() * prodQuantity;

					totAmount += currAmount;

					if (prodQuantity > 0) {
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td><img src=\"./ShowImage?pid=");
      out.print(product.getProdId());
      out.write("\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 50px; height: 50px;\"></td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(product.getProdName());
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(product.getProdPrice());
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td><form method=\"post\" action=\"./UpdateToCart\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"number\" name=\"pqty\" value=\"");
      out.print(prodQuantity);
      out.write("\"\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"max-width: 70px;\" min=\"0\"> <input type=\"hidden\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"pid\" value=\"");
      out.print(product.getProdId());
      out.write("\"> <input\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"submit\" name=\"Update\" value=\"Update\"\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"max-width: 80px;\">\n");
      out.write("\t\t\t\t\t\t</form></td>\n");
      out.write("\t\t\t\t\t<td><a\n");
      out.write("\t\t\t\t\t\thref=\"cartDetails.jsp?add=1&uid=");
      out.print(userName);
      out.write("&pid=");
      out.print(product.getProdId());
      out.write("&avail=");
      out.print(product.getProdQuantity());
      out.write("&qty=");
      out.print(prodQuantity);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-plus\"></i></a></td>\n");
      out.write("\t\t\t\t\t<td><a\n");
      out.write("\t\t\t\t\t\thref=\"cartDetails.jsp?add=0&uid=");
      out.print(userName);
      out.write("&pid=");
      out.print(product.getProdId());
      out.write("&avail=");
      out.print(product.getProdQuantity());
      out.write("&qty=");
      out.print(prodQuantity);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-minus\"></i></a></td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(currAmount);
      out.write("</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t");

				}
				}
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<tr style=\"background-color: grey; color: white;\">\n");
      out.write("\t\t\t\t\t<td colspan=\"6\" style=\"text-align: center;\">Total Amount to\n");
      out.write("\t\t\t\t\t\tPay (in Rupees)</td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(totAmount);
      out.write("</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t");

				if (totAmount != 0) {
				
      out.write("\n");
      out.write("\t\t\t\t<tr style=\"background-color: grey; color: white;\">\n");
      out.write("\t\t\t\t\t<td colspan=\"4\" style=\"text-align: center;\">\n");
      out.write("\t\t\t\t\t<td><form method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t<button formaction=\"userHome.jsp\"\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"background-color: black; color: white;\">Cancel</button>\n");
      out.write("\t\t\t\t\t\t</form></td>\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" align=\"center\"><form method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t<button style=\"background-color: blue; color: white;\"\n");
      out.write("\t\t\t\t\t\t\t\tformaction=\"payment.jsp?amount=");
      out.print(totAmount);
      out.write("\">Pay Now</button>\n");
      out.write("\t\t\t\t\t\t</form></td>\n");
      out.write("\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t");

				}
				
      out.write("\n");
      out.write("\t\t\t</tbody>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- ENd of Product Items List -->\n");
      out.write("\n");
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
