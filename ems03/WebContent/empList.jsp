<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.lanou.bean.Emp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
	<head>
		<title>emplist</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="css/style.css" />
	</head>
	<body>
<!-- java部分 :获取servlet组件转发过来的数据-->
<%List<Emp> emps = (ArrayList<Emp>)request.getAttribute("emps");
	
	 if(emps==null){
		response.sendRedirect("listEmp.do");
		return;//终止转成servlet后的service方法
	} 
%>
		<div id="wrap">
			<div id="top_content"> 
				<%@include file="head.jsp" %>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						员工列表
					</h1>
					<table class="table">
						<tr class="table_header" align="center">
							<td>
								ID
							</td>
							<td>
								姓名
							</td>
							<td>
								薪水
							</td>
							<td>
								年龄
							</td>
							<td>
								操作
							</td>
						</tr>
						<%for(int i = 0;i<emps.size();i++) {
							Emp emp = emps.get(i);
						%>
						<tr class="row<%=i%2==0?1:2 %>" align="center">
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
								<%=emp.getAge() %>
							</td>
							<td>
								<a onclick="return confirm('确定删除？')" href="deleteEmp.do?id=<%=emp.getId()%>">删除</a>
								<a onclick="return confirm('确定修改')" href="toUpdateEmp.do?id=<%=emp.getId()%>">修改</a>
							</td>
						</tr>
						<% 
						}
						%>
					</table>
					<p>
						<input type="button" class="button" 
						value="添加员工" onclick="window.location.replace('addEmp.jsp')"/>
					</p>
				</div>
			</div>
			<%@include file="footer.jsp" %>
		</div>
	</body>
</html>
