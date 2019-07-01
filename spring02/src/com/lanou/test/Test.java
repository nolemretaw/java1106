package com.lanou.test;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.lanou.bean.Emp;
import com.lanou.controller.EmpController;
import com.lanou.dao.EmpDao;
import com.lanou.dao.Impl.EmpDaoImpl;
import com.lanou.service.EmpService;

public class Test {
	public static void main(String[] args) {
		//ʵ������ȥ����Spring����
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		EmpController controller = ac.getBean("empController", EmpController.class);
		/*List<Emp> findAll = controller.service();*/
//		//ͨ������Spring��ȡdao���
//		EmpDao empDao = ac.getBean("empDao", EmpDaoImpl.class);
//		List<Emp> emps = empDao.findAll();
////		Emp emp = empDao.findEmpById(99);
//		Emp emp = new Emp();
//		emp.setName("������");
//		emp.setSalary(109000);
//		emp.setAge(34);
//		empDao.addEmp(emp);
//		
//		empDao.deleteEmpById(1);
		/*for (Emp emp : findAll) {
			
			System.out.println(emp);
		}*/
//		System.out.println(emp);
		Emp emp = new Emp();
		emp.setName("�尢��");
		emp.setSalary(109000);
		emp.setAge(34);
		
		controller.insert(emp);
		/*List<Emp> emps = controller.service();
		for (Emp emp : emps) {
			System.out.println(emp);
		}*/
		
	}
}
