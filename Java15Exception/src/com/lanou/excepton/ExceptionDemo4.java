package com.lanou.excepton;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		String[] strs = {"����", "����", "С��"};
		int i = 0;
		/*
		 	try catch finally���﷨��ʽ
		 	try {
		 		���ܻ�����쳣�Ĵ���
		 	} catch (Type1 t1) {
		 		���񲢴���try�׳����쳣����type1
		 	} catch (Type2 t2) {
		 		���񲢴���try�׳����쳣����type2
		 	} finally {
		 		�����Ƿ��׳��쳣,����ִ�еĴ���
		 		ͨ�������ͷ���Դ,eg:io���Ĺر�,���ݿ����ӵĹر�
		 	}
		 */
		/*
		 	try catch finally ���߲�����������
		 	try-catch
		 	try-finally û������
		 	try-catch-finally
		 */
		/*
		 	1.try�ڲ�û�в����쳣,����catch ִ��finally
		 	2.try�ڲ��������쳣,��û��ƥ���catch���,���׸�JVM,finally��仹�ǻ�ִ��,����finally֮�����䲻ִ��,������ֹ
		 	3.try�ڲ��������쳣,��ƥ���catch���,ִ����catch���֮��,ִ��finally�ڲ�����
		 */
		while (i < 4) {
			try {
				System.out.println(strs[i++]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�����±�Խ��");
				e.printStackTrace();
			} finally {
				//����try�е�����Ƿ��׳��쳣,finally���еĴ��붼��ִ��
				System.out.println("---------");
			}
		}
		System.out.println("��������ִ��");
		
		/*
		 	try catch finallyС��:
		 	try:���ڼ���쳣,�����Խ�������߶��catch���,���û��catch���,������finally
		 	catch:���ڴ���try���׳����쳣
		 	finally:�����Ƿ����쳣,����ִ��,����try,catch���������return�ؼ���,finally������ڷ�������֮ǰִ��!
		 	�����������,finally��䲻ִ��:
		 		finally�����в������쳣
		 		��ǰ��Ĵ�����ʹ����System.exit()�˳�����
		 		�������ڵ��߳�����
		 		�ر�CPU
		 */
	}
}
