<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	1、使用java代码来接收请求参数
	<%
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String[] cities = request.getParameterValues("cities");
	%>
	姓名:<%=name %>		<br/>
	性别:<%=sex %>		<br/>
	城市:<%=Arrays.toString(cities) %>
	
	<hr/>
	2、EL表达式接收请求参数					<br/>
	姓名:${param.name }					<br/>
	性别:${param.sex}					<br/>
	城市:${paramValues.cities[0]}			<br/>
	城市:${paramValues.cities[1]}			<br/>
</body>
</html>