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
		//����һ�����ڸ�ʽת��������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//ͨ��ת��������ʽ������
		String s = sdf.format(date);
		System.out.println(s);
		
		//���ַ���ת������
		String string = "2014-12-24";
		Date date2 = sdf.parse(string);
		System.out.println(date2);
		
		
		
		//Calendar calendar = Calendar.getInstance();
		//���������
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
