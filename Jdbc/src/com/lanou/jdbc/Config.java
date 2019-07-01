package com.lanou.jdbc;
/**��ȡproperties�����ļ�*/

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config  implements BaseConfig{
	static Properties pro= new Properties();
	static{//ֻ����һ������
		loadPro();
	}
	public static void loadPro() {
		//����·���¼��������ļ�
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
	/**����keyֵ���valueֵ
	 * */
	public String getValue(String key) {
		return pro.getProperty(key);
	}
}
