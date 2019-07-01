<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>显示列表</h1>
	request传值:<br/>
	账号:${requestScope.username}<br/>
	密码:${requestScope.password}<br/>
	<hr/>
	
	session传值:<br/>
	账号:${sessionScope.username}<br/>
	密码:${sessionScope.password}<br/>
	request传值:<br/>
	<hr/>
	
	modelMap传值:<br/>
	账号:${requestScope.name}<br/>
	密码:${requestScope.pwd}<br/>
	<hr/>
	
	实体对象传值:<br/>
	账号:${requestScope.user.username}<br/>
	密码:${requestScope.user.password}<br/>
</body>
</html>