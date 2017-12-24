<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>SUMMITWORKS BANKING</title>
<meta http-equiv="Content-Type" content="application/xhtml+xml; charset=iso-8859-1" />
<style type="text/css" media="all">
@import url(resources/style.css);
</style>
<script type="text/javascript" src="js/validation.js"></script>
<script type="text/javascript">
	function getFAQs(){
		var z = document.getElementById("col3");
		var text = '<div>';
			text += '<b>Q. How do I close my account ?</b>';
			text += '</div>';
				text += '<div>';
					text += '	A. If the feature has been implemented then you\'ll see an option to do that.';
					text += '</div>';
		
		
		z.innerHTML = text;
	}
	function addloanaccount(){
		var z = document.getElementById("col3");
		var text = "";
		text += '<div><center><h2>TAKE LOAN</h2></center></div><br>';
		text += '<form style="width: 100%;" action="loanaccount" method="post"><div>';
		text += '<div><h3>&nbsp;&nbsp;&nbsp;Please Enter the following details : </h3></div><br><br>';
		text +=	'<div class="divtext">Amount : </div><input class="getfield" type="text" name="loanbalance"><br><br><br>';
		text += '<div><center><input id="loan" type="submit" name="submit" value="Apply Loan"></center></div></div></form><br><br>';
		z.innerHTML = text;
		console.log("hey");
	}
	function displayloandetails(){
		var z = document.getElementById("col3");
		var text = "";
		text += '<br><div class="divtext">Loan Account No : </div>${accloanno}';
		text += '<br><br><div class="divtext">EMI : </div>${emi}';
		text += '<br><br><div class="divtext">Interest: </div>${interest}';
		
		z.innerHTML = text;
	}
	
	function viewProfile(){
		var z = document.getElementById("col3");
		var text = "";
		text += '<br><div class="divtext">Fisrt Name : </div>${cfname}';
		text += '<br><br><div class="divtext">Middle Name : </div>${cmname}';
		text += '<br><br><div class="divtext">Last Name: </div>${clname}';
		text += '<br><br><div class="divtext">ID : </div>${custId}';
		text += '<br><br><div class="divtext">Phone : </div>${cphone}';
		text += '<br><br><div class="divtext">Alternate Phone : </div>${caltphone}';
		text += '<br><br><div class="divtext">Email : </div>${cemail}';
		text += '<br><br><div class="divtext">Address : </div>${caddress}';
		text += '<br><br><div class="divtext">D.O.B : </div>${cdob}';
		text += '<br><br><div class="divtext">User Name : </div>${cuname}';
		text += '<br><br><div class="divtext">Password : </div>${cpass}';
		text += '<br><br><div><center><button class="butts" onclick="updateProfile()">UPDATE PROFILE</button></center></div><br>';
		z.innerHTML = text;
	}
	function updateProfile(){
		var z = document.getElementById("col3");
		var text = "";
		text += '<div style="text-align: right"><button id="backbtt" onclick="viewProfile()">Back</button></div>';
		text += '<form method="post" action="updateCustProfile">';
		text += '<div class="divtext">First Name : </div><input class="getfield" type="text" name="fname" value="${cfname}"><br><br>';
		text += '<div class="divtext">Last Name :</div><input class="getfield" type="text" name="lname" value="${clname}"><br><br>';
		text += '<div class="divtext">Middle Name : </div><input class="getfield" type="text" name="mname" value="${cmname}"><br><br>';
		text += '<div class="divtext">Phone : </div><input class="getfield" type="Phone" name="phone" value="${cphone}"><br><br>';
		text += '<div class="divtext">Alternate Phone : </div><input class="getfield" type="phone" name="altphone" value="${caltphone}"><br><br>';
		text += '<div class="divtext">Email : </div><input class="getfield" type="Email" name="email" value="${cemail}"><br><br>';
		text += '<div class="divtext">Address : </div><input class="getfield" type="text" name="address" value="${caddress}"><br><br>';
		text += '<div class="divtext">User Name : </div><input class="getfield" type="text" name="uname" value="${cuname}"><br><br>';
		text += '<div class="divtext">Password : </div><input class="getfield" type="Password" name="pass" value="${cpass}"><br><br>';
		text += '<center><input class="butts" type="submit" name="submit" value="Update">';
		text += '<input class="butts" type="reset" name="reset" value="Reset"></center>';
		text += '</form>';
		z.innerHTML = text;
	}
	function newaccmenu(){
		var z = document.getElementById("col3");
		var text = "";
		text += '<div><center><h2>OPEN NEW ACCOUNT</h2></center></div><br><br>';
		text += '<div><form style="width: 100%;" action="addaccounts" method="post">';
		text +=	'<h3>&nbsp;&nbsp;&nbsp;Please fill out the details :</h3><br><br>';
		text+='<div> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Select account tpye : </b>&nbsp;&nbsp;&nbsp;<input class="getfield" type="radio" name="accounts" value="savings" checked> Savings &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="accounts" value="Checking" > Checking<br></div><br>';
		text+='<div> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Enter Balance : </b>&nbsp;&nbsp;<input class="getfield"  type="text" name="balance"></div><br><br>';
		text+='<div><center><input class="butts1" type="submit" name="submit" value="AddAccount"></center></div></form></div><br><br>';
		z.innerHTML = text;
	}
	</script>
</head>
<body>
<div id="container">
  <div id="topMostBar">
    <div id="topMostInner1"> SWB </div>
    <div id="topMostInner2"> Customer Home </div>
    <div id="topMostInner3"> SummitWorks Banking Solution</div>
  </div>
  
  <div id="navcontainer"> <span class="buttonText" id="nav11">
  <form action="gocusthome" method="post">
  <input id="logout" type="submit" name="submit" value="Home">
  </form></span> 
  
  <span class="buttonText" id="nav21">
  <form action="viewAccounts" method="post">
  <input id="logout" type="submit" name="submit" value="Accounts">
  </form></span> 
  
  <span class="buttonText" id="nav31"><button onclick="newaccmenu()">New Account</button></span> 
  
  
  <span class="buttonText" id="nav41"><button onclick="addloanaccount()">Loan</button></span>
  
  
   <span class="buttonText" id="nav51"><button onclick="getFAQs()">FAQs</button></span>
   
    <span class="buttonText" id="nav61"><form action="logoutCustomer" method="post"></span>
    <input id="logout" type="submit" name="submit" value="Logout"></form></span> </div>
  <div id="main">
    <div class="horizRect">
      
    </div>
 
    <div class="threecolcontainer">
      <div id="welcome"><h2>Welcome ${cfname} ${clname}</h2></div>
      <div class="col1">       
          <br /><div class="miniprofile">ID : </div>${custId}<br />
          <br /><div class="miniprofile">First Name : </div>${cfname}<br />
          <br /><div class="miniprofile">Last Name : </div>${clname}<br />
          <br /><div class="miniprofile">Email : </div>${cemail}<br />
          <br />
          <br /><div><center><button onclick="viewProfile()">View Profile</button></center></div>
          <br />
          <br />
          <br />
          <br />
          <br />
          <br />

          
         </div>
      
      <div class="col3" id="col3">
         ${acclist}
         
      </div>
    </div>
  </div>
  
</body>
</html>