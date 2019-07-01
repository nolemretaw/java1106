package com.lanou.teachHomework;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 输入一个年份,以年份为目录,所有月份为子目录
     在子目录中以当前月份的天数创建相应文件
 */
public class Test2 {
	public static void main(String[] args) throws IOException {
		System.out.println("请输入一个年份:");
		int year = new Scanner(System.in).nextInt();
		//月份
		for(int month=1;month<=12;month++){
			//创建以年份为总目录,月份为子目录
			File monthDir = new File(String.valueOf(year),
					String.valueOf(month));
			//如果存在,删除
			if(monthDir.exists()){
				monthDir.delete();
			}
			//创建子目录
			monthDir.mkdirs();
			
			//在每个子目录中创建相应文件
			Calendar c = new GregorianCalendar();
			c.set(Calendar.YEAR,year);
			c.set(Calendar.MONTH,month-1);
			//获取当前月最大天数
			int maxDay = c.getActualMaximum(
				Calendar.DAY_OF_MONTH);
			for(int day=1;day<=maxDay;day++){
				//文件路径
				File dayFile = new File(monthDir,day+".txt");
				if(dayFile.exists()){
					dayFile.delete();
				}
				dayFile.createNewFile();
			}
		}
	}
}
