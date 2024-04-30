<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Built Better</title>
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
            <div class="logo">
                <a href="index.jsp"><img src="images/logo.png"></a>
            </div>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="index.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="services.jsp">Services</a>
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
                    <form action="contactservlet" method="post">
                        <div class="mail_sectin">
                            <input type="text" class="email-bt" placeholder="Name" name="name">
                            <input type="text" class="email-bt" placeholder="Email" name="email">
                            <input type="text" class="email-bt" placeholder="Phone Number" name="pnumber">
                            <textarea class="massage-bt" placeholder="Message" rows="5" id="comment" name="message"></textarea>
                            <div class="send_bt"><a href="#">SEND</a></div>
                        </div>
                    </form>
                </div>
                <div class="col-md-6">
                    <div class="image_9"><img src="images/img-9.png"></div>
                </div>
            </div>
        </div>
    </div>
    <div class="footer_section layout_padding">
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-sm-6">
                    <div class="fooer_logo"><img src="images/footer-logo.png"></div>
                    <p class="footer_lorem_text">
                        The premier destination 
                  for elegant, luxurious and 
                  chic furniture in Sri Lanka. 
                    </p>
                </div>
                <div class="col-lg-3 col-sm-6">
                    <h1 class="customer_text">LET US HELP YOU</h1>
                    <p class="footer_lorem_text">
                        Our team is here to assist 
                  you with any questions or
                  issues you may have. 
                  Whether you need help navigating
                  our website, placing an order, 
                  or have a general inquiry, 
                  we're here to help.
                    </p>
                </div>
                <div class="col-lg-3 col-sm-6">
                    <h1 class="customer_text">INFORMATION</h1>
                    <p class="footer_lorem_text1">
                        <br>
                        Call Us<br>
                        +94777582147<br>
                        Email Us<br>
                        BuildBetter@gmail.com<br>
                    </p>
                </div>
                <div class="col-lg-3 col-sm-6">
                    <h1 class="customer_text">OUR Design</h1>
                    <p class="footer_lorem_text">
                        At Build Better, we are passionate about providing high-quality furniture that not only enhances your living space but also reflects your unique taste. 
                    </p>
                </div>
            </div>
        </div>
    </div>
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
            <p class="copyright_text">© 2024 Built Better. All Rights Reserved.<a href="https://html.design"></a></p>
        </div>
        <script src="js/jquery.min.js"></script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.bundle.min.js"></script>
        <script src="js/jquery-3.0.0.min.js"></script>
        <script src="js/plugin.js"></script>
        <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
        <script src="js/custom.js"></script>
        <script src="js/owl.carousel.js"></script
