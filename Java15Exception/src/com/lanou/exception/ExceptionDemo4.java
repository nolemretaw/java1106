package com.lanou.exception;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		String[] strs = {"����", "����", "С��"};
		int i = 0;
		/*
		 	try catch finally���﷨��ʽ
		 	try {
		 		���ܻ�����쳣�Ĵ���
		 	} catch (Type1 t1) {
		 		���񲢴���try�׳����쳣����Type1
		 	} catch (Type2 t2) {
		 		���񲢴���try�׳����쳣����Type2
		 	} finally {
		 		�����Ƿ��׳��쳣������ִ�еĴ���
		 		ͨ�������ͷ���Դ������io���Ĺرգ����ݿ����ӵĹر�
		 	}
		 */
		/*
		 	try catch finally ���߲�����������
		 	try-catch
		 	try-finally û������
		 	try-catch-finally
		 */
		/*
		 	1��try�ڲ�û�в����쳣������catch��ִ��finally
		 	2��try�ڲ��������쳣����û��ƥ���catch��䣬���׸�JVM��
		 	finally��仹�ǻ�ִ�У�����finally֮�����䲻ִ�У�������ֹ��
		 	3��try�ڲ��������쳣����ƥ���catch��䣬ִ����catch���֮��
		 	ִ��finally�ڲ�����
		 */
		while (i < 4) {
			try {
				System.out.println(strs[i++]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�����±�Խ�磡");
				e.printStackTrace();
			} finally {
				//����try�е�����Ƿ��׳��쳣��finally�ڲ��Ĵ��붼��ִ�У�
				System.out.println("--------");
			}
		}
		System.out.println("��������ִ�У�");
		
		/*
		 	try catch finally С�᣺
		 	try�����ڼ���쳣�������Խ�������߶��catch��䣬���
		 		û��catch��䣬������finally
		 	catch�����ڴ���try���׳����쳣
		 	finally�������Ƿ����쳣������ִ�С�����try��catch���������
		 		return�ؼ��֣�finally������ڷ�������֮ǰִ�У�
		 	�������������finally��䲻ִ�У�
		 		finally�����в������쳣
		 		��ǰ��Ĵ�����ʹ����System.exit()�˳�����
		 		�������ڵ��߳�����
		 		�ر�CPU
		 */
		
		
		
		
		
		
		
		
		
		
		
	}
}
