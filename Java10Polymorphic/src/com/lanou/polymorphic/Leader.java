package com.lanou.polymorphic;

public class Leader {
	//Ѳ��
	/*
	 	�ӿڶ�̬:
	 		�ӿڵ�����ָ����ʵ���˴˽ӿ���Ķ���
	 */
	public void watch(TeachInterface teacher) {
		System.out.println("��ʼѲ��");
		teacher.teach();
		System.out.println("����Ѳ��");
	}
}
