package com.lanou.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


/**
 * ������
 * 	������ Handler:	ר�Ŵ��������
 * 	������Controller:	���MVC���ģʽ��
 * 	���Ŀ���������˿�����
 * 		�����ǰ�˿�����DispatcherServlet
 * 	���ã��൱�ڴ��������servlet���
 * */
public class HelloController implements Controller{
	/**
	 * ��������������ķ���
	 * request:�������
	 * response:��Ӧ����
	 * 
	 * @return ModelAndView ģ�����ݺ���ͼ
	 * ���ã���װҵ��㷵�ص����ݣ��Լ�Ҫת����JSPҳ������
	 * */
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("====handleRequest====");
		ModelAndView mav = new ModelAndView();
		//��mav�����д������ݣ�ת����ҳ�������ʾ
		//��SpringMvc�ײ�ִ�е���
		//resquest.setAttribute("username", "����")
		Map<String, Object> map = mav.getModel();
		map.put("username", "����");
		ModelMap modelMap = mav.getModelMap();
		modelMap.addAttribute("password", "123");
		//��װҪת������ͼ����,����д��׺
		mav.setViewName("hello");
		return mav;
		
	}
	
}

