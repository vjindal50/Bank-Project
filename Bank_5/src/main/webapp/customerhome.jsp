<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Home Page</title>
<style type="text/css">
		.customerhome{
			display: inline-block;
			height: 40px;
		}
		
		#lastlogin{
			
			text-align: right;
		}
		
	</style>


</head>
<body><center>
	<div><h1>Welcome ${Customer.getname}</h1></div>
	<div>
		<div>
			<div class="customerhome" id="lastlogin">${LastLogin}</div>
		</div>
		<div>
			<div class="searchitems" id="searchbuttons">
				<div class="searchitems"><button onclick="">View Profile</button></div>
				<br><br>
				<div class="searchitems"><button onclick="">Accounts</button></div>
				<br><br>
				<div class="searchitems"><form action="logout" method="post"><input type="submit" name="submit" value="logout"></form></div>
			</div>
			
		</div>
	</div>
</center>

</body>

</html>