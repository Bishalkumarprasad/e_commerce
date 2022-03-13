<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Response Page</title>
</head>
<body>
<h1>After Login</h1>
<h2>Welcome</h2>
<!-- Expression Language -->
<!--  
<h2>Login Status : ${loginStatus}</h2>
<h2>User Name: ${userName}</h2>
-->
<%Boolean loginStatus=(Boolean) request.getAttribute("loginStatus") ;
	String userName=(String)request.getAttribute("userName");
	if(loginStatus){
		%>
		<h2><font color='green'>Login Success...!!!<br>
		Welcome <%=userName %></font></h2>
		<h3><a href="products.html">Click Here</a>to Continue to Products.</h3>
		
		<%
	} else {
		%>
		<h2><font color='red'>Login Failed...!!!<br>
		Invalid Credentials</font></h2>
		<h3><a href="index.jsp">Click Here</a>to login again.</h3>
	<a href="register.html">Click Here</a>to Register New User.</h3>
		<%
	}
	%>
	
</body>
</html>