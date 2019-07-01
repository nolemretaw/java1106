package com.lanou.sax;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParseHandler extends DefaultHandler{
	int bookIndex = 0;//����ڼ�����
	Book book = null;//��ʾ�������鼮����
	String value = null;//������ǽڵ�����
	ArrayList<Book> books = new ArrayList<Book>();
	//�ĵ�������ʼ
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
		System.out.println("��ʼ�����ĵ�");
	}
	//��ʼ������ǩ�ڵ�
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
		/* qname�ڵ�����
		 * attributes���Լ���
		 */
		if (qName.equals("book")) {
			book = new Book();
			bookIndex++;
			System.out.println("��ʼ������ " + bookIndex + "����");
			//��ȡ����
			for (int i = 0; i < attributes.getLength(); i++) {
				System.out.println("������: " + attributes.getQName(i)
				+ ", ����ֵ: " + attributes.getValue(i));
			}
		}
	}
	//��ȡ�ڵ�����
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		value = new String(ch, start, length);
		if (!value.trim().equals("")) {
			System.out.println(value);
		}
		
	}
	//����������ǩ�ڵ�
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
			case "language":
				book.setLanguage(value);
				break;
			case "book":
				System.out.println(book);
				books.add(book);
				break;
			case "author":
				book.setAuthor(value);
				break;
			default:
				break;
		}
	}
	
	//�ĵ���������
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
		System.out.println("���������ĵ�");
	}
}
