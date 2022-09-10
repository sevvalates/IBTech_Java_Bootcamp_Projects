<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
int area=0;
int height=0;
int weight=0;
if(request.getParameter("multiply")!=null){
	height = Integer.parseInt(request.getParameter("height"));
	weight = Integer.parseInt(request.getParameter("weight"));
	area = height * weight;
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
Alan : <%=area%> <br/>
<form action="Rectangle.jsp" method="POST">
Boy : <input type="text" name=height value="<%=height%>" /><br/><br/>
En : <input type="text" name=weight value="<%=weight%>" /><br/><br/>
<input type="submit" value="Alan" name="multiply"/>
</form>
</body>
</html>