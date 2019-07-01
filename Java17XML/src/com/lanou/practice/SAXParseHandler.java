package com.lanou.practice;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParseHandler extends DefaultHandler{
	int bookindex = 0;
	Book book = null;
	String value = null;
	ArrayList<Book> books = new ArrayList<Book>();
	
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
	}
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
		if (qName.equals("book")) {
			book = new Book();
			bookindex++;
			System.out.println("开始遍历第 " + bookindex + " 本书");
		}
		for (int i = 0; i < attributes.getLength(); i++) {
			System.out.println("属性名 : " + attributes.getQName(i) + 
					" 属性值 : " + attributes.getValue(i));
		}
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		value = new String(ch, start, length);
		if (!value.trim().equals("")) {
			System.out.println(value);
		}
	}
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
		switch (qName) {
		case "name":
			book.setName(value);
			break;
		case "date":
			book.setDate(value);
			break;
		case "price":
			book.setPrice(value);
			break;
		case "author":
			book.setAuthor(value);
			break;
		case "language":
			book.setLanguage(value);
			break;
		case "book":
			books.add(book);
			
		default:
			break;
		}
	}
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
	}
}
