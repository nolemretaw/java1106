package com.lanou.calendar_����;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarDemo2 {

	public static void main(String[] args) throws ParseException {
		int month;
		String dateStr; 
		do {
			// 1����ʾ�û�������-���ַ���
			System.out.println("��������-��:");
			dateStr = new Scanner(System.in).nextLine();
			month = Integer.parseInt(dateStr.substring(dateStr.indexOf("-")+1));	
		} while (month<1||month>12);
		//���û�������ַ���ת��Date����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		Date date = sdf.parse(dateStr);
		//3����dateת��Calendar��������
		Calendar c = new GregorianCalendar();
		c.setTime(date);//����������ڸ�������
//		int year = c.get(Calendar.YEAR);
//		int day = c.get(Calendar.DAY_OF_MONTH);
		//4�����㵱ǰ��1�����ܼ�
		int dayofweek = c.get(Calendar.DAY_OF_WEEK) -1 ;
		System.out.println(month+"��");
		//5�����㵱ǰ�·ݵ��������
		int maxDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		//6��ѭ����ӡ����
		//��������������жϵ�ǰ�д�ӡ�˶��ٴ�
		//��һ���ǿո�����֣����洿���֣�7�λ�һ��
		int count = 0 ;
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		//ѭ����ӡ�ո�
		for (int i = 0; i < dayofweek; i++) {
			System.out.print("\t");
			count++;
			
		}
		//ѭ����ӡ����
		for (int i = 1; i <= maxDay; i++) {
			System.out.print(i<10?" " + i + "\t":i +"\t");
			count++;
			if (count % 7 == 0) {
				System.out.println();//����
			}
		}
		
		
		
	}

}
