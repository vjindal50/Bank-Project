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
	<script type="text/javascript">
	function searchCust(){
		var z = document.getElementById("sidemenucontent");
		var text = "";
		text += '<form method="post" action="searchCust">';
		text += '<div class="divtext">First Name : </div><input type="text" name="fname"><br><br>';
		text += '<div class="divtext">Last Name :</div><input type="text" name="lname"><br><br>';
		text += '<div class="divtext">Middle Name : </div><input type="text" name="mname"><br><br>';
		text += '<div class="divtext">Phone : </div><input type="Phone" name="phone"><br><br>';
		text += '<div class="divtext">Alternate Phone : </div><input type="phone" name="altphone"><br><br>';
		text += '<div class="divtext">Email : </div><input type="Email" name="email"><br><br>';
		text += '<div class="divtext">Address : </div><input type="text" name="address"><br><br>';
		text += '<div class="divtext">User Name : </div><input type="text" name="uname"><br><br>';
		text += '<div class="divtext">D.O.B. :</div><input type="date" name="dob"><br><br>';
		text += '<input class="butts" type="submit" name="submit" value="Search">';
		text += '<input class="butts" type="reset" name="reset" value="Reset">';
		text += '</form>';
		z.innerHTML = text;
		console.log("hey");
	}
	function viewProfile(){
		var z = document.getElementById("sidemenucontent");
		var text = "";
		text += '<div class="divtext">Fisrt Name : </div>${efname}';
		text += '<br><div class="divtext">Middle Name : </div>${emname}';
		text += '<br><div class="divtext">Last Name: </div>${elname}';
		text += '<br><div class="divtext">ID : </div>${eeid}';
		text += '<br><div class="divtext">Phone : </div>${ephone}';
		text += '<br><div class="divtext">Alternate Phone : </div>${ealtphone}';
		text += '<br><div class="divtext">Email : </div>${eemail}';
		text += '<br><div class="divtext">Address : </div>${eaddress}';
		text += '<br><div class="divtext">D.O.B : </div>${edob}';
		text += '<br><div class="divtext">User Name : </div>${euname}';
		text += '<br><div class="divtext">Password : </div>${epass}';
		text += '<br><button onclick="updateProfile()">UPDATE PROFILE</button>';
		z.innerHTML = text;
	}
	function updateProfile(){
		var z = document.getElementById("sidemenucontent");
		var text = "";
		text += '<form method="post" action="updateEmpProfile">';
		text += '<div class="divtext">First Name : </div><input type="text" name="fname" value="${efname}"><br><br>';
		text += '<div class="divtext">Last Name :</div><input type="text" name="lname" value="${elname}"><br><br>';
		text += '<div class="divtext">Middle Name : </div><input type="text" name="mname" value="${emname}"><br><br>';
		text += '<div class="divtext">Phone : </div><input type="Phone" name="phone" value="${ephone}"><br><br>';
		text += '<div class="divtext">Alternate Phone : </div><input type="phone" name="altphone" value="${ealtphone}"><br><br>';
		text += '<div class="divtext">Email : </div><input type="Email" name="email" value="${eemail}"><br><br>';
		text += '<div class="divtext">Address : </div><input type="text" name="address" value="${eaddress}"><br><br>';
		text += '<div class="divtext">User Name : </div><input type="text" name="uname" value="${euname}"><br><br>';
		text += '<div class="divtext">Password : </div><input type="Password" name="pass" value="${epass}"><br><br>';
		text += '<div class="divtext">D.O.B. :</div><input type="date" name="dob" value="${edob}"><br><br>';
		text += '<input class="butts" type="submit" name="submit" value="Update">';
		text += '<input class="butts" type="reset" name="reset" value="Reset">';
		text += '</form>';
		text += '<button onclick="viewProfile()">Back</button>';
		z.innerHTML = text;
	}
	</script>
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