package com.lanou.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lanou.bean.User;
import com.lanou.service.UserService;
import com.lanou.util.GlobalConst;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	/**
	 * ���ʵ�¼ҳ��
	 * */
	@RequestMapping("toLogin.do")
	public String toLogin() {
		return "login";
	}
	
	/**
	 * �����û���½ҵ��
	 * */
	/*@RequestMapping("/login.do")
	public String login(User user,HttpSession session){
		System.out.println("user:"+user);
		boolean loginSuccess = userService.loginUser(user);
		if (loginSuccess) {//��½�ɹ�
			System.out.println("��½�ɹ�");
			
			session.setAttribute("username",user.getUsername());
			//listAll.do Ϊ���·�� /listAll.doΪ����·��������Ŀ��Ŀ¼��ʼ
			return "redirect:/emp/listAll.do";
			return "redirect:"+GlobalConst.BASE_URL+"emp/listAll.do";//�Ƽ�
			
			*//**----ת������ʾ�б�ҳ��--*//*
			//ת����/emp/listAll.do���
			return "forward:/emp/listAll.do";

		}else {//��½ʧ��
			System.out.println("��½ʧ��");
			session.setAttribute("errorMsg", "�˺Ż��������");
			return "redirect:toLogin.do";
		}
		
	}*/
	
	
	/**
	 * �����û���½ҵ��
	 * */
	@RequestMapping("/login.do")
	public ModelAndView login(User user,HttpSession session){
		System.out.println("user:"+user);
		boolean loginSuccess = userService.loginUser(user);
		ModelAndView mav = new ModelAndView();
		if (loginSuccess) {//��½�ɹ�
			System.out.println("��½�ɹ�");
			
			session.setAttribute("username",user.getUsername());
			//listAll.do Ϊ���·�� /listAll.doΪ����·��������Ŀ��Ŀ¼��ʼ
			
			/**----ת������ʾ�б�ҳ��--*/
			//ת����/emp/listAll.do���

			mav.setViewName("redirect:/emp/listAll.do");
//			mav.setViewName("forward:/emp/listAll.do");
		}else {//��½ʧ��
			System.out.println("��½ʧ��");
//			session.setAttribute("errorMsg", "�˺Ż��������");

			mav.setViewName("redirect:toLogin.do");
			mav.setViewName("login");
		}
		return mav;
	}
}
