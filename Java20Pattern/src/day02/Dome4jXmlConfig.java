package day02;
//dom4j的xml解析

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Dome4jXmlConfig implements BaseConfig {
	/*
	 	解析xml,解析结果存入Map
	 	key:标签名
	 	value:文本内容
	 */
	public static Map<String, String> parseXml() throws DocumentException {
		Map<String, String> map = new HashMap<String, String>();
		//创建xml解析器
		SAXReader reader = new SAXReader();
		//类加载器获取xml输入流
		InputStream in = Dome4jXmlConfig.class.getClassLoader().getResourceAsStream("game.xml");
		//读取xml文档到内存,生成document文档树
		Document doc = reader.read(in);
		//System.out.println(doc.asXML());
		//获取根元素
		Element root = doc.getRootElement();
		//迭代器遍历根元素
		Iterator<Element> it = root.elementIterator();
		while (it.hasNext()) {
			//取出一个子元素
			Element element = it.next();
			//获取元素标签名
			String name = element.getName();
			//获取元素文本内容
			String value = element.getTextTrim();
			//System.out.println(name + ":" + value);
			map.put(name, value);
		}
		
		return map;
	}
	
	//根据key获取字符串类型value
	@Override
	public String getStringValue(String key) {
		try {
			Map<String, String> map = parseXml();
			return map.get(key);
		} catch (DocumentException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	//根据key获取int类型value值
	@Override
	public int getIntValue(String key) {
		try {
			Map<String, String> map = parseXml();
			return Integer.parseInt(map.get(key));
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public static void main(String[] args) throws DocumentException {
		System.out.println(parseXml());
	}
}
