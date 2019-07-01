package com.lanou.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
/**²âÊÔÂ·¾¶Æ¥ÅäµÄservlet*/
public class UriServlet extends HttpServlet {
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("===service===");
	}
}
