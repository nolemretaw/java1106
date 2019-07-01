package com.lanou.dom4j;

import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Dom4jDemo {

	public static void main(String[] args) {
		/*	Dom4j�Ƕ�ԭ��DOM�����ķ�װ
		 * 	Dom4j�����ĵ���ԭ����ԭ��Dom��һ�µ�,ֻ��������������Ӽ��,Ч�ʸ���
		 */
		//ʹ��DOM4J��xml�ĵ����н���
		//����һ��SaxReader����
		SAXReader saxReader = new SAXReader();
		
		try {
			//����xml�ĵ�
			Document document = saxReader.read("book.xml");
			//�õ����ڵ�
			Element rootElement = document.getRootElement();
			//�õ����ڵ�ĵ�����
			Iterator elementIterator = rootElement.elementIterator();
			//��ʼ�����鼮
			while (elementIterator.hasNext()) {
				Book b = new Book();//������һ��������,���Խ���������
				Element book = (Element) elementIterator.next();
				//�õ�����
				List<Attribute> attributes = book.attributes();
				for (Attribute attribute : attributes) {
					System.out.println("������ : " + attribute.getName() + 
							", ����ֵ : " + attribute.getValue());
				}
				//��ʼ����book���ӽڵ�
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
