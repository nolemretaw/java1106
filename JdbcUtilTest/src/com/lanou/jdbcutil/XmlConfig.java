package com.lanou.jdbcutil;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlConfig implements BaseConfig{
	public XmlConfig() {
		loadXml();
	}
	static Map<String, String>map = new HashMap<>();
	private static void loadXml() {
		SAXReader reader = new SAXReader();
		InputStream in = XmlConfig.class.getClassLoader().getResourceAsStream("jdbc.xml");
		try {
			Document doc = reader.read(in);
			Element element = doc.getRootElement();
			@SuppressWarnings("unchecked")
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
	@Override
	public String getValue(String key) {
		return map.get(key);
	}	
}
