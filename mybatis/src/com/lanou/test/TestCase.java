package com.lanou.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**��Ԫ����5��ע��
 * @BeforeClass	�����ʱִ��һ��
 * @Before 		ÿ����Ԫ���Է���ִ��֮ǰ������ִ��һ��
 * @Test		��Ԫ���Է���
 * @After		ÿ����Ԫ���Է���ִ��֮�󣬶���ִ��һ��
 * @AfterClass	���е�Ԫ���Է���ִ����֮����ִֻ��һ��
 * */
public class TestCase {
	/**�����ʱִ�У�ִֻ��һ��*/
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
	
	/**�������в��Է���������ɺ���ִ�У�ִֻ��һ��*/
	@AfterClass
	public static void m4(){
		System.out.println("m4()");
	}
}
