package day02;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/*
	pull����
*/
public class PullXmlConfig implements BaseConfig{
	
	public  Map<String, String> parseXml() throws Exception{
		Map<String, String> map = new HashMap<String,String>();
		//1����������������
		XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
		//2��ͨ��������ȡ����������
		XmlPullParser parser = factory.newPullParser();
		//3������Ҫ������XML�ļ�
		InputStream in = PullXmlConfig.class.getClassLoader().getResourceAsStream("game.xml");
		parser.setInput(in, "GBK");
		//4����ȡ�¼�����
		int eventType = parser.getEventType();
		//5��ֻҪû�н������ĵ���������һֱѭ������
		while (eventType != XmlPullParser.END_DOCUMENT) {
			//����
			switch (eventType) {
			case XmlPullParser.START_DOCUMENT://��ʼ�ĵ�
				
				
				break;
			case XmlPullParser.START_TAG://��ʼ��ǩ
				//��ȡ��ʼ��ǩ����
				String startTagName = parser.getName();
				if (!"game".equals(startTagName)) {
					String value = parser.nextText();
					map.put(startTagName, value);
					
					//System.out.println(startTagName + "/" + value);
				}
				break;
			case XmlPullParser.END_TAG://�����ı�ǩ
				//��ȡ������ǩ����
				String endTagName = parser.getName();
				
				break;
			}
			
			//�������֮����������һ���¼�
			eventType = parser.next();
		}	
		return map;
	}
	
	
	@Override
	public int getIntValue(String key) {
		try {
			Map<String, String> map =parseXml();
			return Integer.parseInt(map.get(key));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public String getStringValue(String key) {
		try {
			Map<String, String> map =parseXml();
			return map.get(key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) throws Exception{
		new PullXmlConfig().parseXml();
	}
}
