<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Savings Page</title>

<style type="text/css">

.textfields{
			width: 120px;
			text-align: right;
			padding-right: 7px;
			display: inline-block;
		}

</style>

</head>
<body>
Welcome to savings account page
<br><br>
<div id="savings"></div>
	<div>
		<div class="addaccount">
			<form action="savingsaddaccount" method="post" name="savingsadd">
				<div class="textfields">Balance : </div><input type="text" name="savingsbalance">
				<br><br>
				<input class="butts" type="submit" name="submit" value="Add Account">
				<input class="butts" type="reset" name="reset" value="reset">
			</form></div>
		</div>

</div>
</body>
</html>