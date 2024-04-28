<%-- 
    Document   : contact
    Created on : Apr 28, 2024, 2:12:48 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="viewport" content="initial-scale=1, maximum-scale=1">
      
      <title>Built Better</title>
      <meta name="keywords" content="">
      <meta name="description" content="">
      <meta name="author" content="">
      
      <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
      
      <link rel="stylesheet" type="text/css" href="css/style.css">
      
      <link rel="stylesheet" href="css/responsive.css">
      
      <link rel="icon" href="images/fevicon.png" type="image/gif" />
      
      <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
      
      <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
      
      <link rel="stylesheet" href="css/owl.carousel.min.css">
      <link rel="stylesheet" href="css/owl.theme.default.min.css">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
    </head>
    <body>
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
        <div class="contact_section layout_padding">
            <div class="container">
                <div class="row">
                    <div class="col-md-6">
                        <h1 class="contact_text">CONTACT US</h1>
                        <div class="mail_sectin">
                            <input type="text" class="email-bt" placeholder="Name" name="Name">
                            <input type="text" class="email-bt" placeholder="Email" name="Name">
                            <input type="text" class="email-bt" placeholder="Phone Number" name="Name">
                            <textarea class="massage-bt" placeholder="Massage" rows="5" id="comment" name="Massage"></textarea>
                            <div class="send_bt"><a href="#">SEND</a></div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="image_9"><img src="images/img-9.png"></div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
