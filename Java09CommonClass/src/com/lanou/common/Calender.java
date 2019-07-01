package com.lanou.common;

import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		/*日历类相对于日期类,多了获取单个时间信息的方法
		 * 
		 */
		System.out.println(Calendar.MONTH);
		System.out.println(calendar.get(Calendar.MONTH)+1);	
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
	}

}
