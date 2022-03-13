<html>
<body>
<%Boolean regStatus =(Boolean) request.getAttribute("reg_status"); 
if(regStatus!= null){
	if(regStatus){
	%>
	<h2><font color='green'>Registration Success...!!!<br>
		Login Again</font></h2>
		<%
	} else {
		%>
		<h2><font color='red'>Login Failed...!!!<br>
		Register Again</font></h2> 
			<%
	}
}
	%>
		
<h2>Enter your credentials :</h2>
<form action="login" method= "post">
<table border=0>
<tr>
	<td>Username:</td>
	<td><input type="text" name="username"></td>
	</tr>
	<tr>
	<td>Password:</td>
	<td><input type="password" name="password"></td>
	</tr>
</table> <br>
<input type="submit">

</form>
<br>
<h3>New to Website??...<a href="register.html"> Click Here</a> to register. </h3>
</body>
</html>
