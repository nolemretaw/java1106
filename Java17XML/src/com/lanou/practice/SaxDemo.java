package com.lanou.practice;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class SaxDemo {
	public static void main(String[] args) {
		//1.得到SAXParserFactory对象
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		try {
			//2.通过工厂得到SAXParser对象
			SAXParser parser = factory.newSAXParser();
			//3.创建SAX解析的助手
			SAXParseHandler handler = new SAXParseHandler();
			//4.开始解析
			parser.parse("Fruit.xml", handler);
			for (Fruit fruit : handler.Fruits) {
				System.out.println(fruit);
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
