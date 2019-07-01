package com.lanou.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @WebServlet("/test")
 * ע���൱����web.xml�ļ�������
 * 	<servlet>
    <servlet-name>test</servlet-name>
    <servlet-class>com.lanou.web.TestServlet</servlet-class>
  	</servlet>
  	<servlet-mapping>
    	<servlet-name>test</servlet-name>
    	<url-pattern>/test</url-pattern>
  	</servlet-mapping>
 */
@WebServlet("/test")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("testServlet-->service()");
	}

}
