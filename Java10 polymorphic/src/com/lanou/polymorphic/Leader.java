package com.lanou.polymorphic;

public class Leader {
	//Ѳ��
	/*
	 	�ӿڶ�̬��
	 	�ӿڵ�����ָ����ʵ���˴˽ӿ���Ķ���
	 */
	public void watch(TeachInterface teacher) {
		System.out.println("��ʼѲ��");
		teacher.teach();//�ӿڵ�����ָ����ʵ���˴˽ӿ���Ķ���
		System.out.println("����Ѳ��");
	}
	
	/*public void watch(H5Teacher h5Teacher) {
		System.out.println("��ʼѲ��");
		h5Teacher.teach();
		System.out.println("����Ѳ��");
	}
	public void watch(JavaTeacher javaTeacher) {
		System.out.println("��ʼѲ��");
		javaTeacher.teach();
		System.out.println("����Ѳ��");
	}*/
}
