package com.lanou.reflect;

public class ClassDemo2 {

	public static void main(String[] args) {

		Class c1 = int.class;
		Class c2 = String.class;
		Class c3 = double.class;
		Class c4 = Double.class;
		Class c5 = void.class;
		/*
		 * Class�����getName�������Ի�ȡ������ ��������
		 * getSimpleName����Ҳ���Ի�ȡ��������������������
		 */
		System.out.println(c1.getName());
		System.out.println(c2.getSimpleName());
		System.out.println(c3.getName());
		System.out.println(c4.getName());
		System.out.println(c5.getName());
	}

}
