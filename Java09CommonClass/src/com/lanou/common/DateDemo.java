package com.lanou.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		/*日期时间是后期项目或开发一个非常重要的信息 而Java提供了Data类来封装日期信息,但是页面中能显示
		 * 的都是文本,所以日期与文本进行转换很重要
		 * 如何做到日期格式统一也是一个重要的问题
		 */
		//学习日期对象与日期字符串的互相转换
		//日期转字符串
		//创建日期对象
		//日期对象中封装了年月日时分秒周
		Date date = new Date();
		System.out.println(date);
		Date date2 = new Date(2019, 0, 1, 12, 0, 0);
		System.out.println(date2);
		//2018-11-30 15:54:00
		//y代表年 M代表月 ,d代表天 , H/h表示24时/12时, m代表分钟, s代表秒
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String timeSrt = sdf.format(date);
		System.out.println(timeSrt);
		//字符串转日期
		String str = "2018/11/30 18:05:30";
		//创建日期格式对象
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date newDate = sdf1.parse(str);
		System.out.println(newDate);
		/*日期转字符串
		 * format(日期)得到的是字符串
		 * 
		 * 字符串转日期
		 * parse(字符串)得到的日期
		 * 
		 * format() 与 parse() 都是SimpleDateFormate日期格式对象方法
		 */
	}
}
