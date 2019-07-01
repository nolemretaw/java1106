package practiceDay2;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


import day02.Weapon;

public class SAXParseHandler extends DefaultHandler {
	int weaponIndex = 0;//代表第几件武器
	Properties weapon = null;//表示创建的武器对象
	Properties hurt = null;
	String value = null;//保存的是节点内容
	ArrayList<Weapon> weapons = new ArrayList<Weapon>();//保存所有书籍
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
		System.out.println("开始解析文档");
	}
	//开始解析标签节点
		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
			// TODO Auto-generated method stub
			super.startElement(uri, localName, qName, attributes);
			/*
			 	qName 节点名称
			 	attributes 属性集合
			 */
			if (qName.equals("weapon")) {
				weapon = new Properties();
				weaponIndex++;
				System.out.println("开始遍历第" + weaponIndex + "件");
				//获取属性
				for (int i = 0; i < attributes.getLength(); i++) {
					System.out.println("属性名:" + attributes.getQName(i) + "属性值:" + attributes.getValue(i));
				}
			}
		}
		
		//获取节点内容
		@Override
		public void characters(char[] ch, int start, int length) throws SAXException {
			// TODO Auto-generated method stub
			super.characters(ch, start, length);
			value = new String(ch, start, length);
			
			if (!value.trim().equals("")) {
				System.out.println(value);
			}
		}
		//结束解析标签节点
		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
			// TODO Auto-generated method stub
			super.endElement(uri, localName, qName);
			switch (qName) {
			case "name":
				weapon.setName(value);
				break;
			case "hurt":
				weapon.setHurt(value);
				break;
			default:
				break;
			}
		}
		
		//文档解析结束
		@Override
		public void endDocument() throws SAXException {
			// TODO Auto-generated method stub
			super.endDocument();
			System.out.println("文档解析结束");
		}
}
