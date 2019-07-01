<%@page import="com.lanou.bean.Emp"%>
<%@page import="java.util.List"%>
<%@page import="jdbc.DaoFactory"%>
<%@page import="com.lanou.dao.EmpDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ListEmp</title>
<style type="text/css" >
	table{
		border:1px solid black;
		border-spacing:0
		border-collapse:collapse;
		margin:0 auto
		font-family:华康少女文字W5;
	}
	table td{
		border:1px solid black;
		width:100px;
		text-align:center;
		font-size:20px
	}
	.row1{
		background-color:red;
	}
	.row2{
		background-color:green;
	}	
</style>
</head>
<body>
	<%	
		//获取所有的emps对象
		EmpDao dao = (EmpDao) DaoFactory.getDao("empDao").newInstance();
		List<Emp> emps = dao.findAll();
	%>
	<table>
		<caption>员工列表<a href="AddEmp.jsp">继续添加</a></caption>
	<tr>
		<td width="100">编号</td>
		<td width="100">姓名</td>
		<td width="100">薪水</td>
		<td width="100">年龄</td>
		<td width="100">操作</td>
	</tr>
	<% for(int i=0;i<emps.size();i++){
		Emp emp = emps.get(i);
	%>
	<!-- HTML代码 -->
		<tr class="row<%=i%2==0?1:2%>">
			<td>
			<%=emp.getId()%>
			</td>
			<td>
			<%=emp.getName()%>
			</td>
			<td>
			<%=emp.getSalary()%>
			</td>
			<td>
			<%=emp.getAge()%>
			</td>
			<td>
			<a onclick="return confirm('确定要删除吗')"
			href='DeleteEmp.jsp?id=<%=emp.getId()%>'>删除</a>
			<a onclick="return confirm('确定要修改吗')"
			href='UpdateEmp.jsp?id=<%=emp.getId()%>'>修改</a>
			</td>
		</tr>
	<%	
	}%>
	</table>
</body>
</html>