package com.lanou.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lanou.bean.Emp;
import com.lanou.service.EmpService;

@Controller
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	private EmpService empService;
	/**
	 * ���ڲ����������ݣ��ش���JSPҳ��
	 * */
	@RequestMapping("/listAll.do")
	public String listAll(Model model){
		List<Emp> emps = empService.findAll();
		model.addAttribute("emps",emps);
		System.out.println("--------listAll()-------");
		return "list";
	}
	
	/**�������Ա������*/
	@RequestMapping("/toAddEmp.do")
	public String toAddEmp(){
		return "addEmp";
	}
	
	/**�������Ա��ҵ��
	 * @throws ParseException */
	@RequestMapping("/addEmp.do")
	public String addEmp(Emp emp,String birth) throws ParseException{
		System.out.println(emp);
		System.out.println("birth:"+birth);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		/*String string = null;
		string.length();*/
//		Date date = sdf.parse(birth);
	
		//���
		empService.addEmp(emp);
		return "redirect:listAll.do";
	}
	
	/**
	 * �ֲ��쳣����ֻ����ǰ�����������������׳����쳣
	 * @param e:�������������׳����쳣
	 * */
	@ExceptionHandler
	public String handleException(Exception e,HttpSession session){
		session.setAttribute("e", e);
		//�ж��쳣����
		if (e instanceof ParseException) {
			return "parse";
		}else if (e instanceof NullPointerException) {
			return "null";
		}else {
			return "error";
		}
	}
	
}
