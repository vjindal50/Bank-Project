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

<script type="text/javascript">
	
/* function vieCustLog(){
    var z = document.getElementById("col3");
    var text = "${custlist}";
    
    z.innerHTML = text;
    console.log("hey");
  } */

  function searchCust(){
    var z = document.getElementById("col3");
    var text = "";
    text += '<form method="post" action="searchCust">';
    text += '<br><div class="divtext">First Name : </div><input class="getfield" type="text" name="fname1"><br><br>';
    text += '<div class="divtext">Last Name :</div><input class="getfield" type="text" name="lname1"><br><br>';
    text += '<div class="divtext">Middle Name : </div><input class="getfield" type="text" name="mname1"><br><br>';
    text += '<div class="divtext">Phone : </div><input class="getfield" type="Phone" name="phone1"><br><br>';
    text += '<div class="divtext">Alternate Phone : </div><input class="getfield" type="phone" name="altphone1"><br><br>';
    text += '<div class="divtext">Email : </div><input class="getfield" type="Email" name="email1"><br><br>';
    text += '<div class="divtext">Address : </div><input class="getfield" type="text" name="address1"><br><br>';
    text += '<div class="divtext">User Name : </div><input class="getfield" type="text" name="uname1"><br><br>';
    text += '<div><center> <input class="butts" type="submit" name="submit" value="Search">';
    text += '<input class="butts" type="reset" name="reset" value="Reset"></center></div><br>';
    text += '</form>';
    z.innerHTML = text;
    console.log("hey");
  }
  function viewProfile(){
    var z = document.getElementById("col3");
    var text = "";
    text += '<br><div class="divtext">Fisrt Name : </div>${efname}';
    text += '<br><br><div class="divtext">Middle Name : </div>${emname}';
    text += '<br><br><div class="divtext">Last Name: </div>${elname}';
    text += '<br><br><div class="divtext">ID : </div>${eeid}';
    text += '<br><br><div class="divtext">Phone : </div>${ephone}';
    text += '<br><br><div class="divtext">Alternate Phone : </div>${ealtphone}';
    text += '<br><br><div class="divtext">Email : </div>${eemail}';
    text += '<br><br><div class="divtext">Address : </div>${eaddress}';
    text += '<br><br><div class="divtext">D.O.B : </div>${edob}';
    text += '<br><br><div class="divtext">User Name : </div>${euname}';
    text += '<br><br><div class="divtext">Password : </div>${epass}';
    text += '<br><br><div><center><button class="butts" onclick="updateProfile()">UPDATE PROFILE</button></center></div><br>';
    z.innerHTML = text;
  }
  function updateProfile(){
    var z = document.getElementById("col3");
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
    text += '<div><center><input class="butts" type="submit" name="submit" value="Update">';
    text += '<input class="butts" type="reset" name="reset" value="Reset">';
    text += '<button id="backbtt" onclick="viewProfile()">Back</button></center></div></form>';
    text += '';
    z.innerHTML = text;
  }
  </script>
</head>
<body>
<div id="container">
  <div id="topMostBar">
    <div id="topMostInner1"> SWB </div>
    <div id="topMostInner2"> Employee Home </div>
    <div id="topMostInner3"> SummitWorks Banking Solution</div>
  </div>
  <div id="navcontainer"> <span class="buttonText" id="nav11"><form action="goemphome" method="post">
  <input id="logout" type="submit" name="submit" value="Home"></form></span> 
  <span class="buttonText" id="nav21"><button onclick="searchCust()">Search Customer</button></span> 
  <span class="buttonText" id="nav31"><form action="viewCustLog" method="post">
  <input id="logout" type="submit" name="submit" value="Customer Log"></form></span> <span class="buttonText" id="nav41">
  <form action="viewEmpLog" method="post"><input id="logout" type="submit" name="submit" value="Employee Log"></form></span> 
  <span class="buttonText" id="nav51"><form action="viewAccLog" method="post">
  <input id="logout" type="submit" name="submit" value="Account Log"></form></span> <span class="buttonText" id="nav61">
  <form action="logoutEmployee" method="post"><input id="logout" type="submit" name="submit" value="Logout">
  </form></span> </div>
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
      <div id="welcome"><h2>Welcome ${empname}</h2></div>
      <div class="col1">
        <!-- <div class="noteheader"> &nbsp;Personal Banking </div> -->
          
          
          <br />ID : ${empId}
          <br />First Name : ${efname}
          <br />Middle Name : ${emname}
          <br />Last Name : ${elname}
          <br />Email: ${eemail}
          <br />
          <br /><div class="sidemenuitem"><button onclick="viewProfile()">View Profile</button></div>
          <br />
          <br />
          <br />
          <br />
          <br />
          <br />
          <br />
          
         </div>
      
      <div class="col3" id="col3">
          ${custlist}
          
          
      </div>
    </div>
  </div>
  <!-- <div id="footer"> &copy; 2006-2007 Silksun Corporation Pvt. Ltd., All rights reserved;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;XHTML 1.0 Strict | Pure CSS Layout </div>
</div> -->
</body>
</html>