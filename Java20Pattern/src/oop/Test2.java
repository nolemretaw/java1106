package oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*class  TestThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("a");
		}
	}
}*/



public class Test2 {
	public static void main(String[] args) throws ParseException {
		//yyyy-MM-dd  HH:mm:ss
		Date date = new Date();
		System.out.println(date);
		//创建一个日期格式转换器对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//通过转换器来格式化日期
		String s = sdf.format(date);
		System.out.println(s);
		
		//将字符串转成日期
		String string = "2014-12-24";
		Date date2 = sdf.parse(string);
		System.out.println(date2);
		
		
		
		//Calendar calendar = Calendar.getInstance();
		//格里高利历
		Calendar calendar = new GregorianCalendar();
		int  year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		
		
		
		
		
		
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("i");
				}
			}
		}.start();
	}
}
