package com.lanou.polymorphic;

public class Initial {
	public static void main(String[] args) {
		Leader leader = new Leader();
		/*
	 	�ӿڶ�̬��
	 	�ӿڵ�����ָ����ʵ���˴˽ӿ���Ķ���
	 */
		TeachInterface teachInterface = new JavaTeacher();
		leader.watch(teachInterface);
		
		TeachInterface teachInterface1 = new H5Teacher();
		leader.watch(teachInterface1);
	}
}

