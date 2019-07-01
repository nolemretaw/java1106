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
	<body onload="load()">
<!-- java部分 :获取servlet组件转发过来的数据-->
<%List<Emp> emps = (ArrayList<Emp>)request.getAttribute("emps");
	int countPage = (int)request.getAttribute("countPage"); //总页数
	int pageNum = (int)session.getAttribute("pageNum");//当前页
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
					<%-- <%@include file="select.jsp" %> --%>
	<div  id="selectpage">
		<%if(pageNum>1){ %>
		<span><button id="first" onclick="toFirst()">首页</button></span>
		<span><button id="pre" onclick="toPre()">上一页</button></span>
		<%} %>
		<span>&nbsp第</span>
		<select onchange="change()" >
		</select><span>页&nbsp</span>
		<%if(pageNum<countPage){%>
		<span><button id="next" onclick="toNext()">下一页</button></span>
		<span><button id="final" onclick="toFinal()">末页</button></span>
		<%} %>
		<script type="text/javascript">
		/* 动态设置页码数组，传入总页数以设定数组 
			参数:总页数=总条数%页容==0？总条数%页容:总条数/页容+1
		*/
		var select = document.querySelectorAll("select")[0];
		function load() {
	
			for (var i = 0; i <<%=countPage%> ; i++) {
				//将总页码传入
				/* pageArr.push(i+1); */
				var option = document.createElement("option");
				option.innerText = i+1;
				if (i+1==<%=pageNum%>) {
				option.selected=true;				
				}
				select.appendChild(option);
			}
		}
		function change(){//获取页码，并提交给分页查询
			var pageNum = select.selectedIndex+1;

			window.location.href="listEmp.do?pageNum="+pageNum;
		}
		function toFirst() {
			<%session.setAttribute("pageNum",1);%>
			window.location.replace("listEmp.do?"+Math.random());
		}
		
		function toPre() {
			<%pageNum--;
			session.setAttribute("pageNum",pageNum);
			System.out.println(session);
			%>
			<%=pageNum%>
		window.location.replace("listEmp.do?"+Math.random());
			
		}
		
		function toNext() {
			<%pageNum++;
			session.setAttribute("pageNum",pageNum);
			System.out.println(session);
			%>
			<%=pageNum%>
			window.location.replace("listEmp.do?"+Math.random());
		}
		
		function toFinal() {
			console.log(<%=countPage%>,typeof <%=countPage%>);
			<%session.setAttribute("pageNum",countPage);%>
			window.location.replace("listEmp.do?"+Math.random());
		}
		</script>
	</div>
				</div>
			</div>
			<%@include file="footer.jsp" %>
		</div>
	</body>
</html>
