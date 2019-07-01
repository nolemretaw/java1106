package com.lanou.common;

import java.text.SimpleDateFormat;
import java.util.Date;

//ÈÕÆÚ×ª×Ö·û´®
public class HomeworkDate {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(date);
		System.out.println(format);
		
	}
}
