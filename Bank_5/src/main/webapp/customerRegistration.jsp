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
<script type="text/javascript" src="resources/js/validation.js"></script>
</head>
<body>
<div id="container">
  <div id="topMostBar">
    <div id="topMostInner1"> SWB </div>
    <div id="topMostInner2"> Customer Register </div>
    <div id="topMostInner3"> SummitWorks Banking Solution</div>
  </div>
 <div id="navcontainer"> <span class="buttonText" id="nav1"><a href="customerLogin.jsp">Customer Login</a></span> <span class="buttonText" id="nav2"><a href="employeeLogin.jsp">Employee Login</a></span> <span class="buttonText" id="nav3"><a href="customerRegistration.jsp">Customer Registration</a></span> <span class="buttonText" id="nav4"><a href="EmployeeRegistration.jsp">Employee Registration</a></span> </div>
	<div class="horizRect">
		  <div><center>${model}</center></div>
    </div>	
    <div class="horizRect">
      <div class="adblock1a">
        <div class="noteheader"> &nbsp;Welcome to SummitWorks Bank Online </div>
        
        <div class="spacy">
          <div class="imgSlogan">
            <ul>
              <li> [ Trust Worthy ]</li>
              <li> [ Secure ]</li>
              <li> [ A banking revolution ]</li>
            </ul>
           </div>
        </div>
        <br>
        <div class="imgSlogan3"><center><h1>Regsiter Today</h1></center></div>
        <br>
        <div class="spacy">
          <div class="imgSlogan2">
           <br>

           <ul>
              <li> [ Be a part of multinational bank ]</li>
              <li> [ Enjoy worry free transaction ]</li>
              <li> [ 24*7 Customer Service ]</li>
              <li> [ More than 5000 branches world wide ]</li>
            </ul>

           </div>
        </div>

      </div>
      <div class="sideblock2">
        <div class="noteheader"> &nbsp;Register to Online Services </div>
        <div class="spacy">
          <form action="registerCustomer" method="post" name="loginForm" onsubmit="validateFomr()">
            <p>Enter login details</p>
            <fieldset>
              <div> <br />
              <label for="txtusername"><div class="fieldtext">First Name:</div></label>
              <input type="text" name="fname"  maxlength="20" required/>
            </div>
            <div> <br />
              <label for="txtusername"><div class="fieldtext">Middle Name:</div></label>
              <input type="text" name="mname"  maxlength="20" required/>
            </div>
            <div> <br />
              <label for="txtusername"><div class="fieldtext">Last Name:</div></label>
              <input type="text" name="lname"  maxlength="20" required/>
            </div>
            <div> <br />
              <label for="txtusername"><div class="fieldtext">Phone:</div></label>
              <input type="number" name="phone"  min ="9" maxlength="10" required/>
            </div>
            <div> <br />
              <label for="txtusername"><div class="fieldtext">Alt Phone:</div></label>
              <input type="number" name="altphone"  maxlength="10" required/>
            </div>
            <div> <br />
              <label for="txtusername"><div class="fieldtext">Email:</div></label>
              <input type="Email" name="email"  maxlength="20" required/>
            </div>
            <div> <br />
              <label for="txtusername"><div class="fieldtext">Address:</div></label>
              <input type="text" name="address"  maxlength="20" required/>
            </div>
            <div> <br />
              <label for="txtusername"><div class="fieldtext">D.O.B.:</div></label>
              <input type="Date" name="dob"  maxlength="20" required/>
            </div>
            <div> <br />
              <label for="txtusername"><div class="fieldtext">Username:</div></label>
              <input type="text" name="uname"  maxlength="20" required/>
            </div>
            <div><br />
              <label for="txtpassword"><div class="fieldtext">Password:</div></label>
              <input type="password" name="pass"  maxlength="20" required/>
            </div>
            <br />
            <div> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="submit" name="LoginButton" title="Login button: Login" id="btnLogin" value="Register" class="button" />
              <input type="Reset" name="ResetButton" title="Reset button: Login" id="btnReset" value="Clear" class="button" />
              <br />

            </fieldset>
          </form>
        </div>
      </div>
    </div>
  </div>
</body>
</html>