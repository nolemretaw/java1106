package com.lanou.excepton;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		//��catch���
		/*
		 	���һ�δ����ڲ�,���ܴ��ڶ���쳣,��ʱ����ʹ�ö���try-catch���.
		 	һ��ĳ��catch����ƥ����쳣����,�������쳣�������.
		 	һ���������,����ζ������try-catch���Ľ���.
		 	������catch��䲻����ƥ��Ͳ����쳣�Ļ���
		 	
		 	�ǳ���Ҫ��һ������~
		 	javaͨ���쳣�������쳣,���ڶ��catch�Ӿ���쳣�������,Ӧ�þ���������ײ��쳣���catch�Ӿ����ǰ��,ͬʱ������������Ը߲���쳣���
		 catch�Ӿ���ں���.����,����ײ��쳣���catch�Ӿ佫���ܱ�����!!!
		 	����,ͨ�����catch�����һ��catch�Ӿ䲶����쳣����ΪException!
		 */
		int[] arr = new int[3];
		try {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = i;
				System.out.println("arr[" + i + "] = " + arr[i]);
				System.out.println("arr[" + i + "]��" + (i - 2) +"��ֵ:" + arr[i] / (i - 2));

			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�����±�Խ���쳣");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("����Ϊ0���쳣");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("�����쳣");
			e.printStackTrace();
		}
		System.out.println("��������ִ��");
	}
}
