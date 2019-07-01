package com.lanou.jdbc;
/**读取properties配置文件*/

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config  implements BaseConfig{
	static Properties pro= new Properties();
	static{//只构建一次流，
		loadPro();
	}
	public static void loadPro() {
		//从类路径下加载配置文件
		InputStream in = Config.class.getClassLoader().getResourceAsStream("jdbc.properties");
		try {
			pro.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (in!=null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	/**根据key值获得value值
	 * */
	public String getValue(String key) {
		return pro.getProperty(key);
	}
}
