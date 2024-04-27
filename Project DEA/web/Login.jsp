<%-- 
    Document   : login
    Created on : 02-Apr-2024, 13:41:10
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">
<link rel="stylesheet" href="fonts/icomoon/style.css">
<link rel="stylesheet" href="css/owl.carousel.min.css">

<link rel="stylesheet" href="css/bootstrap.min.css">

<link rel="stylesheet" href="css/login.css">
<title>Login #2</title>
<script nonce="ded4d467-199b-4ce7-9e7e-56f656e21cf0">try{(function(w,d){!function(b,c,d,e){b[d]=b[d]||{};b[d].executed=[];b.zaraz={deferred:[],listeners:[]};b.zaraz.q=[];b.zaraz._f=function(f){return async function(){var g=Array.prototype.slice.call(arguments);b.zaraz.q.push({m:f,a:g})}};for(const h of["track","set","debug"])b.zaraz[h]=b.zaraz._f(h);b.zaraz.init=()=>{var i=c.getElementsByTagName(e)[0],j=c.createElement(e),k=c.getElementsByTagName("title")[0];k&&(b[d].t=c.getElementsByTagName("title")[0].text);b[d].x=Math.random();b[d].w=b.screen.width;b[d].h=b.screen.height;b[d].j=b.innerHeight;b[d].e=b.innerWidth;b[d].l=b.location.href;b[d].r=c.referrer;b[d].k=b.screen.colorDepth;b[d].n=c.characterSet;b[d].o=(new Date).getTimezoneOffset();if(b.dataLayer)for(const o of Object.entries(Object.entries(dataLayer).reduce(((p,q)=>({...p[1],...q[1]})),{})))zaraz.set(o[0],o[1],{scope:"page"});b[d].q=[];for(;b.zaraz.q.length;){const r=b.zaraz.q.shift();b[d].q.push(r)}j.defer=!0;for(const s of[localStorage,sessionStorage])Object.keys(s||{}).filter((u=>u.startsWith("_zaraz_"))).forEach((t=>{try{b[d]["z_"+t.slice(7)]=JSON.parse(s.getItem(t))}catch{b[d]["z_"+t.slice(7)]=s.getItem(t)}}));j.referrerPolicy="origin";j.src="/cdn-cgi/zaraz/s.js?z="+btoa(encodeURIComponent(JSON.stringify(b[d])));i.parentNode.insertBefore(j,i)};["complete","interactive"].includes(c.readyState)?zaraz.init():b.addEventListener("DOMContentLoaded",zaraz.init)}(w,d,"zarazData","script");})(window,document)}catch(e){throw fetch("/cdn-cgi/zaraz/t"),e;};</script></head>



<body>
    
    
    <%
	String message = request.getParameter("message");
	%>
    
    
    
    
<div class="d-lg-flex half">
<div class="bg order-1 order-md-2" style="background-image: url('images/2.jpg');"></div>
<div class="contents order-2 order-md-1">
<div class="container">
<div class="row align-items-center justify-content-center">
<div class="col-md-7">
<h3>Login to <strong>Built Better</strong></h3>
<p class="mb-4">wording.</p>




<form action="./LoginSrv" method="post">
    
    
    <%
					if (message != null) {
					%>
					<p style="color: blue;">
						<%=message%>
					</p>
					<%
					}
					%>
    
    
<div class="form-group first">
<label for="username">Username</label>

<input type="email"
placeholder="Enter Username" name="username" class="form-control" id="last_name" required>

</div>
    
<div class="form-group last mb-3">
<label for="password">Password</label>
<input type="password" placeholder="Enter Password" name="password" class="form-control"
 id="last_name" required>
</div>
                                        
<div class="row">
					<div class="col-md-12 form-group">
						<label for="userrole">Login As</label> <select name="usertype"
							id="userrole" class="form-control" required>
							<option value="customer" selected>CUSTOMER</option>
							<option value="admin">ADMIN</option>
						</select>
					</div>
				</div>                                        
                                        
                                        
                                        
                                        
                                        
    
<div class="d-flex mb-5 align-items-center">
<label class="control control--checkbox mb-0"><span class="caption">Remember me</span>
<input type="checkbox" checked="checked" />
<div class="control__indicator"></div>
</label>
    
<span class="ml-auto"><a href="#" class="forgot-pass">Forgot Password</a></span>
</div>
    
<input type="submit" value="Log In" class="btn btn-block btn-primary" style="background-color: #eba636;; color: white;">

</form>




</div>
</div>
</div>
</div>
</div>
<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/main.js"></script>
<script defer src="https://static.cloudflareinsights.com/beacon.min.js/v84a3a4012de94ce1a686ba8c167c359c1696973893317" integrity="sha512-euoFGowhlaLqXsPWQ48qSkBSCFs3DPRyiwVu3FjR96cMPx+Fr+gpWRhIafcHwqwCqWS42RZhIudOvEI+Ckf6MA==" data-cf-beacon='{"rayId":"86f30308b86fb2fd","version":"2024.3.0","token":"cd0b4b3a733644fc843ef0b185f98241"}' crossorigin="anonymous"></script>
</body>
</html>