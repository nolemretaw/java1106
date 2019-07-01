package com.lanou.common;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class DateInitial {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		System.out.println(new TranDateStrs(date).datetoString());
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个新日期");
		String string = scanner.next();//输入		
		TranDateStrs tranDateStrs = new TranDateStrs(string);
		Date newdate = tranDateStrs.stringtoDate();
		System.out.println(newdate);
	}

}
