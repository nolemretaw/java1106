package practiceDay2;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import day02.Weapon;

public class SaxDemo1 {
	public static void main(String[] args) {
		//sax解析xml文件的步骤
		//1.得到SAXParserFactory对象
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		try {
			//2.通过工厂得到SAParser对象
			SAXParser parser = factory.newSAXParser();
			//3.创建SAX解析的助手
			SAXParseHandler handler = new SAXParseHandler();
			//4.开始解析
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
