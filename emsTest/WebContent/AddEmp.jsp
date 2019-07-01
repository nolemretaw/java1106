<%@page import="com.lanou.bean.Emp"%>
<%@page import="jdbc.DaoFactory"%>
<%@page import="com.lanou.dao.EmpDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AddEmp</title>
</head>
<body>
	<form action="" method="post" >
	<fieldset>
	<legend>员工插入</legend>
		姓名:<input type="text" name="name"/><br/>
		薪水:<input type="text" name="salary"/><br/>
		年龄:<input type="text" name="age"/><br/>
		<input type="submit" value="添加"/>
	</fieldset>
	</form>
	<!-- java部分 -->
	<% 	
		String name = request.getParameter("name");
		String ageStr=request.getParameter("age");
		String salaryStr=request.getParameter("salary");
		if(name!=null&&ageStr!=null&&salaryStr!=null){
			double salary = Double.parseDouble(salaryStr);
			int age = Integer.parseInt(ageStr);
			Emp emp = new Emp();
			emp.setName(name);
			emp.setSalary(salary);
			emp.setAge(age);
			EmpDao dao = (EmpDao) DaoFactory.getDao("empDao").newInstance(); 
			if(dao.addEmp(emp)){
				response.sendRedirect("list.jsp");
			}else{
				response.sendRedirect("404.html");
			} 
		}
	%>
</body>
</html>