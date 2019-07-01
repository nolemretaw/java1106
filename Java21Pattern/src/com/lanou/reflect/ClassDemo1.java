package com.lanou.reflect;

class Drum {
	
//	public Drum(String name) {
//		
//	}
	public void play() {
		System.out.println("��΢�����ڴ��");
	}
}
public class ClassDemo1 {
	/*`���������������� 	��������Զ���
	 * ��Ҳ�Ƕ�������java.lang.Class ���ʵ������
	 * There is class named Class.
	 */
	public static void main(String[] args) {
//		Drum drum = new Drum();
		//Drum ������� ��α�ʾ
		//����һ���඼��Class��ʵ�������ʵ�����������ֱ�ʾ����
		//1�� ʵ���ڸ�������ÿһ�����඼��һ�����ص������� class
		
		Class c = Drum.class;//��֪����ʱʹ��
		System.out.println(c);
		
		//2�� 
//		Class c1 = drum.getClass();//��֪��Ķ����getClass()��������ȡ�ö��������������
//		System.out.println(c1);
		/*
		 * 	c ��c1 ��ʾ��Drum�������(Class type)
		 * ��������Զ���
		 * ��Ҳ�Ƕ�����Class���ʵ����������������ǳ�Ϊ������ͣ������ͣ������������Ҳ�����������ֻ��һ�ݣ�
		 * һ����ֻ������Class���һ��ʵ������
		 */
		//3�� �����ַ�ʽ���Զ�̬�ļ���һ����
		Class c2 = null;
		try {
			c2 = Class.forName("com.lanou.reflect.Drum");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c2);
		
		/*
		 * 	��ȡ���������֮����ȫ����ͨ�������ͣ������������ʵ������ ִ��newInstance()����
		 * ���Ƿ���ֵĬ����Object���󣬿���ǿת
		 * 
		 */
		try {
			//����������ַ�ʽ�������󣬱��뱣֤�޲ι���Ĵ���
			Drum d = (Drum)c.newInstance();
			d.play();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
