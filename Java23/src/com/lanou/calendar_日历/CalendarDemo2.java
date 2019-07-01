package com.lanou.calendar_日历;

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
			// 1、提示用户输入年-月字符串
			System.out.println("请输入年-月:");
			dateStr = new Scanner(System.in).nextLine();
			month = Integer.parseInt(dateStr.substring(dateStr.indexOf("-")+1));	
		} while (month<1||month>12);
		//将用户输入的字符串转成Date日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		Date date = sdf.parse(dateStr);
		//3、将date转成Calendar日期类型
		Calendar c = new GregorianCalendar();
		c.setTime(date);//将输入的日期赋给日历
//		int year = c.get(Calendar.YEAR);
//		int day = c.get(Calendar.DAY_OF_MONTH);
		//4、计算当前月1号是周几
		int dayofweek = c.get(Calendar.DAY_OF_WEEK) -1 ;
		System.out.println(month+"月");
		//5、计算当前月份的最大天数
		int maxDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		//6、循环打印日历
		//定义计数变量，判断当前行打印了多少次
		//第一行是空格加数字，后面纯数字，7次换一行
		int count = 0 ;
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		//循环打印空格
		for (int i = 0; i < dayofweek; i++) {
			System.out.print("\t");
			count++;
			
		}
		//循环打印日期
		for (int i = 1; i <= maxDay; i++) {
			System.out.print(i<10?" " + i + "\t":i +"\t");
			count++;
			if (count % 7 == 0) {
				System.out.println();//换行
			}
		}
		
		
		
	}

}
