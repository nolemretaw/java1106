package com.lanou.regex;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pattern����Ҫ���ڷ�װһ��������ʽ�ַ���
 * Matcher:���ڷ�װ������ʽ���ַ���ƥ��Ľ��
 * **/
public class PattenTest {
	public static void main(String[] args) {
		//�����ƥ����ַ���
		String content =new Scanner(System.in).nextLine();
		//����������ʽ�ַ���
		String regex ="����|fuck|����";
		//��������ʽ�ַ�����װ��pattern������
		Pattern pattern = Pattern.compile(regex);
		
		//���ڷ�װ ������ʽ���ַ�����ƥ�� ���
		Matcher matcher = pattern.matcher(content);
		
		//����ַ������Ƿ���������ʽ�й涨��������
		//find()ÿ�ε��þ����ƥ��һ��
		while (matcher.find()) {
			//group()ȡ�ղ�ƥ��Ĺؼ���ʱ��ǰ��ʱ�ȵ���find()��������true
			String keyWord = matcher.group();
			System.out.println(keyWord);
			//�滻ƥ�䵽���ִ�
			content=content.replace(keyWord, "****");
			
			//ȡ��ƥ�䵽�Ĵ�����ʼ�±�
//			int start = matcher.start();
//			int end = matcher.end();
//			System.out.println(start);
//			System.out.println(end);
		}
		System.out.println(content);
		
		
		
	}
}
