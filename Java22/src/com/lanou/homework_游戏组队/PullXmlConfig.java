package com.lanou.homework_��Ϸ���;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/**
 *pull���� 
 **/
public class PullXmlConfig implements BaseConfig{
	public Map<String , String> parseXml() throws Exception{
		Map<String, String> map = new HashMap<>();
		//1�� ��������������
		XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
		//2��ͨ��������ȡ����������
		XmlPullParser parser = factory.newPullParser();
		//3������Ҫ������xml�ĵ�
		InputStream in = PullXmlConfig.class.getClassLoader().getResourceAsStream("game.xml");
		parser.setInput(in, "GBK");
		//4����ȡ�¼�����
		int eventType = parser.getEventType();
		//5��ֻҪû�н������ĵ���������һֱѭ������
		while (eventType != XmlPullParser.END_DOCUMENT) {
			//�������жϵ�ǰ�¼�������
			switch (eventType) {
				case XmlPullParser.START_DOCUMENT://��ʼ�ĵ�
//					System.out.println("==��ʼ�ĵ�==");
					break;
				case XmlPullParser.START_TAG://��ʼ��ǩ
					//��ȡ��ʼ��ǩ����
					String startTagName = parser.getName();
					//����ȡ�ı�ǩ��Ϊgameʱ����ȡ�ı�����
					if (!"game".equals(startTagName)) {
						String value = parser.nextText();
						map.put(startTagName, value);
					}
					break;
				case XmlPullParser.END_TAG://������ǩ
					String endTagName = parser.getName();
//					System.out.println("������ǩ ��" + endTagName);
					break;
				default:
					break;
			}
			//������ɺ���������һ���¼�
			eventType = parser.next();
		}
		return map;
				
	}
	@Override
	public int getIntValue(String key) {
		try {
			Map<String, String> map = parseXml();
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
			Map<String, String> map = parseXml();
			return map.get(key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
//	public static void main(String[] args) throws Exception {
//		System.out.println(new PullXmlConfig().parseXml());
//	}

}
