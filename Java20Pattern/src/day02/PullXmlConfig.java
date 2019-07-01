package day02;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/*
	pull解析
*/
public class PullXmlConfig implements BaseConfig{
	
	public  Map<String, String> parseXml() throws Exception{
		Map<String, String> map = new HashMap<String,String>();
		//1、构建解析器工厂
		XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
		//2、通过工厂获取解析器对象
		XmlPullParser parser = factory.newPullParser();
		//3、设置要解析的XML文件
		InputStream in = PullXmlConfig.class.getClassLoader().getResourceAsStream("game.xml");
		parser.setInput(in, "GBK");
		//4、获取事件类型
		int eventType = parser.getEventType();
		//5、只要没有解析到文档结束，就一直循环解析
		while (eventType != XmlPullParser.END_DOCUMENT) {
			//解析
			switch (eventType) {
			case XmlPullParser.START_DOCUMENT://开始文档
				
				
				break;
			case XmlPullParser.START_TAG://开始标签
				//获取开始标签名称
				String startTagName = parser.getName();
				if (!"game".equals(startTagName)) {
					String value = parser.nextText();
					map.put(startTagName, value);
					
					//System.out.println(startTagName + "/" + value);
				}
				break;
			case XmlPullParser.END_TAG://结束文标签
				//获取结束标签名称
				String endTagName = parser.getName();
				
				break;
			}
			
			//解析完成之后，驱动到下一个事件
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
