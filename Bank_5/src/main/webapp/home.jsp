<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Home</title>
	
	<spring:url value="/resources/HomePageScript.js" var="employeeHomeScript" />
	<script type="text/javascript" src="${employeeHomeScript}"></script>
	
	<style type="text/css">
		.emphomefield{
			display: inline-block;
			height: 40px;
		}
		.sidemenuitem{
			/*display: inline-block;*/
			width: 100%;
			height: 50px;
		}
		.sidemenuandcontent{
			display: inline-block;	
			/*height: 400px;	*/
			vertical-align: top;
		}
		#empinfo{
			/*padding-left: 5%;*/
			width: 45%;
			text-align: left;
		}
		#lastlogin{
			/*padding-right: 5%;*/
			width: 45%;
			text-align: right;
		}
		#sidemenucontent{
			display: inline-block;
			width: 500px;
			/*height: 200px;*/
			/*width: 70%;*/
			/*content: top;*/

		}
		button{
			margin-top: 5px;
			width: 150px;
		}
		#sidemenu{
			width: 25%;
		}
		body{
			background-color: lightblue;
		}
		#headings{
			margin-top: 70px;
		}
		.divtext{
			display: inline-block;
			width: 140px;
			text-align: right;
			color: white;
		}
		table{
			border: solid;
		}
		th, td{
			border: solid;
			padding-left: 10px;
			padding-right: 10px;
		}
		#logout{
			width: 150px;
		}
		.menuanddis{
			margin-top: 35px;
			margin-bottom: 35px;
		}
		.butts{
			width: 150px;
		}
	</style>
</head>
<body><center>
	<div id="headings"><h1>Welcome ${empname}</h1></div>
	<div>
		<div class="menuanddis">
			<div class="emphomefield" id="empinfo">${empId}</div>
			<div class="emphomefield" id="lastlogin">${LastLogin}</div>
		</div>
		<div class="menuanddis">
			<div class="sidemenuandcontent" id="sidemenu">
				<div class="sidemenuitem"><button onclick="searchCust()">Search Customer</button></div>
				<div class="sidemenuitem"><button onclick="viewCustLog()">View Customer Log</button></div>
				<div class="sidemenuitem"><button onclick="viewProfile()">View Profile</button></div>
				<div class="sidemenuitem"><form action="logout" method="post"><input id="logout" type="submit" name="submit" value="Logout"></form></div>
			</div>
			<div class="sidemenuandcontent">
				<div id="sidemenucontent">
					 <h3>Please select an action</h3> 
				</div>
			
			</div>
		</div>
	</div>
</center>
<script type="text/javascript" src="${employeeHomeScript}"></script>
</body>
</html>