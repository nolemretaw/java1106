<%@page import="com.lanou.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 往pageContext中存储数据 -->
	<%
		User user4 = new User();
		user4.setId(4);
		user4.setName("赵六");
		user4.setSex("男");
		user4.setAge(40);
		user4.setHobbies(new String[]{"钓鱼","打牌"});
		pageContext.setAttribute("user", user4);
	%>
	
	<!-- 1、获取servlet对象转发过来的数据 -->
	1、使用java代码获取对象及其属性值<br/>
	<%
	/* User user = (User)request.getAttribute("user"); 
	User user = (User)session.getAttribute("user"); 
	User user = (User)application.getAttribute("user"); */
	User user = (User)pageContext.getAttribute("user");
	%>

	user对象:<%=user %><br/>
	姓名:<%=user.getName() %><br/>
	年龄:<%=user.getAge()  %><br/>
	性别:<%=user.getSex()  %><br/>
	爱好:<%=user.getHobbies() %><br/> 
	
	
	<hr/>
	2、使用EL表达式获取对象及其属性值 <br/>
	user对象:	${user} <br/>
	姓名: ${user.name} <br/>
	年龄: ${user.age} <br/>
	爱好: ${user.hobbies}<br/> 
	
	<hr/> 
	
	3、指定从域对象中取值 ,取不到值直接显示空白<br/>
	1>只从pageContext中取值: ${pageScope.user.name}<br/>
	2>只从request中取值: ${requestScope.user.age}<br/>
	3>只从session取值:${sessionScope.user.sex}<br/>
	4>只从application取值:${applicationScope.user.hobbies}<br/>
</body>
</html>