package practiceDay2;
/**
 * 此类专门用于读取配置文件中数据
 * @author admin
 *
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
	//专门用读取属性配置文件的集合
	private static Properties pro = new Properties();
	
	//静态代码块,类加载时自动执行
	static {
		//加载属性配置文件
		try {
			//InputStream  in = new FileInputStream("game.properties");
			//类加载器的方法来读取属性配置文件
			InputStream in = Config.class.getClassLoader().getResourceAsStream("game.properties");
			//将属性配置文件中数据,以key-value形式读取到集合中
			pro.load(in);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	//根据提供的key获取value值
	public static String getStringValue(String key) {
		return pro.getProperty(key);
	}
	
	//根据提供的key获取value值,再转成int类型
	public static int getIntValue(String key) {
		return Integer.parseInt(pro.getProperty(key));
	}
	
	public static void main(String[] args) {
		System.out.println(getStringValue("name"));
		System.out.println(getIntValue("age"));
	}
}
