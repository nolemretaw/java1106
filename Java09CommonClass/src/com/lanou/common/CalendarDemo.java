package com.lanou.common;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		/*
		 	�����������������,���˻�ȡ����ʱ����Ϣ�ķ���
		 	���� �� ��  ��  ʱ  ��  ��ĵ�����ȡ,���ӷ���!
		 */
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH) + 1);
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(Calendar.MINUTE));
	}
}
