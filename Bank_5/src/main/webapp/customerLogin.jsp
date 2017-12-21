<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
    <div id="topMostInner2"> Customer Login </div>
    <div id="topMostInner3"> SummitWorks Banking Solution</div>
  </div>
  <div id="navcontainer"> <span class="buttonText" id="nav1"><a href="customerLogin.jsp">Customer Login</a></span> <span class="buttonText" id="nav2"><a href="employeeLogin.jsp">Employee Login</a></span> <span class="buttonText" id="nav3"><a href="customerRegistration.jsp">Customer Registration</a></span> <span class="buttonText" id="nav4"><a href="employeeRegistration.jsp">Employee Registration</a></span> </div>
  <div id="main">
    <div class="horizRect">
      <div><center>${model}</center></div>
    </div>
    <div class="horizRect">
      <div class="adblock">
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
      </div>
      <div class="sideblock">
        <div class="noteheader"> &nbsp;Login to Online Services </div>
        <div class="spacy">
          <form action="loginCutomer" method="post" name="loginForm" onsubmit="validateFomr()">
            <p>Enter login details</p>
            <fieldset>
            <div> <br />
              <label for="txtusername">Username:</label>
              <input type="text" name="uname" title="Text input: Username" id="txtusername" maxlength="20" required/>
            </div>
            <div>
              <label for="txtpassword">&nbsp;Password:</label>
              <input type="password" name="pass" title="Text input: Password" id="txtpassword" maxlength="20" required/>
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
    </div>  
  </div>
</body>
</html>

