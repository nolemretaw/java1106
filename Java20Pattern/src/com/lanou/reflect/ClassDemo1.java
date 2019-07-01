package com.lanou.reflect;

class Drum {
	/*public Drum(String name) {
		
	}*/
	public void play() {
		System.out.println("��ΰ����ڴ��!Boom~Boom~Boom~");
	}
}
public class ClassDemo1 {
/*
 	���������������� ��������Զ���
 	���Ƕ�����?��! ��ô��Ȼ��Ҳ�Ƕ���,��ô�����ĸ��۵Ķ���?
 	����java.lang.Class���ʵ������
 	There is a class named Class
 */
	public static void main(String[] args) {
		//����һ��Drum���ʵ��
		//Drum drum = new Drum();
		//Drum�������  ��ν��б�ʾ
		//����һ���඼��Class���ʵ��,���ʵ�����������ֱ�ʾ��ʽ
		//1.ʵ���ٸ�������ÿһ���඼��һ�����ص�������(��֪����������¿��Բ��õ�һ�ַ�ʽ)
		Class c = Drum.class;
		System.out.println(c);
		
		//2.��֪��Ķ���,����ʹ��getClass()������ȡ�ö��������������
		//Class c1 = drum.getClass();
		//System.out.println(c1);
		
		/*
		 	c �� c1 ��ʾ��Drum�������(Class type)
		 	��������Զ���     ��Ҳ�Ƕ���    ��Class���ʵ������
		 	����������ǳ�Ϊ������͡�������
		 	�����������Ҳ�����������ֻ��һ��
		 	һ����ֻ������Class���һ��ʵ������
		 */
		
		//3.�����ַ�ʽ���Զ�̬�ļ���һ����
		Class c2 = null;
		try {
			c2 = Class.forName("com.lanou.reflect.Drum");//��̬������
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c2);
		
		/*
		 	��ȡ���������֮��,��ȫ����ͨ�������������������ʵ������,ִ��newInstance()����
		 	���Ƿ���ֵĬ����Object����,����ǿת
		 */
		try {
			//����������ַ�ʽ��������,���뱣֤�޲ι���Ĵ���!
			Drum d = (Drum) c.newInstance();
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
