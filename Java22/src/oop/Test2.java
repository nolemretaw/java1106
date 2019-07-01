package oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/*class TestThread extends Thread{
	@Override
	public void run() {
		for (int i = 1; i <= 10 ; i++) {
			System.out.println("addidas");
		}
	}
}*/
public class Test2 {
	public static void main(String[] args) throws ParseException {
		Thread t = new Thread(){
			@Override
			public void run() {
				for (int i = 1; i <= 10 ; i++) {
					System.out.println("addidas");
				}
			}
		};
		t.start();
		Date date = new Date();
		System.out.println(date);
		//创建一个日期格式转换器对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		//将日期转字符串
		String string = sdf.format(date);
		System.out.println(string);
		
		//将字符串转日期
		String string2 = "2018年12月24日";
		Date date2 = sdf.parse(string2);
		System.out.println(date2);
		
		Calendar c = Calendar.getInstance();
		Calendar c1 = new GregorianCalendar();
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
	}
}
