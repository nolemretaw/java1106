package com.lanou.dom;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomDemo1 {
 /*DOM����xml�ļ���ԭ��:
  * �Ӹ��ڵ㿪ʼ����,һֱ�������ײ�Ľڵ�
  * ����:
  * 1. ����һ��DocumentBuilderFactory(�ĵ���������)���� ()
  * 2. ����һ��DocumentBuilder(�ĵ�������)����  (ͨ�� �ĵ��������� ������ �ĵ�������)
  * 3. ͨ��DocumentBuilder�����parse����,����xml�ļ� (ͨ�� �ĵ������� �������ĵ�)
  * 4. ��ʼ����
  */
	public static DocumentBuilder getBuilder() {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = null;
		try {
			db = dbf.newDocumentBuilder();	
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		return db;
	}
	
	//�����ļ��ķ���
	public static void parseXML(){
	//����XML�ļ�
		try {
			 Document document = getBuilder().parse("book.xml");
			 //���еĲ������Ǵ��ĵ�������
			 //��ʼ����(����) ���ļ����ؽ�DocumentBuilder
			 /*XML�ĵ����ɽڵ㹹�ɵ� Node
			  * Node��Ϊ:
			  * 	���Խڵ� Node.ATTRIBUTE_NODE
			  * 	��ǩ�ڵ� Node.ELEMENT_NODE (����)
			  * 	�ı��ڵ� Node.TEXT_NODE (�س�)
			  *  ��ȡ�ڵ������: getNodeName()
			  *  ��ȡ�ڵ��ֵ: getNodeValue()
			  *  ��ȡ�ڵ������: getNodeType()
			  *  ��ȡ�ڵ��е��ı���Ϣ: getTextContent()	
			  * 
			  */
			 NodeList booklist = document.getElementsByTagName("book");
			 System.out.println("һ���� " + booklist.getLength() + "����");
			 for (int i = 0; i < booklist.getLength(); i++) {
				Book b = new Book();
				 //ͨ���±��ȡ�ڵ��б��еĵ����ڵ�
				 Node book = booklist.item(i);
				System.out.println("��ʼ����" + "�� " + (i + 1) + "����");
				//��������
				NamedNodeMap attributes = book.getAttributes();
				System.out.println("�ܹ��� " + attributes.getLength() + "������");
				for (int j = 0; j < attributes.getLength(); j++) {
						Node attr = attributes.item(j);
						System.out.println("������ : " + attr.getNodeName()
						 + "����ֵ : " + attr.getNodeValue());
					}
				//����book�ڵ��µ��ӽڵ�
				NodeList childNodes = book.getChildNodes();
				System.out.println("���� " + childNodes.getLength() + "���ӽڵ�");
				for (int j = 0; j < childNodes.getLength(); j++) {
					Node node = childNodes.item(j);
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						//�ڵ����� �ڵ�ֵ
						System.out.println("�ڵ����� : " + node.getNodeName() +
								", �ڵ�ֵ : " + node.getTextContent());
						switch (node.getNodeName()) {
							case "name":
								b.setName(node.getTextContent());
								break;
							case "author":
								b.setAuthor(node.getTextContent());
								break;
							case "price":
								b.setPrice(node.getTextContent());
								break;
							case "date":
								b.setDate(node.getTextContent());
								break;
							case "language":
								b.setLanguage(node.getTextContent());
								break;
							default:
								break;
						}
					}
					
				}
				System.out.println(b);
			 }
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
	parseXML();
	}

}
