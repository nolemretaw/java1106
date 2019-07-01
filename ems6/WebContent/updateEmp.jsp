<%@page import="jdbc.DaoFactory"%>
<%@page import="com.lanou.entity.Emp"%>
<%@page language="java" pageEncoding="utf-8" contentType="text/html;charset=utf-8" %>

<html>
	<head>
		<title>update Emp</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css"
			href="css/style.css" />
	</head>

	<body>
		<div id="wrap">
			<div id="top_content">
				<%@include file="head.jsp" %>	
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						修改员工
					</h1>
					<form action="updateEmp.do" method="post">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table">
							<tr>
								<td valign="middle" align="left">
									<input type="hidden" name="id"
									value="${emp.id}">
								</td>
								
							</tr>
							<tr>
								<td valign="middle" align="right">
									姓名:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" 
									name="name" value="${emp.name}"/>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									薪水:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" 
									name="salary" value="${emp.salary}"/>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									年龄:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" 
									name="age" value="${emp.age}"/>
								</td>
							</tr>
						</table>
						<p>
							<input type="submit" class="button" 
							value="提交" name="sub"/>
						</p>
					</form>
				</div>
			</div>
			<%@include file="footer.jsp" %>
		</div>
	</body>
</html>
