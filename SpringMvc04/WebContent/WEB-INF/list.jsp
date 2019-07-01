<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/my.css"/>
</head>
<body>
	<table>
		<caption>员工列表&nbsp;&nbsp;&nbsp;&nbsp;用户:【${sessionScope.username}】
			&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="toAddEmp.do">添加员工</a>
		</caption>
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>薪水</td>
			<td>年龄</td>
		</tr>
		<c:forEach items="${emps}" var="emp">
			<tr>
			<td>${emp.id}</td>
			<td>${emp.name}</td>
			<td>${emp.salary}</td>
			<td>${emp.age}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>