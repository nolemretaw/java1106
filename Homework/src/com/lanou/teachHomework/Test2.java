package com.lanou.teachHomework;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * ����һ�����,�����ΪĿ¼,�����·�Ϊ��Ŀ¼
     ����Ŀ¼���Ե�ǰ�·ݵ�����������Ӧ�ļ�
 */
public class Test2 {
	public static void main(String[] args) throws IOException {
		System.out.println("������һ�����:");
		int year = new Scanner(System.in).nextInt();
		//�·�
		for(int month=1;month<=12;month++){
			//���������Ϊ��Ŀ¼,�·�Ϊ��Ŀ¼
			File monthDir = new File(String.valueOf(year),
					String.valueOf(month));
			//�������,ɾ��
			if(monthDir.exists()){
				monthDir.delete();
			}
			//������Ŀ¼
			monthDir.mkdirs();
			
			//��ÿ����Ŀ¼�д�����Ӧ�ļ�
			Calendar c = new GregorianCalendar();
			c.set(Calendar.YEAR,year);
			c.set(Calendar.MONTH,month-1);
			//��ȡ��ǰ���������
			int maxDay = c.getActualMaximum(
				Calendar.DAY_OF_MONTH);
			for(int day=1;day<=maxDay;day++){
				//�ļ�·��
				File dayFile = new File(monthDir,day+".txt");
				if(dayFile.exists()){
					dayFile.delete();
				}
				dayFile.createNewFile();
			}
		}
	}
}
