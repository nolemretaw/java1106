package com.lanou.homework_��Ϸ���;
//����ר�����ڶ�ȡ�����ļ��е�����

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config implements BaseConfig{
	//ר�����ڶ�ȡ���������ļ��ļ��� properties�ļ�ֻ�ܷ���src��ֱ�Ӹ�Ŀ¼��
	private static Properties pro = new Properties();
	
	static{//�����ʱ���Զ�ִ�У���̬�����
		//�������������ļ�
		try {
			//�����������ļ���������key-value����ʽ��ȡ��������
			InputStream inStream = Config.class.getClassLoader().getResourceAsStream("game.properties");
			pro.load(inStream);
			} catch (Exception e) {
				e.printStackTrace();
		}
		
	}
	//�����ṩ��key����ȡvalueֵ
	@Override
	public String getStringValue(String key) {
		return pro.getProperty(key);
	}
	@Override
	public int getIntValue(String key) {
		return Integer.parseInt(pro.getProperty(key));
	}
	
//	public static void main(String[] args) {
//		System.out.println(getIntValue("knife_hurt"));
//		System.out.println(getIntValue("sword_hurt"));
//	
//	}
}
