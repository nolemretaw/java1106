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
 * ������:�ж��û��Ƿ��½
 * */
public class LoginInterceptor implements HandlerInterceptor{
	long t1;
	/**
	 * ������봦����֮ǰ�ص�
	 * @return 	����true:�Ź����󣬲�����
	 * 					�������������Ż�ִ��
	 * 			����false:��������
	 * */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		t1=System.currentTimeMillis();
		
		System.out.println(object+"\n");
		//�ж��û��Ƿ��½
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		if (username==null) {//��δ��¼
			//�ض���ȥ��½
			response.sendRedirect(GlobalConst.BASE_URL+"user/toLogin.do");
			return false;//��������
		}else {//�ѵ�¼
			return true;//�Ź�����
		}
	}
	
	/**������ִ��������֮�����*/
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView mav)
			throws Exception {
		//��ModelAndView�л�ȡ������ɵ����ݺ�Ҫת������ͼ����
		Map<String, Object> map = mav.getModel();
		System.out.println("map:"+map);
		
		//�޸ķ��ص�����
		/*List<Emp> emps = new ArrayList<>();
		emps.add(new Emp(1, "aaa", 100, 23));
		mav.getModel().put("emps", emps);*/
		
		String viewName = mav.getViewName();
		System.out.println("viewname:"+viewName);
		
		//�޸ķ��ص���ͼ
		/*mav.setViewName("error");*/
		
		System.out.println(object+"\n");	
	}
	
	/**��Ӧ���ظ�ҳ��֮ǰ����*/
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception e)
			throws Exception {
		long t2=System.currentTimeMillis();
		System.out.println("����ʱ��"+(t2-t1)*0.001+"��");
		
		System.out.println(object+"\n");
	}

}
