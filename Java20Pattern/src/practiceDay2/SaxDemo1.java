package practiceDay2;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import day02.Weapon;

public class SaxDemo1 {
	public static void main(String[] args) {
		//sax����xml�ļ��Ĳ���
		//1.�õ�SAXParserFactory����
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		try {
			//2.ͨ�������õ�SAParser����
			SAXParser parser = factory.newSAXParser();
			//3.����SAX����������
			SAXParseHandler handler = new SAXParseHandler();
			//4.��ʼ����
			parser.parse("src/gameProperties.xml", handler);
			for (Weapon weapon : handler.weapons) {
				System.out.println(weapon);
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
