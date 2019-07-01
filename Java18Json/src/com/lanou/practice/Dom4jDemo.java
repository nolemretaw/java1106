package com.lanou.practice;

import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.lanou.dom4j.Book;


public class Dom4jDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SAXReader saxReader = new SAXReader();
		try {
			Document document = saxReader.read("book.xml");
			Element rootElement = document.getRootElement();
			Iterator elementIterator = rootElement.elementIterator(); 
			while (elementIterator.hasNext()) {
				Book b = new Book();
				Element book = (Element) elementIterator.next();
				List<Attribute> attributes = book.attributes();
				for (Attribute attribute : attributes) {
					System.out.println("������ " + attribute.getName() +" ����ֵ " + attribute.getValue());
				}
				Iterator iterator = book.elementIterator();
				while (iterator.hasNext()) {
					Element e = (Element) iterator.next();
					System.out.println("�ڵ��� : " + e.getName() + 
							",�ڵ�ֵ : " + e.getStringValue());
					switch (e.getName()) {
					case "name":
						b.setName(e.getStringValue());
						break;
					case "price":
						b.setPrice(e.getStringValue());
						break;
					case "date":
						b.setDate(e.getStringValue());
						break;
					case "author":
						b.setAuthor(e.getStringValue());
						break;
					case "language":
						b.setLanguage(e.getStringValue());
						break;
					default:
						break;
					}
				}
				System.out.println(b);
			}
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
