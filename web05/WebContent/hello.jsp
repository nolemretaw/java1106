<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	h1{color:red;
		background-color:yellow;
		font-family:华康少女文字W5;
		}
</style>
</head>
<body>
	<h1>Hello JSP!!!</h1>
	<h1>你好 鸡爱死批!!!</h1>
	<!-- Java代码 -->
	<!-- JSP小脚本 -->
	<!-- 向页面输出20个HelloWorld -->
	<%-- <%
		for(int i = 0;i<20;i++){
			out.println("<h1>HelloWorld"+i+"</h1>");
		}
	%> --%>
	<!-- 向页面输出当前时间 -->
	<%
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateStr = sdf.format(date);
		//out.println(dateStr);
	%>
	<!-- JSP表达式 -->
	<%int j=10;%>
	<%-- <%out.println(i);%> --%>
	<%=j%>
	<!-- 使用JSP表达式向页面输出20个HelloWorld -->
	<%
		//java代码
		for(int i=0;i<20;i++){
			
	%>
		<!-- 不属于java代码 -->
		<h1>你好世界！！<%=i%></h1>
	<%
		//这个'{'也属于java代码
	}
	%>
	<!-- 使用JSP表达式来输出时间 -->
	<!-- 直接输出变量值 -->
	<%=dateStr%>
	<form action="#">
	<input type="text" name="测试" value=<%=dateStr%>>
	</form>
	</br>
	<!-- 输出函数的结果值 -->
	<%=sdf.format(date)%>
	</br>
	<%=new Date()%>
	</br>
	<!-- 输出表达式的值 -->
	<%int m = 30; %>
	<%=m%2==0?true:false %>
</body>
</html>