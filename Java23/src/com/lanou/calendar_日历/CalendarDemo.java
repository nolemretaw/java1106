package com.lanou.calendar_����;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarDemo {
	public static String transMon(int month) {//ת������
		switch (month) {
		case 1:
			return "һ��";
		case 2:
			return "����";
		case 3:
			return "����";
		case 4:
			return "����";
		case 5:
			return "����";
		case 6:
			return "����";
		case 7:
			return "����";
		case 8:
			return "����";
		case 9:
			return "����";
		case 10:
			return "ʮ��";
		case 11:
			return "ʮһ��";
		case 12:
			return "ʮ����";
		default:
			break;
		}
		return null;
	}
	public static void printCalendar(Calendar calendar) {
		boolean isLeapYear = false;
		int month = calendar.get(Calendar.MONTH)+1;
		int year = calendar.get(Calendar.YEAR);
		int day = calendar.get(Calendar.DAY_OF_MONTH);//����
		
		int dayInweek = calendar.get(Calendar.DAY_OF_WEEK); 
	
		int monthAllday = calendar.getActualMaximum(Calendar.DATE);//������		
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append(year + "��\t" + transMon(month) + "\n" + "��\tһ\t��\t��\t��\t��\t��\t\n");
		//���µ�һ���м���
		int k = (day - dayInweek) >= 0 ? (day - dayInweek)%7 : (dayInweek - day)%7;
		for (int i = 0; i < 7 - k; i++) {
				sBuffer.append("\t");
		}
		for (int i = 1; i <= monthAllday; i++) {
			if (i == day) {
				sBuffer.append("��");
			}
			sBuffer.append(i + "\t");
			if ((i % 7) == k) {
				sBuffer.append("\n");
			}
		}
		System.out.println(sBuffer);
	}
	public static void main(String[] args) throws ParseException {
	
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("��������:������yyyy-MM-dd��");
			String dString = scanner.nextLine();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");;
			Date date = sdf.parse(dString);//ת��������
			
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);//����Ϊcalendar
			printCalendar(calendar);	
		}
		
	
	}

}
