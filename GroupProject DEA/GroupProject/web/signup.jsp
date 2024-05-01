<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Sign Up Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

<link href="css/signup.css" rel="stylesheet" type="text/css" media="all" />


<link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">

</head>
<body>
	
	<div class="main-w3layouts wrapper">
		<h1>Sign Up !</h1>
		<div class="main-agileinfo">
			<div class="agileits-top">
				<form action="register" method="post">
    <div class="form-group">
        <label for="firstName">First Name:</label>
        <input class="text" type="text" id="firstName" name="firstName" placeholder="First Name" required>
    </div>
    <div class="form-group">
        <label for="lastName">Last Name:</label>
        <input class="text" type="text" id="lastName" name="lastName" placeholder="Last Name" required>
    </div>
    <div class="form-group">
        <label for="email">Email:</label>
        <input class="text" type="email" id="email" name="email" placeholder="Email" required>
    </div>
    <div class="form-group">
        <label for="gender">Gender:</label>
        <input class="text" type="text" id="gender" name="gender" placeholder="Gender" required>
    </div>
<div class="form-group">
        <label for="gender">Mobile:</label>
        <input class="text" type="text" id="gender" name="mobile" placeholder="Mobile" required="">
    </div>
    <div class="form-group">
        <label for="address">Address:</label>
        <input class="text" type="text" id="address" name="address" placeholder="Address" required>
    </div>
    <div class="form-group">
        <label for="password">Password:</label>
        <input class="text" type="password" id="password" name="password" placeholder="Password" required>
    </div>
    <div class="wthree-text">
        <label class="anim">
            <input type="checkbox" class="checkbox" required>
            <span>I Agree To The Terms & Conditions</span>
        </label>
        <div class="clear"></div>
    </div>
    <input type="submit" value="SIGNUP">
</form>

				<p>Already Have Account? <a href="login.jsp"> Login Here!</a></p>
			</div>
		</div>
		
		<div class="colorlibcopy-agile">
			<p class="copyright_text">© 2024 Built Better. All Rights Reserved.</p>
		</div>
		
		<ul class="colorlib-bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>
	
</body>
</html>