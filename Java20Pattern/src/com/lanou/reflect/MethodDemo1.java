package com.lanou.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 	��λ�ȡһ������
 	���������ƺͷ��������б�,����Ψһ����һ������
 */
public class MethodDemo1 {
	public static void main(String[] args) {
		A a = new A();
		Class c = a.getClass();
		try {
			/*
			 	��ȡһ������,��Ҫ֪������������б�
			 	getMethod()ͨ������������ɱ������ȷ������
			 	getMetho()��ȡ����public���ε�
			 	getDeclaredMethod()��ȡ�������еķ���
			 */
			Method m = c.getMethod("print", int.class, int.class);
			//ִ�������з���ֵ��,������Object���͵�,��Ҫ��ת��
			m.invoke(a, 10, 20);
			
			Method method = c.getMethod("print", String.class, String.class);
			method.invoke(a, "����", "�ϵ�");
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
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
