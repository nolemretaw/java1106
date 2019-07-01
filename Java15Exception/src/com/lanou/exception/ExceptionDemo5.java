package com.lanou.exception;

public class ExceptionDemo5 {
	public static int finallyTest() {
		int r = 1;
		try {
			r = 3;
			return r;
		} catch (Exception e) {
			return 0;
		} finally {
			//finally��������Է��صĻ����������͵�ֵ�ı䣬û��Ӱ��
			r = 5;
			System.out.println("������������");
		}
	}
	
	public static StringBuilder test() {
		//shift alt r ����ȫ���޸�
		StringBuilder sb = new StringBuilder("Hello");
		try {
			sb.append("World");
			return sb;
		} catch (Exception e) {
			return null;
		} finally {
			/*
			 	�������͵�ֵ��finally���޸Ļ�����仯
			 	��Ϊ�����ڲ�����ı�����ջ��������������ʱ�������ͻ�
			 	�����գ�����return��ֵ���Ƿ��ر�����ֵ����������һ��
			 	������������֮���ֵ���ظ�����ˣ�
			 */
			sb.append("!");
			System.out.println("������������");
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(finallyTest());
		System.out.println(test());
	}
}
