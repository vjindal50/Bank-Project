<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
   <%--  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<spring:url value="/resources/welcomepageBg.jpg" var="welcomePageBg" />
	<title>My Bank Applicaotion</title>
	
	<style type="text/css">
	
		*{
			box-sizing: border-box;
		}
		body{
<<<<<<< HEAD
			background-image: url("resources/welcomepageBg.jpg");
=======
			background-image: url("${welcomePageBg}");
>>>>>>> master
			background-repeat: repeat-y;
			background-size:cover;
		}
		h1{
			color: rgb(223,213,193);
			font-size: 70px;
		}
		#selection{
			padding-left: 20%;
			padding-right: 20%;
			padding-top: 10%;
		}
		.myButtons{
			display: inline-block;
			padding: 10%;
			
		}
		form{
			width: 10%;
		}
		input{
			width: 130px;
			height: 30px;
			font-size: 15px;
			background-color: rgb(234,113,45);
			color: white;
			font-style: bold;
		}
		fieldset{
			border-width: 15px;
		}

	</style>

	<script type="text/javascript"></script>

</head>
<body background="${welcomePageBg}"><center>
	<fieldset><h1>WELCOME TO MY BANK</h1></fieldset>
	${logoutmsg}
	<div id="selection">
		<div class="myButtons"><form action="homeme.html" method="post"><input type="submit" name="submit" value="Customer"></form></div>
		<div class="myButtons"><form action="homeme.html" method="post"><input type="submit" name="submit" value="Employee"></form></div>
		<div class="myButtons"><form action="homeme.html" method="post"><input type="submit" name="submit" value="Admin"></form></div>
	</div>
</center>
</body>
</html>