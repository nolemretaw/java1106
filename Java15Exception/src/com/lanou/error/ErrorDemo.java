package com.lanou.error;

public class ErrorDemo {
	public static void main(String[] args) {
		/*
		 	����Error�ǳ����޷�����ģ���ʾ��������ʱ���ֵ�
		 	��Ϊ���ص����⡣
		 	���������������д�Ͳ����޹أ��������������ʱ
		 	JVM���ֵ����⡣
		 	���磺VirtualMachineError�е��ڴ����OutOfMemoryError
		 	�����ǲ��ɲ�ģ���Ϊ������Ӧ�ó���Ŀ��ƺʹ�������֮��
		 	������java��ͨ��Error���������ʾ
		 */
		int[] arr = new int[1024 * 1024 * 1024];
		
	}
}
