package com.lanou.exception;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		//��catch���
		/*
		 	���һ�δ����ڲ������ܴ��ڶ���쳣����ʱ����ʹ��
		 	����try-catch��䡣
		 	һ��ĳ��catch����ƥ����쳣���ͣ��������쳣������롣
		 	һ���������������ζ������try-catch���Ľ�����
		 	������catch��䲻����ƥ��Ͳ����쳣�Ļ���
		 	
		 	�ǳ���Ҫ��һ������~~~
		 	javaͨ���쳣�������쳣�����ڶ��catch�Ӿ���쳣������ԣ�
		 	Ӧ�þ���������ײ��쳣���catch�Ӿ����ǰ�棬ͬʱ������
		 	������Ը߲���쳣���catch�Ӿ���ں��档���򣬲���
		 	�ײ��쳣���catch�Ӿ佫���ܱ����Σ�����
		 	���ң�ͨ����catch�����һ��catch�Ӿ䲶����쳣����Ϊ
		 	Exception!
		 */
		int[] arr = new int[3];
		try {
			for (int i = 0; i <= arr.length; i++) {
				arr[i] = i;
				System.out.println("arr[" + i + "] = " + arr[i]);
				System.out.println("arr[" + i + "]��" + (i - 2) +
									"��ֵ:" + arr[i] / (i - 2));
			}
		} catch (ArithmeticException e) {
			System.out.println("����Ϊ0�쳣");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�����±�Խ���쳣");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("�����쳣");
			e.printStackTrace();
		}
		
		System.out.println("��������ִ�У�");
		
		
		
	}
}
 