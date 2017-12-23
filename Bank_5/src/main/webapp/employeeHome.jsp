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

  function searchCust(){
    var z = document.getElementById("col3");
    var text = "";
    text += '<div><center><b>Note : </b>Don\'t fill any values to get a full list of customers.</center></div>';
    text += '<br><form method="post" action="searchCust">';
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
    text += '<div style="text-align: right"><button id="backbtt" onclick="viewProfile()">Back</button></div>';
    	text += '<form method="post" action="updateEmpProfile">';
    text += '<div class="divtext">First Name : </div><input class="getfield" type="text" name="fname" value="${efname}"><br><br>';
    text += '<div class="divtext">Last Name :</div><input class="getfield" type="text" name="lname" value="${elname}"><br><br>';
    text += '<div class="divtext">Middle Name : </div><input class="getfield" type="text" name="mname" value="${emname}"><br><br>';
    text += '<div class="divtext">Phone : </div><input class="getfield" type="Phone" name="phone" value="${ephone}"><br><br>';
    text += '<div class="divtext">Alternate Phone : </div><input class="getfield" type="phone" name="altphone" value="${ealtphone}"><br><br>';
    text += '<div class="divtext">Email : </div><input class="getfield" type="Email" name="email" value="${eemail}"><br><br>';
    text += '<div class="divtext">Address : </div><input class="getfield" type="text" name="address" value="${eaddress}"><br><br>';
    text += '<div class="divtext">User Name : </div><input class="getfield" type="text" name="uname" value="${euname}"><br><br>';
    text += '<div class="divtext">Password : </div><input class="getfield" type="Password" name="pass" value="${epass}"><br><br>';
    text += '<center><input class="butts" type="submit" name="submit" value="Update">';
    text += '<input class="butts" type="reset" name="reset" value="Reset"></center>';
    text += '</form><br><br>';

    z.innerHTML = text;
  }
  function updateCustProfile(){
		var z = document.getElementById("col3");
		var text = "";
		 text += '<div style="text-align: right"><form method="post" action="backtocustprof"><input class="butts" type="submit" value="Back" name="submit"></form> </div>';
		text += '<form method="post" action="updateCustProfileEmp">';
		text += '<div class="divtext">First Name : </div><input class="getfield" type="text" name="fname" value="${cfname}"><br><br>';
		text += '<div class="divtext">Last Name :</div><input class="getfield" type="text" name="lname" value="${clname}"><br><br>';
		text += '<div class="divtext">Middle Name : </div><input class="getfield" type="text" name="mname" value="${cmname}"><br><br>';
		text += '<div class="divtext">Phone : </div><input class="getfield" type="Phone" name="phone" value="${cphone}"><br><br>';
		text += '<div class="divtext">Alternate Phone : </div><input class="getfield" type="phone" name="altphone" value="${caltphone}"><br><br>';
		text += '<div class="divtext">Email : </div><input class="getfield" type="Email" name="email" value="${cemail}"><br><br>';
		text += '<div class="divtext">Address : </div><input class="getfield" type="text" name="address" value="${caddress}"><br><br>';
		text += '<div class="divtext">User Name : </div><input class="getfield" type="text" name="uname" value="${cuname}"><br><br>';
		text += '<div class="divtext">Password : </div><input class="getfield" type="Password" name="pass" value="${cpass}"><br><br>';
		text += '<br><div><center><input class="butts" type="submit" name="submit" value="Update">';
		text += '<input class="butts" type="reset" name="reset" value="Reset">';
		text += '</center></div></form>';
		
		z.innerHTML = text;
	}
  
  	function EmployeeOption(){
		var z = document.getElementById("col3");
		var text = "";
		text += '<div><center><h2>MENU</h2></center></div>';
		text += '<br><br><div class = "employeeMenu"><form action="viewEmpLog" method="post"><input id="logout" type="submit" name="submit" value="Employee Log">';
		text += '</form></div>';
		text += '<br><br><div class = "employeeMenu"><form action="viewEmpList" method="post"><input id="logout" type="submit" name="submit" value="Employee List">';
		text += '</form></div>';
		z.innerHTML = text;
	}
  	function AccountOption(){
		var z = document.getElementById("col3");
		var text = "";
		text += '<div><center><h2>MENU</h2></center></div>';
		text += '<br><br><div class = "employeeMenu"><form action="viewAccLog" method="post">';
		text += '<input id="logout" type="submit" name="submit" value="Account Log">';
		text += '</form></div>';
		text += '<br><br><div class = "employeeMenu"><form action="viewAccList" method="post"><input id="logout" type="submit" name="submit" value="Accounts List">';
		text += '</form></div>';
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
  <input id="logout" type="submit" name="submit" value="Customer Log"></form></span> 
  
  <span class="buttonText" id="nav41">
  <button onclick="EmployeeOption()">Employee</button>
 </span> 
  
  
  <span class="buttonText" id="nav51">
  <button onclick="AccountOption()">Accounts</button>
  </span> 
  
  <span class="buttonText" id="nav61">
  <form action="logoutEmployee" method="post"><input id="logout" type="submit" name="submit" value="Logout">
  </form></span>   
  </div>

  <div id="main">
    <div class="horizRect">
    
    </div>
    
    <div class="threecolcontainer">
      <div id="welcome"><h2>Welcome ${empname}</h2></div>
      <div class="col1">
          
          <br /><div class="miniprofile">ID </div> : ${empId}<br />
          <br /><div class="miniprofile">First Name</div> : ${efname}<br />
      <%--     <br /><div class="miniprofile">Middle Name</div> : ${emname}<br /> --%>
          <br /><div class="miniprofile">Last Name</div> : ${elname}<br />
          <br /><div class="miniprofile">Email</div> : ${eemail}<br />
          <br />
          <br /><div><center><button onclick="viewProfile()">View Profile</button></center></div>
          <br />
          <br />
          <br />    
         </div>
      
      <div class="col3" id="col3">
          ${custlist}       
      </div>
    </div>
  </div>
</body>
</html>