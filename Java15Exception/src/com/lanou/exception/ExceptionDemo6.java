package com.lanou.exception;

import java.io.IOException;
import java.net.ServerSocket;

public class ExceptionDemo6 {
	/*
	 	���һ�����������ڲ���������쳣��������û����������
	 	�����ڷ�������ʱʹ��throws�����׳��쳣������
	 	�ٸ����ӣ�
	 	������ê�ˣ���������û�а취��������쳣���Ǿ��ÿ������˻���
	 	�޳�����������
	 */
	/*
	 	����׳�����Exception���͵��쳣���ʹ���˷��������׳������쳣
	 	����Ǿ�����쳣���ͣ�����쳣֮��ʹ�ö��Ÿ���
	 	ʹ��throws�ؼ��ֽ��쳣�׸������ߣ���������߲��봦����쳣��
	 	���Լ��������׳���������Ҫ���ܹ�������쳣�ĵ����ߣ����û�У�
	 	����׸�JVM������ͱ����ˣ�
	 	ʹ��throws�ؼ��ֽ��쳣�׸������ߣ�������Ҳ����ʹ��try-catch���
	 	���׳����쳣���в�����
	 */
	/*
	 	throws�׳��쳣��ԭ��
	 	1�����������ʱ�쳣����ô���Բ�ʹ��throws�ؼ���������Ҫ�׳�
	 	���쳣���������˳��ͨ������������ʱ����ϵͳ�Զ��׳�
	 	2������Ǳ������쳣��Ҫôʹ��try-catch����Ҫôʹ��throws�׳�
	 	3��ֻ���׳����쳣���÷����ĵ����߲ű��봦����������׳���
	 	��������û����������ʱ��Ӧ�����ϼ����׳���
	 	4�����÷���������ѭ�κα������쳣�Ĵ������������
	 	����дһ�����������������뱻��д������ͬ���쳣���͡�
	 	�������쳣����ֻ���Ǳ���д���������쳣��ͬ��������ࡣ(������Exception)
	 */
	public static void method1() throws NegativeArraySizeException {
		//��������
		int[] arr = new int[-10];
	}
	
	public void method2() throws IOException {
		ServerSocket socket = new ServerSocket(8080);
	}
	
	public void method3() throws RuntimeException {
		System.out.println(5 / 0);
	}
	
	
	public static void main(String[] args) {
		try {
			method1();
		} catch (NegativeArraySizeException e) {
			System.out.println("���������쳣");
			e.printStackTrace();
		}
		
		try {
			ExceptionDemo6 e = new ExceptionDemo6();
			e.method2();
		} catch (IOException e) {
			System.out.println("IO�쳣");
			e.printStackTrace();
		}
		
		
		
		System.out.println("��������ִ�У�");
		
		
		
		
		
	}
}
