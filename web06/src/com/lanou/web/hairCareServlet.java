package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * session对象的创建
 */
@WebServlet("/hairCare")
public class hairCareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置编码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建或获取session对象
		/**
		 * getSession()参数
		 * 参数为true:默认值
		 * 判断请求数据包中有没有携带JESSIONID
		 * --|没有携带JESSIONID（第一次）
		 * ----|创建一个sessoin对象并返回
		 * 
		 * --|带了有JESSIONID（非第一次）
		 * ----|根据JESSIONID找到了session对象，返回
		 * ----|根据JESSIONID没有找到session对象
		 * 		创建一个session对象并返回
		 * 		1>人为修改了浏览器上JESSIONID
		 * 		2>服务器端的session对象被删除了
		 * 	以上两种方式如果是新创建的session,会给这个session对象分配一个唯一id，
		 * 	并且添加到响应数据包中，以cookie形式返回给浏览器
		 * 
		 * 	参数为false
		 * 	--|没有携带JESSIONID（第一次）
		 * 	----|返回null
		 * 
		 * 	--|带了有JESSIONID（非第一次）
		 * 	----|根据JESSIONID找到了session对象，返回对象
		 * 	----|根据JESSIONID没有找到session对象，返回null
		 **/
		HttpSession session = request.getSession();
		System.out.println(session);
		//获取session对象的唯一id
		System.out.println(session.getId());
		
		//count=10,从session对象中获取剩余理发次数
		Integer count = (Integer)session.getAttribute("count");
		if (count==null) {//第一次
			count=10;
		}else{
			if (count>0) {	
				count--;
			}
		}
		//将修改完后的次数重新存储到session中
		session.setAttribute("count", count);
		out.println("剩余可理发次数:"+count);
		out.close();
	}
}
