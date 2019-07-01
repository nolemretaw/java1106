package com.lanou.homework_游戏组队;
//此类专门用于读取配置文件中的数据

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config implements BaseConfig{
	//专门用于读取属性配置文件的集合 properties文件只能放在src的直接根目录下
	private static Properties pro = new Properties();
	
	static{//类加载时会自动执行，静态代码块
		//加载属性配置文件
		try {
			//将属性配置文件中数据以key-value的形式读取到集合中
			InputStream inStream = Config.class.getClassLoader().getResourceAsStream("game.properties");
			pro.load(inStream);
			} catch (Exception e) {
				e.printStackTrace();
		}
		
	}
	//根据提供的key键获取value值
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
