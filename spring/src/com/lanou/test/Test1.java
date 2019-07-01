package com.lanou.test;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lanou.bean.ExampleBean;
import com.lanou.bean.MessageBean;
import com.lanou.bean.School;
import com.lanou.bean.Student;
import com.lanou.bean.Teacher;

public class Test1 {
	public static void main(String[] args) {
		//加载配置文件，实例化并且启动spring容器
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		test1(ac);
//		test2(ac);
//		test3(ac);
		test4(ac);
	}
	private static void test4(AbstractApplicationContext ac) {
		MessageBean msg = ac.getBean("msg1",MessageBean.class);
		msg.show();
		
	}
	private static void test2(AbstractApplicationContext ac) {
		//根据id从容器中获取一个exampleBean对象
		ExampleBean e1 = ac.getBean("exam", ExampleBean.class);
		System.out.println(e1);
		ExampleBean e2 = ac.getBean("exam", ExampleBean.class);
		System.out.println(e2);
		//关闭spring容器
		ac.close();
	}
	/**测试bean对象的属性*/
	private static void test1(ApplicationContext ac) {
		//构建spring容器中配置构建bean对象
		//直接new对象
		GregorianCalendar gc = ac.getBean("c1", GregorianCalendar.class);
		System.out.println(gc);
		
		//静态工厂
		Calendar c = ac.getBean("c2", Calendar.class);
		System.out.println(c);
		
		//实例工厂
		Date date = ac.getBean("date", Date.class);
		System.out.println(date);
	}
	
	/**测试DI依赖注入*/
	private static void test3(AbstractApplicationContext ac) {
		Student student = ac.getBean("stu1", Student.class);
		Teacher teacher = ac.getBean("tea", Teacher.class);
		School school = ac.getBean("sch1", School.class);
		student.show();
		teacher.show();
		school.show();
	}
}
