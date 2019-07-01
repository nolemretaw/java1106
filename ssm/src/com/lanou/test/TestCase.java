package com.lanou.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lanou.bean.Emp;
import com.lanou.dao.EmpMapper;

public class TestCase {
	@Test
	public void test1(){
		//���������ļ�,����������spring����
		ApplicationContext ac = 
			new ClassPathXmlApplicationContext(
				"spring-mybatis.xml");
		
		//��ȡӳ��ӿ�
		EmpMapper mapper = 
			ac.getBean("empMapper",EmpMapper.class);
		
		List<Emp> emps = mapper.findAllEmp();
		for(Emp emp:emps){
			System.out.println(emp);
		}
	}
}



