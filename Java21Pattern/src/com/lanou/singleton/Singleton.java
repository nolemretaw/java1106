package com.lanou.singleton;

public class Singleton {
	// ����
	// ����ܷ��ʵĵ���ʵ��
	/*
	 * private static Singleton instance; //���췽��˽�л�����֤��粻������new ����ʵ�� private
	 * Singleton() { }
	 * 
	 * public static Singleton getInstance() { 
	 * if (instance == null) { 
	 * instance= new Singleton();//����new 
	 * } 
	 * return instance; 
	 * }
	 */
	// ������������ڴ���˷�
	// private static Singleton instance = new Singleton();
	//
	// private Singleton (){}
	//
	// public static Singleton getInstance() {
	// return instance;
	// }
	// �����̰߳�ȫ��Ч�ʵ�
//	private static Singleton instance;
//
//	private Singleton() {
//	}
//
//	public static synchronized Singleton getInstance() {
//		if (instance == null) {
//			instance = new Singleton();
//		}
//		return instance;
//	}
	//�����̰߳�ȫ��Ч�ʸߣ�˫��У��
	private static Singleton instance = null;

	private Singleton() {}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

}