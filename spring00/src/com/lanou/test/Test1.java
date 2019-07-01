package com.lanou.test;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lanou.bean.Emp;
import com.lanou.controller.EmpController;

public class Test1 {
	public static void main(String[] args) {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		EmpController controller = ac.getBean("empController",EmpController.class);
		List<Emp> emps = controller.findAll();
		for (Emp emp : emps) {
			System.out.println(emp);
		}
		controller.delete(1);
	}
}
