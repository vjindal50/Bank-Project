<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Customer Home</title>
	
	<spring:url value="/resources/HomePageScript.js" var="employeeHomeScript" />
	<script type="text/javascript" src="${employeeHomeScript}"></script>
	<script type="text/javascript">
	function addaccount(){
		var z = document.getElementById("sidemenucontent");
		var text = "";
		
		text += '<div class="divtext"><form action="savingsaccount" method="post">';
		text +=	'<div class="divtext">Enter Balance : </div><br>';
		text+='<div class="divtext"></div><input type="text" name="savingsbalance"><input class="butts" type="submit" name="submit" value="Savings_Account"></form></div><br><br>';
		text += '<div class="divtext"><form action="checkingsaccount" method="post"><input id="checkings" type="submit" name="submit" value="Checkings_Account"></form></div><br><br>';
		text += '<div class="divtext"><form action="loanaaccount" method="post"><input id="loan" type="submit" name="submit" value="Loan_Account"></form></div><br><br>';
		
		z.innerHTML = text;
		console.log("hey");
	}
	function viewProfile(){
		var z = document.getElementById("sidemenucontent");
		var text = "";
		text += '<div class="divtext">Fisrt Name : </div>${cfname}';
		text += '<br><div class="divtext">Middle Name : </div>${cmname}';
		text += '<br><div class="divtext">Last Name: </div>${clname}';
		text += '<br><div class="divtext">ID : </div>${custId}';
		text += '<br><div class="divtext">Phone : </div>${cphone}';
		text += '<br><div class="divtext">Alternate Phone : </div>${caltphone}';
		text += '<br><div class="divtext">Email : </div>${cemail}';
		text += '<br><div class="divtext">Address : </div>${caddress}';
		text += '<br><div class="divtext">D.O.B : </div>${cdob}';
		text += '<br><div class="divtext">User Name : </div>${cuname}';
		text += '<br><div class="divtext">Password : </div>${cpass}';
		text += '<br><button onclick="updateProfile()">UPDATE PROFILE</button>';
		z.innerHTML = text;
	}
	function updateProfile(){
		var z = document.getElementById("sidemenucontent");
		var text = "";
		text += '<form method="post" action="updateCustProfile">';
		text += '<div class="divtext">Customer ID : </div><input type="text" name="custId" value="${custId}" readonly><br><br>';
		text += '<div class="divtext">First Name : </div><input type="text" name="fname" value="${cfname}"><br><br>';
		text += '<div class="divtext">Last Name :</div><input type="text" name="lname" value="${clname}"><br><br>';
		text += '<div class="divtext">Middle Name : </div><input type="text" name="mname" value="${cmname}"><br><br>';
		text += '<div class="divtext">Phone : </div><input type="Phone" name="phone" value="${cphone}"><br><br>';
		text += '<div class="divtext">Alternate Phone : </div><input type="phone" name="altphone" value="${caltphone}"><br><br>';
		text += '<div class="divtext">Email : </div><input type="Email" name="email" value="${cemail}"><br><br>';
		text += '<div class="divtext">Address : </div><input type="text" name="address" value="${caddress}"><br><br>';
		text += '<div class="divtext">User Name : </div><input type="text" name="uname" value="${cuname}"><br><br>';
		text += '<div class="divtext">Password : </div><input type="Password" name="pass" value="${cpass}"><br><br>';
		text += '<div class="divtext">D.O.B. :</div><input type="date" name="dob" value="${cdob}" readonly><br><br>';
		text += '<input class="butts" type="submit" name="submit" value="Update">';
		text += '<input class="butts" type="reset" name="reset" value="Reset">';
		text += '</form>';
		text += '<button onclick="viewProfile()">Back</button>';
		z.innerHTML = text;
	}
	</script>
	<style type="text/css">
		.custhomefield{
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
		#custinfo{
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
		
		input{
			width: 140px;
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
	<div id="headings"><h1>Welcome ${custname}</h1></div>
	<div>
		<div class="menuanddis">
			<div class="custhomefield" id="custinfo">Customer Id: ${custId}</div>
			<div class="custhomefield" id="lastlogin">Last Login: ${LastLogin}</div>
			<div>Accounts ${acclist}</div>
		</div>
		<div class="menuanddis">
			<div class="sidemenuandcontent" id="sidemenu">
				<div class="sidemenuitem"><button onclick="addaccount()">Add Account</button></div>
				
			<!-- 	<div class="sidemenuitem"><button onclick="viewCustLog()">View Customer Log</button></div>
				 -->
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