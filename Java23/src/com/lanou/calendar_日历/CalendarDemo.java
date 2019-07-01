package com.lanou.calendar_日历;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarDemo {
	public static String transMon(int month) {//转汉字月
		switch (month) {
		case 1:
			return "一月";
		case 2:
			return "二月";
		case 3:
			return "三月";
		case 4:
			return "四月";
		case 5:
			return "五月";
		case 6:
			return "六月";
		case 7:
			return "七月";
		case 8:
			return "八月";
		case 9:
			return "九月";
		case 10:
			return "十月";
		case 11:
			return "十一月";
		case 12:
			return "十二月";
		default:
			break;
		}
		return null;
	}
	public static void printCalendar(Calendar calendar) {
		boolean isLeapYear = false;
		int month = calendar.get(Calendar.MONTH)+1;
		int year = calendar.get(Calendar.YEAR);
		int day = calendar.get(Calendar.DAY_OF_MONTH);//几号
		
		int dayInweek = calendar.get(Calendar.DAY_OF_WEEK); 
	
		int monthAllday = calendar.getActualMaximum(Calendar.DATE);//所有天		
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append(year + "年\t" + transMon(month) + "\n" + "日\t一\t二\t三\t四\t五\t六\t\n");
		//该月第一周有几天
		int k = (day - dayInweek) >= 0 ? (day - dayInweek)%7 : (dayInweek - day)%7;
		for (int i = 0; i < 7 - k; i++) {
				sBuffer.append("\t");
		}
		for (int i = 1; i <= monthAllday; i++) {
			if (i == day) {
				sBuffer.append("√");
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
			System.out.println("输入日期:（形如yyyy-MM-dd）");
			String dString = scanner.nextLine();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");;
			Date date = sdf.parse(dString);//转成日期类
			
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);//设置为calendar
			printCalendar(calendar);	
		}
		
	
	}

}
