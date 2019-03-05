<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link href="CSS\main.css" type="text/css" rel="stylesheet">
<script>
	function validate() {
		var username = document.form.username.value;
		var password = document.form.password.value;

		if (username == null || username == "") {
			alert("Username cannot be blank");
			return false;
		} else if (password == null || password == "") {
			alert("Password cannot be blank");
			return false;
		}
	}
</script>
<style>
.index{
	padding-left:37%;
	padding-right:37%;

}
.index2{
	
		padding-top:5%;
}
</style>
</head>
<body>
<center>
<div class="index2"><img src="images/logo.png" height="150px" width="200px"></div>
	<div >
		<h1 >GRIZZLY STORE</h1>
		<div class="index"><hr></div>
	</div>
	<br>
	<div class="index">
	<form name="form" action="LoginServlet" method="post" onsubmit="return validate()">

<input class="borderRound" type="text" name="username" placeholder="Username">
<br><br>
<input class="borderRound" type="password" name="password" placeholder="Password" ><br>
<br><span style="color: red"><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></span>
<br><input id="button1" type="submit" value="Login">
</form>
</div>
</center>
</body>
</html>