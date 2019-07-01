package com.lanou.interceptor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.lanou.bean.Emp;
import com.lanou.util.GlobalConst;

/**
 * 拦截器:判断用户是否登陆
 * */
public class LoginInterceptor implements HandlerInterceptor{
	long t1;
	/**
	 * 请求进入处理器之前回调
	 * @return 	返回true:放过请求，不拦截
	 * 					后面两个方法才会执行
	 * 			返回false:拦截请求
	 * */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		t1=System.currentTimeMillis();
		
		System.out.println(object+"\n");
		//判断用户是否登陆
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		if (username==null) {//从未登录
			//重定向去登陆
			response.sendRedirect(GlobalConst.BASE_URL+"user/toLogin.do");
			return false;//拦截请求
		}else {//已登录
			return true;//放过请求
		}
	}
	
	/**处理器执行完请求之后调用*/
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView mav)
			throws Exception {
		//从ModelAndView中获取处理完成的数据和要转发的视图名称
		Map<String, Object> map = mav.getModel();
		System.out.println("map:"+map);
		
		//修改返回的数据
		/*List<Emp> emps = new ArrayList<>();
		emps.add(new Emp(1, "aaa", 100, 23));
		mav.getModel().put("emps", emps);*/
		
		String viewName = mav.getViewName();
		System.out.println("viewname:"+viewName);
		
		//修改返回的视图
		/*mav.setViewName("error");*/
		
		System.out.println(object+"\n");	
	}
	
	/**响应返回给页面之前调用*/
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception e)
			throws Exception {
		long t2=System.currentTimeMillis();
		System.out.println("消耗时长"+(t2-t1)*0.001+"秒");
		
		System.out.println(object+"\n");
	}

}
