package practiceDay2;
/**
 * ����ר�����ڶ�ȡ�����ļ�������
 * @author admin
 *
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
	//ר���ö�ȡ���������ļ��ļ���
	private static Properties pro = new Properties();
	
	//��̬�����,�����ʱ�Զ�ִ��
	static {
		//�������������ļ�
		try {
			//InputStream  in = new FileInputStream("game.properties");
			//��������ķ�������ȡ���������ļ�
			InputStream in = Config.class.getClassLoader().getResourceAsStream("game.properties");
			//�����������ļ�������,��key-value��ʽ��ȡ��������
			pro.load(in);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	//�����ṩ��key��ȡvalueֵ
	public static String getStringValue(String key) {
		return pro.getProperty(key);
	}
	
	//�����ṩ��key��ȡvalueֵ,��ת��int����
	public static int getIntValue(String key) {
		return Integer.parseInt(pro.getProperty(key));
	}
	
	public static void main(String[] args) {
		System.out.println(getStringValue("name"));
		System.out.println(getIntValue("age"));
	}
}
