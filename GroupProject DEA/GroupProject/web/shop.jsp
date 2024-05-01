<%@page import="service.impl.CartServiceImpl"%>
<%@page import="java.util.ArrayList"%>
<%@page import="beans.ProductBean"%>
<%@page import="java.util.List"%>
<%@page import="service.impl.ProductServiceImpl"%>
<!DOCTYPE html>
<html lang="en">
   <head>
      <!-- basic -->
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <!-- mobile metas -->
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="viewport" content="initial-scale=1, maximum-scale=1">
      <!-- site metas -->
      <title>Contact</title>
      <meta name="keywords" content="">
      <meta name="description" content="">
      <meta name="author" content="">
      <!-- bootstrap css -->
      <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
      <!-- style css -->
      <link rel="stylesheet" type="text/css" href="css/style.css">
      <!-- Responsive-->
      <link rel="stylesheet" href="css/responsive.css">
      <!-- fevicon -->
      <link rel="icon" href="images/fevicon.png" type="image/gif" />
      <!-- Scrollbar Custom CSS -->
      <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
      <!-- Tweaks for older IEs-->
      <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
      <!-- owl stylesheets --> 
      <link rel="stylesheet" href="css/owl.carousel.min.css">
      <link rel="stylesheet" href="css/owl.theme.default.min.css">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
   </head>
   <body>
       <%
    /* Checking the user credentials */
    String userName = (String) session.getAttribute("username");
    String password = (String) session.getAttribute("password");


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
    %>
