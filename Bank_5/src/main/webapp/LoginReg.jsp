<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<html>
<head>
	<title>Login and Registration</title>
	<style type="text/css">
		*{
			box-sizing: border-box;
		}
		#heads{
			background-color: red;
			margin-right: 5%;
			margin-left: 5%;
			color: white;
		}
		/*#conatiner{
			object-position: top;
			position: absolute;
			
		}
		.sections2{
			display: inline-block;
		}*/
		.sections{
			display: inline-block;
			width: 33%;
			height: 600px;
			margin: 7%;
			background-color: green;
			color: white;
			vertical-align: top;
		}
		.textfields{
			width: 120px;
			text-align: right;
			padding-right: 7px;
			display: inline-block;
		}
		body{
			background-color: blue;
		}
		h2{
			margin-top: 40px;
		}
		.butts{
			margin-left: 4px;
			margin-right: 4px;
			width: 120px;
		}
		/*form{
			height: 660px;
		}*/
		fieldset{
			border-width: 7px;
		}
		h1{
			color: white;
		}
	</style>

	<script type="text/javascript">
		function validateform(){}
		function validateform2(){}
	</script>
</head>
<body><center><div id="heads"><fieldset><h1> SUMMITWORKS BANK </h1></fieldset></div><br>
${adminMsg}

	<div id = "container">
		<fieldset>
		<%-- <div>${model}</div> --%>
				<div class="sections">
					<h2>REGISTRATION</h2><br><br>
					<form method="post" name="form2" action="registerme" onsubmit="validateForm2()">
						<div class="textfields">First Name : </div><input type="text" name="fname" required><br><br>
						<div class="textfields">Last Name :</div><input type="text" name="lname" required><br><br>
						<div class="textfields">Middle Name : </div><input type="text" name="mname"><br><br>
						<div class="textfields">Phone : </div><input type="Phone" name="phone" required><br><br>
						<div class="textfields">Alternate Phone : </div><input type="Phone" name="altphone"><br><br>
						<div class="textfields">Email : </div><input type="Email" name="email" required><br><br>
						<div class="textfields">Address : </div><input type="text" name="address" required><br><br>
						<div class="textfields">User Name : </div><input type="text" name="uname" required><br><br>
						<div class="textfields">Password : </div><input type="Password" name="pass" required><br><br>
						<div class="textfields">D.O.B. :</div><input type="Date" name="dob" required><br><br>
						<input class="butts" type="submit" name="submit" value="Reg_${model}">
						<input class="butts" type="reset" name="reset" value="reset">
					</form>
				</div>
		<div class="sections">
		<div>
			<h2>LOGIN</h2>
			<br>
			<br>
			<form action="logininto" method="post" onsubmit="validateForm()" name="form1">
				<div class="textfields">User Name : </div><input type="text" name="uname" required>
				<br><br>
				<div class="textfields">Password : </div><input type="Password" name="pass" required>
				<br><br>
				<input class="butts" type="submit" name="submit" value="Login_${model}">
				<input class="butts" type="reset" name="reset" value="reset">
				
			</form>
			</div>
		</div>
		</fieldset>
	</div>
</center>
</body>
</html>