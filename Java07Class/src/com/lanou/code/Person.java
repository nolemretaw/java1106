package com.lanou.code;

/*
 	�ඨ����﷨��ʽ
 	�������η� class ���� {
 		���ԡ�����
 		��������Ϊ
 	}
 	1����������ĸ��д��
 	2�����Ƕ�һ�������ͬ���Ժ���Ϊ������ĳ���
 	��Ͷ��������
 		���ǳ���ģ��������Ǿ����
 		��ķ�Χ����
 		���Ƕ����ģ�壬���������ʵ��
 		��������Զ���
 */
public class Person {
	
	//��������������(��Ա����)����������һ�����е���Ϣ
	String name;//����
	String gender;//�Ա�
	int age;//����
	double height;//���
	
	//��Ϊ������
	public void eat() {
		System.out.println("���ڳԶ�����");
	}
	public void sleep() {
		System.out.println("����˯������");
	}
	//���ҽ���
	public void introduce() {
		System.out.println("����: " + name +
							"�Ա�: " + gender +
							"����: " + age +
							"���: " + height);
	}
	
	
	
	
	
	
}
