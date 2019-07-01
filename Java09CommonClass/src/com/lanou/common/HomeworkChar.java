package com.lanou.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//×Ö·û´®×ªÈÕÆÚ
public class HomeworkChar {
	public static void main(String[] args) throws ParseException {
		String str = "2018-12-1 15:49:20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date newDate = sdf.parse(str);
		System.out.println(newDate);
	}
}
