package com.lanou.exception;

import java.io.IOException;
import java.net.ServerSocket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
	public static void main(String[] args) throws ParseException, IndexOutOfBoundsException {
		/*
		 	�쳣Exception�����Error������
		 	�쳣�ܱ����������������ܱ�����
		 	
		 	�쳣��java����Exception���������ʾ��
		 	�쳣��Ϊ���������쳣������ʱ�쳣
		 			  �ɲ��쳣�����ɲ��쳣
		 			  �ܼ��쳣�����ܼ��쳣
		 			  
		 	�������쳣��
		 	1����ȷ�ĳ����ڱ����У������׳��ֵġ�������ݵ��쳣�����
		 	�������쳣��Ȼ���쳣״��������һ���̶������ķ����ǿ���Ԥ�Ƶģ�
		 	���ұ����ȡĳ�ִ���ʽ��������������׳�
		 	2������RuntimeException���������⣬������Exception�������඼��
		 	�������쳣
		 	3��Java���������Զ���飬����һ�����������쳣��Ҫôʹ��
		 	try catch���в���Ҫôʹ��throws�����׳�
		 	
		 	����ʱ�쳣��
		 	1������RuntimeException���༰�����࣬��Щ�쳣ʱ������쳣��
		 	�����п���ѡ�񲶻���Ҳ���Բ�������Щ�쳣һ���������߼�
		 	��������ģ�������Դ��߼��ǶȾ����ܱ�������쳣�ĳ��֡�
		 	2��Java����������������Ҳ����˵���������п��ܳ��������쳣��
		 	��ʹû��try-catch��䲶��Ҳû��throws�׳���Ҳ��ͨ�����룬
		 	ֻ��������ʱ�������⡣
		 */
		
		/*
			�쳣��������������쳣����ʱ������Ҳ��Ȼ��ֹ�ˡ�
			�쳣����֮�����䶼����ִ����
		*/
		/*int a = 10, b = 0;
		System.out.println("a / b = " + a / b);*/
		
		/*int[] arr = new int[3];
		arr[3] = 10;*/
		
		/*
		 	ѡ�����쳣�Ĵ��� shift alt Z ����ִ�����ʾ
		 	��ʱ���ǿ���ѡȡtry catch �����в���
		 */
		try {
			ServerSocket socket = new ServerSocket(8080);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String str = "2018-12-11 10:20:30";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = sdf.parse(str);
		/*try {
			Date date = sdf.parse(str);
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		System.out.println("��������ִ�У�");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
