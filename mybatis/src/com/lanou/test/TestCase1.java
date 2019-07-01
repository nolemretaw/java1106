package com.lanou.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.lanou.bean.User;

public class TestCase1 {
	static SqlSessionFactory factory;
	SqlSession session;
	static InputStream in;
	
	@BeforeClass
	public static void init(){
		System.out.println("====init()====");
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		in = TestCase1.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml");
		factory = builder.build(in);
	}
	
	@Before
	public void openSession(){
		System.out.println("======openSession()======");
		session = factory.openSession();
	}
	
	
	public void m1(){
		User user = session.selectOne("u.findUserById", 5);
		System.out.println(user);
	}
	
	
	public void m2(){
		User user = new User();
		user.setUsername("猪猪");
		user.setPassword("123");
		user.setAge(23);
		user.setGender("男");
		session.insert("u.addUser",user);
	}
	
	/**根据名字/年龄查询用户
	 * $:"select * from user where username=${value}"
	 * 	"lisi" ===> "select * from user where username="+"lisi"
	 * 	===>"select * from user where username=lisi"
	 * #:"select * from user where username=#{username}"
	 * 	==>"select * from user where username="+"'lisi'"
	 * #会自动加上'',底层实现statement,
	 * $不会,底层实现preparestatement
	 * 传列名、表名才会使用$
	 * 
	 * */
	
	public void m3(){
//		String username = "\"大黄\"";
		String age = "'30'";
		User user = session.selectOne("u.findUserByName",age);
		System.out.println(user);
	}
	
	/**根据账号和密码查询一个user对象
	 * SQL注入：
	 * select * from user where username='Tom' and password='123' or 1=1
	 * */
	
	public void m4(){
		String username = "'Tom'";
		String password = "'123'";
		HashMap<String, String> map = new HashMap<>();
		map.put("username",username);
		map.put("password", password);
		List<User> list = session.selectList("u.findUserByNameAndPwd",map);
		System.out.println(list);
	}
	
	/**
	 * 传入列名，根据列名降序排序
	 * */
	@Test
	public void m5() {
		String columnName="age";
		List<User> users = session.selectList("u.selectUserByOrderColumn",columnName);
		System.out.println(users);
	}
	
	@After
	public void closeSession(){
		System.out.println("========closeSession()========");
		session.commit();
		session.close();
	}
	
	
	@AfterClass
	public static void closeIo(){
		System.out.println("======closeIo()======");
		try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
