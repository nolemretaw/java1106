package com.lanou.fruit;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config implements BaseConfig{
	private static Properties pro = new Properties();
	
	static{
		
		try {
			InputStream iStream = Config.class.getClassLoader().getResourceAsStream("fruit.properties");
			pro.load(iStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public double getDoubleValue(String key) {
		// TODO Auto-generated method stub
		return Double.parseDouble(pro.getProperty(key));
	}
	@Override
	public String getStringValue(String key) {
		// TODO Auto-generated method stub
		return pro.getProperty(key);
	}
	
}
