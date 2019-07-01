package com.lanou.singleton;

public class Singleton {
	//����ܷ��ʵĵ���ʵ��
	private static Singleton instance;

	//���췽��˽�л�,��֤��粻����new����ʵ��
	private Singleton() {
		
	}

	//�ṩ�����ķ��ʷ���
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