<div class="header_section">
         <div class="container-fluid">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
               <div class="logo"><a href="index.jsp"><img src="images/logo.png"></a></div>
               <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
               <span class="navbar-toggler-icon"></span>
               </button>
               <div class="collapse navbar-collapse" id="navbarSupportedContent">
                  <ul class="navbar-nav mr-auto">
                     <li class="nav-item">
                        <a class="nav-link" href="index.jsp">Home</a>
                     </li>
                     <li class="nav-item">
                        <a class="nav-link" href="services.jsp">services</a>
                     </li>
                     
                     <li class="nav-item">
                        <a class="nav-link" href="about.jsp">About Us</a>
                     </li>
                     <li class="nav-item">
                        <a class="nav-link" href="shop.jsp">Shop</a>
                     </li>
                     <li class="nav-item">
                        <a class="nav-link" href="collections.jsp">Collections</a>
                     </li>
                     <li class="nav-item">
                        <a class="nav-link" href="contact.jsp">Contact Us</a>
                     </li>
                  </ul>
                   <div>
                      <a  href="Shoppingcart.jsp"><img src ="images/3.jpg" style="width:30px;height:30px;"></a>
                  </div>
                   &nbsp;
                    &nbsp;
                     &nbsp;
                      &nbsp;
                  <div>
                   <a href="login.jsp"><button class="button1" >LOGIN</button></a>
                  <a href="signup.jsp"><button class="button2" >SIGN UP</button></a>
                  </div>
                      
               </div>
            </nav>
         </div>
      </div>
      <div>
      <!-- header section end -->
      <!-- furnitures section start -->
      <div class="furnitures_section layout_padding">
         <div class="container">
            <h1 class="our_text">OUR furnitures</h1>
            <p class="ipsum_text">There are many variations of passages of Lorem Ipsum </p>
              <div class="text-center"
        style="color: black; font-size: 14px; font-weight: bold;"><%= message %></div>

    <div class="container">
        <div class="row text-center">

            <%
            for (ProductBean product : products) {
                int cartQty = new CartServiceImpl().getCartItemCount(userName, product.getProdId());
            %>
            <div class="col-sm-4" style='height: 450px;'>
                <div class="thumbnail">
                    <img src="./ShowImage?pid=<%= product.getProdId() %>" alt="Product"
                        style="height: 150px; max-width: 180px">
                    <p class="productname"><%= product.getProdName() %></p>
                    <%
                    String description = product.getProdInfo();
                    description = description.substring(0, Math.min(description.length(), 100));
                    %>
                    <p class="productinfo"><%= description %>..</p>
                    <p class="price">Rs <%= product.getProdPrice() %></p>
                    <form method="post">
                        <%
                        if (cartQty == 0) {
                        %>
                        <button type="submit"
                            formaction="./AddtoCart?uid=<%= userName %>&pid=<%= product.getProdId() %>&pqty=1"
                            class="btn btn-success">Add to Cart</button>
                        &nbsp;&nbsp;&nbsp;
                        <button type="submit"
                            formaction="./AddtoCart?uid=<%= userName %>&pid=<%= product.getProdId() %>&pqty=1"
                            class="btn btn-primary">Buy Now</button>
                        <%
                        } else {
                        %>
                        <button type="submit"
                            formaction="./AddtoCart?uid=<%= userName %>&pid=<%= product.getProdId() %>&pqty=0"
                            class="btn btn-primary btn-danger">Remove From Cart</button>
                        &nbsp;&nbsp;&nbsp;
                        <button type="submit" formaction="cartDetails.jsp"
                            class="btn btn-success">Checkout</button>
                        <%
                        }
                        %>
                    </form>
                    <br />
                </div>
            </div>
            <%
            }
            %>
        </div>
    </div>
         </div>
      </div>
      <!-- furnitures section end -->
      <!-- footer section start -->
      <div class="footer_section layout_padding">
         <div class="container">
            <div class="row">
               <div class="col-lg-3 col-sm-6">
                  <div class="fooer_logo"><img src="images/footer-logo.png"></div>
                  <p class="footer_lorem_text">There are many variat
                     ions of passages of L
                     orem Ipsum available
                     , but the majority h
                     ave suffered altera
                     tion in some form, by 
                  </p>
               </div>
               <div class="col-lg-3 col-sm-6">
                  <h1 class="customer_text">LET US HELP YOU</h1>
                  <p class="footer_lorem_text">There are many variat
                     ions of passages of L
                     orem Ipsum available
                     , but the majority h
                     ave suffered altera
                     tion in some form, by 
                  </p>
               </div>
               <div class="col-lg-3 col-sm-6">
                  <h1 class="customer_text">INFORMATION</h1>
                  <p class="footer_lorem_text1">About Us<br>
                     Careers<br>
                     Sell on shopee<br>
                     Press & News<br>
                     Competitions<br>
                     Terms & Conditions
                  </p>
               </div>
               <div class="col-lg-3 col-sm-6">
                  <h1 class="customer_text">OUR Design</h1>
                  <p class="footer_lorem_text">There are many variat
                     ions of passages of L
                     orem Ipsum available
                     , but the majority h
                     ave suffered altera
                     tion in some form, by 
                  </p>
               </div>
            </div>
            <div class="input-group mb-3">
               <input type="text" class="form-control" placeholder="Enter your email" aria-label="Enter your email" aria-describedby="basic-addon2">
               <div class="input-group-append">
                  <span class="input-group-text" id="basic-addon2"><a href="#">Subscribe</a></span>
               </div>
            </div>
         </div>
      </div>
      <!--  footer section end -->
      <!-- copyright section start -->
      <div class="copyright_section">
      <div class="container">
         <div class="social_icon">
            <ul>
               <li><a href="#"><img src="images/fb-icon.png"></a></li>
               <li><a href="#"><img src="images/twitter-icon.png"></a></li>
               <li><a href="#"><img src="images/instagram-icon.png"></a></li>
               <li><a href="#"><img src="images/linkedin-icon.png"></a></li>
            </ul>
         </div>
         <p class="copyright_text">2020 All Rights Reserved. Design by <a href="https://html.design">Free html  Templates</a></p>
      </div>
      <!-- copyright section end -->
      <!-- Javascript files-->
      <script src="js/jquery.min.js"></script>
      <script src="js/popper.min.js"></script>
      <script src="js/bootstrap.bundle.min.js"></script>
      <script src="js/jquery-3.0.0.min.js"></script>
      <script src="js/plugin.js"></script>
      <!-- sidebar -->
      <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
      <script src="js/custom.js"></script>
      <!-- javascript --> 
      <script src="js/owl.carousel.js"></script>
      <script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>    
   </body>
</html>