package com.lanou.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ClassDemo4 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("����");
		//list2.add(10);//�����
		Class class1 = list1.getClass();
		Class class2 = list2.getClass();
		/*
		 	����Ĳ������Ǳ���֮��Ĳ���
		 	c1 = c2 ˵�� ����֮��,���Ϻͷ�����ȥ���ͻ���
		 	java�м��ϵķ����Ƿ�ֹ��������,ֻ�ڱ�������Ч
		 �ƹ�����֮���;Ͳ���������
		 */
		System.out.println(class1 == class2);
		try {
			Method method = class2.getMethod("add", Object.class);
			method.invoke(list2, "����");
			method.invoke(list2, 10);
			System.out.println(list2);
			System.out.println(list2.size());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
