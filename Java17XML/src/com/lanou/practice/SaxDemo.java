package com.lanou.practice;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class SaxDemo {
	public static void main(String[] args) {
		//1.�õ�SAXParserFactory����
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		try {
			//2.ͨ�������õ�SAXParser����
			SAXParser parser = factory.newSAXParser();
			//3.����SAX����������
			SAXParseHandler handler = new SAXParseHandler();
			//4.��ʼ����
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
