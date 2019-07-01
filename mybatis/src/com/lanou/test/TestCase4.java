package com.lanou.test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

import com.lanou.bean.Card;
import com.lanou.bean.Coach;
import com.lanou.bean.Emp;
import com.lanou.bean.People;
import com.lanou.bean.Student;
import com.lanou.bean.TeaAndStu;
import com.lanou.bean.Teacher;
import com.lanou.bean.Team;
import com.lanou.bean.User;
import com.lanou.dao.CardMapper;
import com.lanou.dao.CoachMapper;
import com.lanou.dao.EmpMapper;
import com.lanou.dao.PeopleMapper;
import com.lanou.dao.TeaAndStuMapper;
import com.lanou.dao.TeamMapper;

public class TestCase4 {
	static SqlSessionFactory factory;
//	SqlSession session;
	static InputStream in;
	
	/**测试二级缓存
	 * 在同一个EmpMapper下打开两个sqlSession
	 * */
	@Test
	public void testSecondLevelCache(){
		SqlSession session1 = factory.openSession();
		EmpMapper mapper1 = session1.getMapper(EmpMapper.class);
		Emp emp1 = mapper1.findEmpById(1);
		System.out.println(emp1);
		session1.close();
		
		System.out.println("------------------------------------");
		SqlSession session2 = factory.openSession();
		EmpMapper mapper2 = session2.getMapper(EmpMapper.class);
		Emp emp2 = mapper2.findEmpById(1);
		System.out.println(emp2);
		session2.close();
	}
	
//	@Test
//	public void testFirstLevelCache(){
//		EmpMapper mapper = session.getMapper(EmpMapper.class);
//		Emp emp = mapper.findEmpById(1);
//		System.out.println(emp);
//		
//		Emp emp2 = mapper.findEmpById(1);
//		System.out.println(emp2);
//		
//	}
	
	
	
	@BeforeClass
	public static void init(){
		System.out.println("====init()====");
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		in = TestCase4.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml");
		factory = builder.build(in);
	}
	
//	@Before
//	public void openSession(){
//		System.out.println("======openSession()======");
//		session = factory.openSession();
//	}
	
	
//	@After
//	public void closeSession(){
//		System.out.println("========closeSession()========");
//		session.commit();
//		session.close();
//	}
//	
	
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
