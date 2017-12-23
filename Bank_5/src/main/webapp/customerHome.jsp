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
	function addaccount(){
		var z = document.getElementById("col3");
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
		text += '<center><input class="butts" type="submit" name="submit" value="Update">';
		text += '<input class="butts" type="reset" name="reset" value="Reset"></center>';
		text += '</form>';
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
  
  <span class="buttonText" id="nav31"><form action="viewCustLog" method="post">
  <input id="logout" type="submit" name="submit" value="New Account"></form></span> 
  <span class="buttonText" id="nav41"><form action="viewEmpLog" method="post">
  <input id="logout" type="submit" name="submit" value="Loan"></form></span>
  
   <span class="buttonText" id="nav51"><button onclick="getFAQs()">FAQs</button></span>
   
    <span class="buttonText" id="nav61"><form action="logoutCustomer" method="post">
    <input id="logout" type="submit" name="submit" value="Logout"></form></span> </div>
  <div id="main">
    <div class="horizRect">
      <!-- <div class="adblock2">
        <div class="noteheader"> &nbsp;Where do we stand? </div>
        <div id="brag"> 150+ years<br />
          of customer satisfaction,<br />
          1500 awards<br />
          <br />
          We just love big numbers! </div>
      </div> -->
    </div>
    <!-- <div class="horizRect">
      <div class="adblock">
        <div class="noteheader"> &nbsp;Welcome to SummitWorks Bank Online </div>
        <div class="spacy">
          <div class="imgSlogan">
            <ul>
              <li> [ Trust Worthy ]</li>
              <li> [ Secure ]</li>
              <li> [ 138 Billion Dollars Capital ]</li>
              <li> [ 150+ years of operational excellence ]</li>
              <li> [ A banking revolution ]</li>
            </ul>
            <br />
            Need more reasons to choose SilkSun?<br />
            [<a href="#">Click here</a>] </div>
        </div>
      </div>
      <div class="sideblock">
        <div class="noteheader"> &nbsp;Login to Online Services </div>
        <div class="spacy">
          <form action="loginEmployee" method="post" name="loginForm" onsubmit="validateFomr()">
            <p>Enter login details</p>
            <fieldset>
            <div> <br />
              <label for="txtusername">Username:</label>
              <input type="text" name="txtusername" title="Text input: Username" id="txtusername" maxlength="20" required />
            </div>
            <div>
              <label for="txtpassword">&nbsp;Password:</label>
              <input type="password" name="txtpassword" title="Text input: Password" id="txtpassword" maxlength="20" required/>
            </div>
            <br />
            <div> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="submit" name="LoginButton" title="Login button: Login" id="btnLogin" value="Login" class="button" />
              <input type="Reset" name="ResetButton" title="Reset button: Login" id="btnReset" value="Clear" class="button" />
              <br />
              <a href="#">Forgot your password?</a><br />
              <a href="#">Login Problems?</a> </div>
            </fieldset>
          </form>
        </div>
      </div>
    </div> -->
    <div class="threecolcontainer">
      <div id="welcome"><h2>Welcome ${cfname} ${clname}</h2></div>
      <div class="col1">
        <!-- <div class="noteheader"> &nbsp;Personal Banking </div> -->
          
          
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
  <!-- <div id="footer"> &copy; 2006-2007 Silksun Corporation Pvt. Ltd., All rights reserved;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;XHTML 1.0 Strict | Pure CSS Layout </div>
</div> -->
</body>
</html>