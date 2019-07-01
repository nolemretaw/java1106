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

import com.lanou.bean.Emp;
import com.lanou.bean.User;
import com.lanou.dao.EmpMapper;

public class TestCase2 {
	static SqlSessionFactory factory;
	SqlSession session;
	static InputStream in;
	
	@BeforeClass
	public static void init(){
		System.out.println("====init()====");
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		in = TestCase2.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml");
		factory = builder.build(in);
	}
	
	@Before
	public void openSession(){
		System.out.println("======openSession()======");
		session = factory.openSession();
	}
	
	/**
	 * 动态拼接部门编号查询数据
	 * */
	
	public void m1() {
		Emp emp = new Emp();
//		emp.setDeptno(30);
		List<Emp> emps = session.selectList("emp.findEmpByDeptNo", emp);
		for (Emp e : emps) {
			System.out.println(e);
		}
	}
	
	/**动态拼接，根据salary查询*/

	public void m2() {
		Emp emp = new Emp();
		emp.setSalary(5000);
		List<Emp> emps = session.selectList("emp.findEmpBySalary",emp);
		for (Emp e : emps) {
			System.out.println(e);
		}
	}
	
	/**动态拼接，根据sex查询*/
	public void m3() {
		Emp emp = new Emp();
		emp.setSex("女");
		List<Emp> emps = session.selectList("emp.findEmpBySex",emp);
		for (Emp e : emps) {
			System.out.println(e);
		}
	}
	
	/**动态拼接，根据deptno/salary查询*/
	public void m4() {
		Emp emp = new Emp();
		emp.setDeptno(20);
		emp.setSalary(6000);
		List<Emp> emps = session.selectList("emp.findByDeptnoAndSalary",emp);
		for (Emp e : emps) {
			System.out.println(e);
		}
	}
	
	/**根据传入条件动态拼接修改的sql语句*/
//	@Test
	public void m5(){
		Emp emp = new Emp();
		emp.setName("张无忌");
		emp.setId(1);
		emp.setSex("男");
		emp.setJob("教学");
		emp.setSalary(8000);
		
		emp.setHiredate(Date.valueOf("2019-4-11"));
		emp.setDeptno(10);
		int rows = session.update("emp.updateEmp", emp);
		System.out.println("修改成功："+rows);
	}
	

	public void m6(){
//		List<Integer> deptnos = new ArrayList<>();
//		deptnos.add(20);
//		deptnos.add(30);
		int[] deptnos = {10,20,30};
		int rows = session.delete("emp.deleteEmpByDeptno",deptnos);
		System.out.println("删除成功："+rows);
	}
	
	/**接口映射根据id查找*/
//	@Test
	public void test7(){
		EmpMapper empMapper = session.getMapper(EmpMapper.class);
		Emp emp = empMapper.findEmpById(1);
		System.out.println(emp);
	}
	
	/**接口映射根据id删除*/
//	@Test
	public void test8(){
		EmpMapper empMapper = session.getMapper(EmpMapper.class);
		empMapper.deleteEmpById(2);
		System.out.println("删除");
	}
	
	/**接口映射添加emp*/
//	@Test
	public void test9(){
		EmpMapper empMapper = session.getMapper(EmpMapper.class);
		Emp emp = new Emp();
		emp.setName("郭靖");
		emp.setSex("男");
		emp.setJob("教学");
		emp.setSalary(9000);
		emp.setHiredate(Date.valueOf("1995-1-1"));
		emp.setDeptno(10);
		empMapper.addEmp(emp);
		System.out.println("添加emp");
	}
	
	/**接口映射，修改emp*/
//	@Test
	public void test10(){
		EmpMapper empMapper = session.getMapper(EmpMapper.class);
		Emp emp = new Emp();
		emp.setId(1);
		emp.setName("黄蓉");
		emp.setSex("女");
		emp.setJob("教学");
		emp.setSalary(8000);
		emp.setHiredate(Date.valueOf("1997-1-1"));
		emp.setDeptno(10);
		empMapper.updateEmp(emp);
		System.out.println("修改emp");
	}
	
	/**接口映射，查询全部*/
	@Test
	public void test11(){
		EmpMapper empMapper = session.getMapper(EmpMapper.class);
		List<Emp> list = empMapper.findAll();
		for (Emp emp : list) {
			System.out.println(emp);
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
