package com.lanou.test;

import java.io.IOException;
import java.io.InputStream;
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

public class TestCase3 {
	static SqlSessionFactory factory;
	SqlSession session;
	static InputStream in;
	
	@BeforeClass
	public static void init(){
		System.out.println("====init()====");
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		in = TestCase3.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml");
		factory = builder.build(in);
	}
	
	@Before
	public void openSession(){
		System.out.println("======openSession()======");
		session = factory.openSession();
	}
	
	/**测试一对一关联查询*/
//	@Test
	public void m1(){
		//获取映射接口
		/*TeamMapper teamMapper = session.getMapper(TeamMapper.class);
		Team team = teamMapper.findTeamById(1);
		System.out.println(team);
		
		//查找team关联的coach对象
		Coach coach = team.getCoach();
		System.out.println(coach);*/
		
		
		CoachMapper coachMapper = session.getMapper(CoachMapper.class);
		Coach coach = coachMapper.findCoachById(2);
		System.out.println(coach);
		
		//查找coach所关联的team
		Team team = coach.getTeam();
		System.out.println(team);
	}
	
	/**测试一对多和多对一关联查询*/
//	@Test
	public void m2(){
		/*PeopleMapper peopleMapper = session.getMapper(PeopleMapper.class);
		People people = peopleMapper.findPeopleById(2);
		System.out.println(people);
		//查询people所关联的card集合
		List<Card> cards = people.getCards();
		for (Card card : cards) {
			System.out.println(card);
		}*/
		
		CardMapper cardMapper = session.getMapper(CardMapper.class);
		Card card = cardMapper.findCardById(2);
		System.out.println(card);
		//查询当前card关联的people
		People people = card.getPeople();
		System.out.println(people);
		
	}
	
	/**
	 * 多对多的级联查询测试
	 * */
	@Test
	public void m3(){
		//根据老师id查询
		TeaAndStuMapper teaAndStuMapper = session.getMapper(TeaAndStuMapper.class);
		List<TeaAndStu> list = teaAndStuMapper.findTeaAndStuById(1);
		Teacher teacher = list.get(0).getTeachers().get(0);
		System.out.println(teacher);
		for (TeaAndStu tea : list) {
			List<Student> students = tea.getStudents();
			System.out.println(students.get(0));
		}
		
		
		
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
