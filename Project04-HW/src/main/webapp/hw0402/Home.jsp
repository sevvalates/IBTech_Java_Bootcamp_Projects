<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String username=(String)session.getAttribute("username");
if(username==null){
	response.sendRedirect("Login.jsp"); 
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
Hoşgeldin <%=username %><br/><br/>
<a href="Logout.jsp">Çık</a>
</body>
</html>