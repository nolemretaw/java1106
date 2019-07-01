package com.lanou.sax;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class SaxDemo1 {

	public static void main(String[] args) {
		// SAX����xml�ļ��Ĳ���
		//1. �õ�SAXParserFactory����(����ģʽ )
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			//2. ͨ�������õ�SAXParser����
			SAXParser parser = factory.newSAXParser();		
			//3. ����SAX����������
			SAXParseHandler handler = new SAXParseHandler();
			//4. ��ʼ����
			parser.parse("book.xml", handler);
			for (Book book : handler.books) {
				System.out.println(book);
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
