<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String username="";
String password="";
String message="";
if(request.getParameter("login")!=null){
	username = request.getParameter("username");
	password = request.getParameter("password");
	if(username.equals("godoro") && password.equals("java")){
		session.setAttribute("username", username);
		response.sendRedirect("Home.jsp"); 
	}
	else{
		message="Yanlış!";
	}
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Login Page</title>
</head>
<body>
<%=message%> <br/>
<form action="Login.jsp" method="POST">
Username : <input type="text" name=username value="<%=username%>" /><br/><br/>
Password : <input type="text" name=password value="<%=password%>" /><br/><br/>
<input type="submit" value="login" name="login"/>
</form>
</body>
</html>