<!DOCTYPE html>
<html>
<head>
<title>Register</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<link rel="stylesheet" href="css/changes.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/signup.css" rel="stylesheet" type="text/css" media="all" />
<link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">
</head>
<body>
    
    <%
	String message = request.getParameter("message");
	%>
    
	<div class="main-w3layouts wrapper">
		<h1>Register !</h1>
		<div class="main-agileinfo">
			<div class="agileits-top">
				<form action="./RegisterSrv" method="post">
                                    
                                    <%
					if (message != null) {
					%>
					<p style="color: blue;">
						<%=message%>
					</p>
					<%
					}
					%>
                                    
                                    <input class="text" type="text"
							name="username" class="form-control" id="first_name"
							name="first_name" placeholder="Username" required>
                                    
                                    <input class="text" type="email"
							name="email" class="form-control" id="last_name" name="last_name"
							placeholder="Email" required>
                                    
                                  <input class="text" type="text" name="address" class="form-control" id="last_name"
                                            name="last_name" placeholder="Address" required>
                                    
                                   <input class="text" type="text"
							name="mobile"  id="last_name"
							name="last_name" placeholder="Mobile number" required> 
                                    
                                   
                                   <input class="text" type="text"
							name="pincode"  id="last_name"
							name="last_name" placeholder="Pin Code" required>
                                    
                                   
                                   <input class="text" type="password"
							name="password" class="form-control" id="last_name"
							name="last_name" placeholder="Password" required>
                                   
                                   <input class="text"
							type="password" name="confirmPassword" class="form-control"
							id="last_name" name="last_name" placeholder="Confirm Password" required>
                                   
					
						<div class="clear"> </div>
                        </div> 
                                        
                                   <div class="row text-center">
					<div class="col-md-6" style="margin-bottom: 2px;">
                                            <button type="Reset" class="btn btn-danger">Reset</button>
					
                                            <button type="submit" class="btn btn-success">Register</button>
					</div>
				</div>     
                                        
				</form>
                                        <br>
				<p>Already Have Account? <a href="login.jsp"> Login Here!</a></p>
			</div>
		</div>
		<!-- copyright -->
		<div class="colorlibcopy-agile">
			<p class="copyright_text">© 2024 Built Better. All Rights Reserved.</p>
		</div>
		<!-- //copyright -->
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