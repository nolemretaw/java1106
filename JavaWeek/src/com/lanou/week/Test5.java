package com.lanou.week;
/**
 * F11:�Զϵ�����
 * F6:��������
 * F5:�������ô����뵽�����ڲ�
 * F7:�����ڲ����뵽�������ô�
 * F8:�����ϵ�ִ��
 * */
public class Test5 {

	public static void main(String[] args) {
		add(10,0);
	}
	public static int add(int a,int b) {
		System.out.println("add()");
		if (a!=0&&b!=0) {
			return a+b;
		} else {
			return 0;
		}
	}

}
