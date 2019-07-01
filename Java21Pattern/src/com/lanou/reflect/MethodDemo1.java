package com.lanou.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
	��λ�ȡĳ������
	�������Ͳ����б�һ������ȷ��һ������

*/
public class MethodDemo1 {
	public static void main(String[] args) {
		A a = new A();
		Class c = a.getClass();	
		try {
//			c.getMethod("print", new Class[]{int.class, int.class});
			/*
			 * ��ȡһ��������Ҫ��Ҫ֪������������б�
			 * getMethod()ͨ������������ɱ������ȷ����������ȡ����public���ε�
			 * getDeclaredMethod()��ȡ����ȫ���ķ���
			 * 
			 */
			Method m = c.getMethod("print", int.class, int.class);
			//ִ������Object���͵ķ���ֵ
			m.invoke(a,10,20);
			Method m1 = c.getMethod("print", String.class, String.class);
			m1.invoke(a,"Hello", "World");
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		a.print(10, 20);
//		a.print("Hello", "World");
		catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


class A {
	public void print(int a, int b) {
		System.out.println(a + b);
	}
	public void print(String a, String b) {
		System.out.println(a + b);
	}
}
