<%@page import="com.lanou.dao.EmpDao"%>
<%@page import="jdbc.DaoFactory"%>
<%@page import="com.lanou.bean.Emp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UpdateEmp</title>
</head>
<body>
	
	<!-- java部分 -->
	<%	String sub = request.getParameter("sub");//提交键
		String idStr = request.getParameter("id");
		String name = request.getParameter("name");
		String salaryStr = request.getParameter("salary");
		String ageStr = request.getParameter("age");
		if(idStr!=null){//拿到id
			int id = Integer.parseInt(idStr);
			EmpDao dao = (EmpDao) DaoFactory.getDao("empDao").newInstance();
			Emp emp = dao.findEmpById(id);
			if(sub==null){//未提交表单，**表单提交则Emp必然存在
		%>
				<!--html表单部分 -->
				<form action="" method="post" >
				<fieldset>
				<legend>员工信息修改</legend>
					<!-- 编号 -->
						<input type="hidden" name="id" value="<%=emp.getId()%>"/><br>
					姓名:<input type="text" name="name" value="<%=emp.getName()%>"/><br/>
					薪水:<input type="text" name="salary" value="<%=emp.getSalary() %>"/><br/>
					年龄:<input type="text" name="age" value="<%=emp.getAge() %>"/><br/>
					<input type="submit" name="sub" value="修改" />
				</fieldset>
				</form>
				<!-- java代码部分修改emp -->
			<%	
				}else if(name!=null
				&&ageStr!=null&&salaryStr!=null){//已提交表单，且都填正确
					double salary = Double.parseDouble(salaryStr);
					int age = Integer.parseInt(ageStr);
					emp = new Emp();
					emp.setId(id);
					emp.setName(name);
					emp.setSalary(salary);
					emp.setAge(age);
					if(dao.updateEmp(emp)){
						response.sendRedirect("list.jsp");
					}else{
						response.sendRedirect("404.html");
					}	
				}
		}
	%>
</body>
</html>