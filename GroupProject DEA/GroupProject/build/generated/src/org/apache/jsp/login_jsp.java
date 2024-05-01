package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" href=\"fonts/icomoon/style.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/login.css\">\n");
      out.write("<title>Login #2</title>\n");
      out.write("<script nonce=\"ded4d467-199b-4ce7-9e7e-56f656e21cf0\">try{(function(w,d){!function(b,c,d,e){b[d]=b[d]||{};b[d].executed=[];b.zaraz={deferred:[],listeners:[]};b.zaraz.q=[];b.zaraz._f=function(f){return async function(){var g=Array.prototype.slice.call(arguments);b.zaraz.q.push({m:f,a:g})}};for(const h of[\"track\",\"set\",\"debug\"])b.zaraz[h]=b.zaraz._f(h);b.zaraz.init=()=>{var i=c.getElementsByTagName(e)[0],j=c.createElement(e),k=c.getElementsByTagName(\"title\")[0];k&&(b[d].t=c.getElementsByTagName(\"title\")[0].text);b[d].x=Math.random();b[d].w=b.screen.width;b[d].h=b.screen.height;b[d].j=b.innerHeight;b[d].e=b.innerWidth;b[d].l=b.location.href;b[d].r=c.referrer;b[d].k=b.screen.colorDepth;b[d].n=c.characterSet;b[d].o=(new Date).getTimezoneOffset();if(b.dataLayer)for(const o of Object.entries(Object.entries(dataLayer).reduce(((p,q)=>({...p[1],...q[1]})),{})))zaraz.set(o[0],o[1],{scope:\"page\"});b[d].q=[];for(;b.zaraz.q.length;){const r=b.zaraz.q.shift();b[d].q.push(r)}j.defer=!0;for(const s of[localStorage,sessionStorage])Object.keys(s||{}).filter((u=>u.startsWith(\"_zaraz_\"))).forEach((t=>{try{b[d][\"z_\"+t.slice(7)]=JSON.parse(s.getItem(t))}catch{b[d][\"z_\"+t.slice(7)]=s.getItem(t)}}));j.referrerPolicy=\"origin\";j.src=\"/cdn-cgi/zaraz/s.js?z=\"+btoa(encodeURIComponent(JSON.stringify(b[d])));i.parentNode.insertBefore(j,i)};[\"complete\",\"interactive\"].includes(c.readyState)?zaraz.init():b.addEventListener(\"DOMContentLoaded\",zaraz.init)}(w,d,\"zarazData\",\"script\");})(window,document)}catch(e){throw fetch(\"/cdn-cgi/zaraz/t\"),e;};</script></head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");

	String message = request.getParameter("message");
	
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("<div class=\"d-lg-flex half\">\n");
      out.write("<div class=\"bg order-1 order-md-2\" style=\"background-image: url('images/2.jpg');\"></div>\n");
      out.write("<div class=\"contents order-2 order-md-1\">\n");
      out.write("<div class=\"container\">\n");
      out.write("<div class=\"row align-items-center justify-content-center\">\n");
      out.write("<div class=\"col-md-7\">\n");
      out.write("<h3>Login to <strong>Built Better</strong></h3>\n");
      out.write("<p class=\"mb-4\">wording.</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<form action=\"./LoginSrv\" method=\"post\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");

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
      out.write("    \n");
      out.write("    \n");
      out.write("<div class=\"form-group first\">\n");
      out.write("<label for=\"username\">Username</label>\n");
      out.write("\n");
      out.write("<input type=\"email\"\n");
      out.write("placeholder=\"Enter Username\" name=\"username\" class=\"form-control\" id=\"last_name\" required>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("<div class=\"form-group last mb-3\">\n");
      out.write("<label for=\"password\">Password</label>\n");
      out.write("<input type=\"password\" placeholder=\"Enter Password\" name=\"password\" class=\"form-control\"\n");
      out.write(" id=\"last_name\" required>\n");
      out.write("</div>\n");
      out.write("                                        \n");
      out.write("<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-12 form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"userrole\">Login As</label> <select name=\"usertype\"\n");
      out.write("\t\t\t\t\t\t\tid=\"userrole\" class=\"form-control\" required>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"customer\" selected>CUSTOMER</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"admin\">ADMIN</option>\n");
      out.write("\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("    \n");
      out.write("<div class=\"d-flex mb-5 align-items-center\">\n");
      out.write("<label class=\"control control--checkbox mb-0\"><span class=\"caption\">Remember me</span>\n");
      out.write("<input type=\"checkbox\" checked=\"checked\" />\n");
      out.write("<div class=\"control__indicator\"></div>\n");
      out.write("</label>\n");
      out.write("    \n");
      out.write("<span class=\"ml-auto\"><a href=\"#\" class=\"forgot-pass\">Forgot Password</a></span>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("<input type=\"submit\" value=\"Log In\" class=\"btn btn-block btn-primary\" style=\"background-color: #eba636;; color: white;\">\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("<script src=\"js/popper.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/main.js\"></script>\n");
      out.write("<script defer src=\"https://static.cloudflareinsights.com/beacon.min.js/v84a3a4012de94ce1a686ba8c167c359c1696973893317\" integrity=\"sha512-euoFGowhlaLqXsPWQ48qSkBSCFs3DPRyiwVu3FjR96cMPx+Fr+gpWRhIafcHwqwCqWS42RZhIudOvEI+Ckf6MA==\" data-cf-beacon='{\"rayId\":\"86f30308b86fb2fd\",\"version\":\"2024.3.0\",\"token\":\"cd0b4b3a733644fc843ef0b185f98241\"}' crossorigin=\"anonymous\"></script>\n");
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
