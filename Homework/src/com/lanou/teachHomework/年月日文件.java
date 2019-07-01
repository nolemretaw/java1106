package com.lanou.teachHomework;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class 年月日文件 {

	public static void main(String[] args) throws IOException {
		System.out.println("请输入一个年份");
		String nextLine = new Scanner(System.in).nextLine();
		int year = Integer.parseInt(nextLine);
		for (int month = 1; month <= 12; month++) {
			File monthDir = new File("C:\\Users\\dell\\Desktop\\"+nextLine,String.valueOf(month));
			if (monthDir.exists()) {
				monthDir.delete();
			}
			monthDir.mkdirs();
			Calendar c = new GregorianCalendar();
			c.set(Calendar.YEAR, year);
			c.set(Calendar.MONTH, month-1);
			int maxDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
			for (int day = 1; day <= maxDay ; day++) {
				File dayFile = new File(monthDir,day+".txt");
				if (dayFile.exists()) {
					dayFile.delete();
				}
				dayFile.createNewFile();
			}
		}
	}

}
