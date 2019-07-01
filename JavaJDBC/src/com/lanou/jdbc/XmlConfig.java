package com.lanou.jdbc;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlConfig implements BaseConfig{
	private XmlConfig(){
		loadXml();
	}
	static Map<String, String> map = new HashMap<>();
	private static XmlConfig instance = new XmlConfig();
	/**��ȡxml*/
	public static void loadXml(){
		//1������������
		SAXReader reader = new SAXReader();
		//2������Ҫ�����ļ�·��
		InputStream in = XmlConfig.class.getClassLoader().getResourceAsStream("jdbc.xml");
		try {
			Document doc = reader.read(in);
			//3����ȡ��Ԫ��
			Element element = doc.getRootElement();
			//4��������Ԫ��
			Iterator<Element> it = element.elementIterator();
			while (it.hasNext()) {
				Element e = it.next();
				map.put(e.getName(), e.getTextTrim());
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getValue(String key) {
		return map.get(key);
	}
}
