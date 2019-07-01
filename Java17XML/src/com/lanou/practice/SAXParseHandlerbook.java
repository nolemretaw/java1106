package com.lanou.practice;

import java.util.ArrayList;
import java.util.jar.Attributes.Name;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParseHandlerbook extends DefaultHandler{
	int bookIndex = 0;//�ڼ�����
	Book book = null;//��ʾ�����������
	String value = null;//����ڵ�����
	ArrayList<Book> Book = new ArrayList<Book>();
	//��ʼ�ĵ�
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
		System.out.println("��ʼ�����ĵ�");
	}
	
	//��ʼ��ǩ
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
		if (qName.equals("book")) {
			book = new Book();
			bookIndex++;
			System.out.println("��ʼ������" + bookIndex + "��");
			for (int i = 0; i < attributes.getLength(); i++) {
				System.out.println("����ֵ:" + attributes.getQName(i) + "����ֵ" + attributes.getValue(i));
			}
		}
	}
	
	//����
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		value = new String(ch, start, length);
		if (!value.trim().equals("")) {
			System.out.println(value);
		}
	}
	
	//������ǩ
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
	
	//�����ĵ�
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
		System.out.println("���������ĵ�");
	}
}
