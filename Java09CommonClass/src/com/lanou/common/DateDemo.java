package com.lanou.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		/*����ʱ���Ǻ�����Ŀ�򿪷�һ���ǳ���Ҫ����Ϣ ��Java�ṩ��Data������װ������Ϣ,����ҳ��������ʾ
		 * �Ķ����ı�,�����������ı�����ת������Ҫ
		 * ����������ڸ�ʽͳһҲ��һ����Ҫ������
		 */
		//ѧϰ���ڶ����������ַ����Ļ���ת��
		//����ת�ַ���
		//�������ڶ���
		//���ڶ����з�װ��������ʱ������
		Date date = new Date();
		System.out.println(date);
		Date date2 = new Date(2019, 0, 1, 12, 0, 0);
		System.out.println(date2);
		//2018-11-30 15:54:00
		//y������ M������ ,d������ , H/h��ʾ24ʱ/12ʱ, m�������, s������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String timeSrt = sdf.format(date);
		System.out.println(timeSrt);
		//�ַ���ת����
		String str = "2018/11/30 18:05:30";
		//�������ڸ�ʽ����
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date newDate = sdf1.parse(str);
		System.out.println(newDate);
		/*����ת�ַ���
		 * format(����)�õ������ַ���
		 * 
		 * �ַ���ת����
		 * parse(�ַ���)�õ�������
		 * 
		 * format() �� parse() ����SimpleDateFormate���ڸ�ʽ���󷽷�
		 */
	}
}
