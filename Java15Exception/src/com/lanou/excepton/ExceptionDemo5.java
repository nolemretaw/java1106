package com.lanou.excepton;

import java.io.IOException;
import java.net.ServerSocket;

public class ExceptionDemo5 {
	/*
	 	���һ�����������ڲ���������쳣,������û����������,�����ڷ�������ʱʹ��throws�����׳��쳣!!!
	 	eg:
	 	������ê,��������û�а취��������쳣,�Ǿ��ÿ������˻����޳�����������
	 */
	/*
	 	����׳�����Exception���͵��쳣,�ʹ���˷��������׳������쳣
	 	����Ǿ�����쳣����,����쳣֮��ʹ�ö��Ÿ���
	 	ʹ��throws�ؼ��ֽ��쳣�׸�������,��������߲��봦����쳣,���Լ��������׳�,������Ҫ���ܹ�������쳣�ĵ�����,
	 ���û��,����׸�JVM,����ͱ�����!
	 	ʹ��throws�ؼ��ֽ��쳣�׸�������,������Ҳ����ʹ��try-catch�����׳����쳣���в�����!
	 */
	/*
	 	throws�׳��쳣��ԭ��:
	 		1.���������ʱ�쳣,��ô���Բ�ʹ��throws�ؼ���������Ҫ�׳����쳣,�������˳��ͨ��,��������ʱ����ϵͳ�Զ��׳�
	 		2.����Ǳ������쳣,Ҫôʹ��try-catch����,Ҫôʹ��throws�׳�
	 		3.ֻ���׳����쳣,�÷����ĵ����߲ű��봦����������׳�,��������û����������ʱ,Ӧ�����ϼ����׳�
	 		4.���÷���������ѭ�κα������쳣�Ĵ������������.����дһ������,���������뱻��д������ͬ���쳣����,
	 	�������쳣����ֻ���Ǳ���д���������쳣��ͬ���������(������Exception)
	 */
	public static void method1() throws NegativeArraySizeException{
		//����һ������
		int[] arr = new int[-10];
	}
	
	public static void method2() throws IOException {
		ServerSocket socket = new ServerSocket(8080);
	}
	
	public static void main(String[] args) {
		try {
			method1();
		} catch (NegativeArraySizeException e) {
			System.out.println("���������쳣");
			e.printStackTrace();
		}
		
		try {
			method2();
		} catch (IOException e) {
			System.out.println("IO�쳣");
			e.printStackTrace();
		}
		System.out.println("��������ִ��");
	}
}
