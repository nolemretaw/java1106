package com.lanou.practice;

import java.util.ArrayList;
import java.util.jar.Attributes.Name;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParseHandlerbook extends DefaultHandler{
	int bookIndex = 0;//第几本书
	Book book = null;//表示创建的书对象
	String value = null;//保存节点内容
	ArrayList<Book> Book = new ArrayList<Book>();
	//开始文档
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
		System.out.println("开始解析文档");
	}
	
	//开始标签
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
		if (qName.equals("book")) {
			book = new Book();
			bookIndex++;
			System.out.println("开始遍历第" + bookIndex + "本");
			for (int i = 0; i < attributes.getLength(); i++) {
				System.out.println("属性值:" + attributes.getQName(i) + "属性值" + attributes.getValue(i));
			}
		}
	}
	
	//内容
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		value = new String(ch, start, length);
		if (!value.trim().equals("")) {
			System.out.println(value);
		}
	}
	
	//结束标签
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
		switch (qName) {
		case "name":
			book.setName(value);
			break;
		case "author":
			book.setAuthor(value);
			break;
		case "price":
			book.setPrice(value);
			break;
		case "date":
			book.setDate(value);
			break;
		case "llanguage":
			book.setLanguange(value);
			break;
		case "book":
			System.out.println(book);
			Book.add(book);

		default:
			break;
		}
	}
	
	//结束文档
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
		System.out.println("结束解析文档");
	}
}
