package com.lanou.common;

import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		/*�����������������,���˻�ȡ����ʱ����Ϣ�ķ���
		 * 
		 */
		System.out.println(Calendar.MONTH);
		System.out.println(calendar.get(Calendar.MONTH)+1);	
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
	}

}
