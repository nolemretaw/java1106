<%@page import="jdbc.DaoFactory"%>
<%@page import="com.lanou.dao.EmpDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DeleteEmp</title>
</head>
<body>
	<!-- java部分 -->
	<% 
		String idStr=request.getParameter("id");
		if(idStr!=null){
			int id = Integer.parseInt(idStr);
			EmpDao dao = (EmpDao) DaoFactory.getDao("empDao").newInstance();
			if(dao.deleteById(id)){
				response.sendRedirect("list.jsp");
			}else{
				response.sendRedirect("404.html");
			} 
		}
	%>
</body>
</html>