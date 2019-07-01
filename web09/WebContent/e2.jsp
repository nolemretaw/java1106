<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- EL表达式进行运算 -->
	1、算术运算 <br/>
	${3+5}<br/>
	<!-- EL表达式中的+只做加法运算,不区分单双引号 -->
	加:${"300"+100}		<br/>
	减:${"300"-100}		<br/>
	乘:${"300"*100}		<br/>
	除:${"300"/100}		<br/>
	求余:${"300"%100}		<br/>
	
	年龄加10:${applicationScope.user.age+10}<br/>
	<hr/>
	
	2、比较运算 <br/>
	${300>100}			<br/>
	${300>'100'}		<br/>
	${"300">'100'}		<br/>
	${"abc"=='abc'}		<br/>
	${"abc" eq 'abc'}	<br/>
	<%session.setAttribute("name", "张三"); %>
	${name eq "张三"}
	
	<hr/>
	
	3、三项运算<br/>
	${user.sex=='男'?'男人':'女人'} <br/>
	${applicationScope.user.sex=='男'?'男人':'女人' }<br/>
	
	<hr/>
	
	4、empty判空运算<br/>
	<%
		//空字符串
		String str = "阿里巴巴";
		//空集合
		List list = new ArrayList();
		//值为null
		String city = null;
		
		pageContext.setAttribute("str", str);
		pageContext.setAttribute("list", list);
		pageContext.setAttribute("city", city);
	%>
	空字符串:${empty str}		<br/>
	空集合:${empty list }		<br/>
	值为null:${empty city }	<br/>
	未绑定:${empty adress }	<br/>
	
</body>
</html>