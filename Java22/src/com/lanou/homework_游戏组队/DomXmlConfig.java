package com.lanou.homework_游戏组队;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.Attributes.Name;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

//Dom解析xml
public class DomXmlConfig implements BaseConfig{
	public Map<String, String> parseXml() throws ParserConfigurationException, SAXException, IOException{
		Map<String , String> map = new HashMap<String,String>();
		//创建解析器工厂
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		//通过工厂创建解析器对象
		DocumentBuilder builder = factory.newDocumentBuilder();
		//设置解析数据源
		InputStream in = DomXmlConfig.class.getClassLoader().getResourceAsStream("game.xml");
		Document doc = builder.parse(in);
		//获取根元素
		NodeList nodeList = doc.getElementsByTagName("game");
		Element root = (Element)nodeList.item(0);
		//遍历根元素，获取所有子元素
		NodeList childList = root.getChildNodes();
//		System.out.println(childList.getLength());
		for (int i = 0; i < childList.getLength(); i++) {
			//取一个子节点
			Node node = childList.item(i);
			//判断当前节点是否是元素节点
//			System.out.println(node);
			if (node instanceof Element) {
				Element element = (Element)node;
				//获取元素标签名称
				String name = element.getNodeName();
				//获取元素文本内容
				String value = element.getTextContent();
//				System.out.println(name + "/" + value);
				map.put(name, value);
			}
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
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		System.out.println(new DomXmlConfig().parseXml());
	}
}
