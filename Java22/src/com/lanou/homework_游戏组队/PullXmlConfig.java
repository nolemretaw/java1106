package com.lanou.homework_游戏组队;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/**
 *pull解析 
 **/
public class PullXmlConfig implements BaseConfig{
	public Map<String , String> parseXml() throws Exception{
		Map<String, String> map = new HashMap<>();
		//1、 构建解析器工厂
		XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
		//2、通过工厂获取解析器对象
		XmlPullParser parser = factory.newPullParser();
		//3、设置要解析的xml文档
		InputStream in = PullXmlConfig.class.getClassLoader().getResourceAsStream("game.xml");
		parser.setInput(in, "GBK");
		//4、获取事件类型
		int eventType = parser.getEventType();
		//5、只要没有解析到文档结束，就一直循环解析
		while (eventType != XmlPullParser.END_DOCUMENT) {
			//解析，判断当前事件的类型
			switch (eventType) {
				case XmlPullParser.START_DOCUMENT://开始文档
//					System.out.println("==开始文档==");
					break;
				case XmlPullParser.START_TAG://开始标签
					//获取开始标签名称
					String startTagName = parser.getName();
					//当获取的标签不为game时，获取文本内容
					if (!"game".equals(startTagName)) {
						String value = parser.nextText();
						map.put(startTagName, value);
					}
					break;
				case XmlPullParser.END_TAG://结束标签
					String endTagName = parser.getName();
//					System.out.println("结束标签 ：" + endTagName);
					break;
				default:
					break;
			}
			//解析完成后驱动到下一个事件
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
