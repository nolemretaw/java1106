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
		//加载配置文件,创建并启动spring容器
		ApplicationContext ac = 
			new ClassPathXmlApplicationContext(
				"spring-mybatis.xml");
		
		//获取映射接口
		EmpMapper mapper = 
			ac.getBean("empMapper",EmpMapper.class);
		
		List<Emp> emps = mapper.findAllEmp();
		for(Emp emp:emps){
			System.out.println(emp);
		}
	}
}



