package com.lanou.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**单元测试5个注解
 * @BeforeClass	类加载时执行一次
 * @Before 		每个单元测试方法执行之前，都会执行一次
 * @Test		单元测试方法
 * @After		每个单元测试方法执行之后，都会执行一次
 * @AfterClass	所有单元测试方法执行完之后，再只执行一次
 * */
public class TestCase {
	/**类加载时执行，只执行一次*/
	@BeforeClass
	public static void m(){
		System.out.println("m()");
	}
	
	@Before
	public void m0(){
		System.out.println("m0()");
	}
	
	@Test
	public void m1(){
		System.out.println("m1()");
	} 
	
	@Test
	public void m2(){
		System.out.println("m2()");
	}
	
	@After
	public void m3(){
		System.out.println("m3()");
	}
	
	/**类中所有测试方法测试完成后再执行，只执行一次*/
	@AfterClass
	public static void m4(){
		System.out.println("m4()");
	}
}
