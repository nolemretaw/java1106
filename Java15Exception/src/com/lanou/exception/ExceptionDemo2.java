package com.lanou.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		/*
		 	�����쳣�Ļ���
		 	�׳��쳣�������쳣
		 	��������ʱ�쳣���������쳣������java������Ҫ���
		 	�쳣����ʽ��ͬ��
		 	����ʱ�쳣��Ϊ�˸����������׵�ʵ��Ӧ�ó���Ĺ��ܣ�
		 	java�涨������ʱ�쳣����java����ʱϵͳ�Զ��׳�������
		 	Ӧ�ó����������ʱ�쳣����Ϊ�˱�֤�����ִ�У����Բ���
		 	Error:�����ڲ����Բ���������Ϊ�����Error������Զ���ܱ�
		 	�������������Ҳ���ں����Ӧ�ó��򲻸ò�׽���쳣��
		 	�������쳣��Java�涨���쳣���벶������׳�����֮�⡣Ҳ����˵��
		 	������Ա������쳣���в���ʱ������ѡ���ڷ������׳���
		 	
		 	throw���κε�java���붼�����׳��쳣���磺�Լ���д�Ĵ��룬
		 	java���������еĴ��룬java������ʱϵͳ��������˭��������ͨ��
		 	java��throw���׳��쳣
		 	throws���ӷ������׳��쳣
		 	try-catch ���� try-catch-finally �����쳣
		 	
			������˵��java�涨�����ڱ������쳣���벶������׳�
			�����������ʱ�쳣������Error
		 */
		int a = 10, b = 0;
		/*
		 	try-catch�����﷨��ʽ��
		 	try {
		 		���������д�п��ܻᷢ���쳣�ĳ������
		 	} catch (�쳣���� �쳣������) {
		 		���񲢴���try���׳����쳣����
		 	}
		 */
		/*
		 	try����Ĵ����Ž�һ����ܷ����쳣�Ĵ������������
		 	��Ϊ�������
		 	java����������ʱ�����쳣���򴴽��쳣���󣬲���
		 	�������쳣�����׳��������֮�⣬��java����ʱϵͳ
		 	��ͼѰ��ƥ���catch�Ӿ䴦��
		 	�����ƥ���catch�Ӿ䣬���������쳣������룬try-catch������
		 	���û��ƥ���catch�Ӿ䣬�򱨴�
		 	ƥ���ԭ��
		 	����������쳣��������catch�Ӿ��е��쳣����������࣬����Ϊ
		 	���ɵ��쳣������catch�Ӿ䲶����쳣����ƥ�䡣
		 */
		try {
			//���b��0����ʱ�׳��쳣
			if (b == 0) {
				/*
				 	�ֶ��׳��쳣
				 	�쳣�׳�֮�󣬴�����ڲ��쳣֮��Ĵ��뽫����ִ��
				 	throw�ؼ��ֵ����ã�
				 	֧���ڴ�����ڲ�������λ�ã��ֶ��׳��쳣������
				 	һ�����if������á��ֶ��׳����쳣��ͬ��ҲҪȥ������
				 	���������ֹ
				 */
				throw new ArithmeticException();
			}
			System.out.println("a / b = " + a / b);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String str = "2018-12-11 11:42:30";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date = sdf.parse(str);
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		System.out.println("��������ִ�У�");
	}
}
