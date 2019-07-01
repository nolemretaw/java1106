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
 /*DOM解析xml文件的原理:
  * 从根节点开始遍历,一直遍历到底层的节点
  * 流程:
  * 1. 创建一个DocumentBuilderFactory(文档构建工厂)对象 ()
  * 2. 创建一个DocumentBuilder(文档构建器)对象  (通过 文档构建工厂 来生成 文档构建器)
  * 3. 通过DocumentBuilder对象的parse方法,加载xml文件 (通过 文档构建器 来加载文档)
  * 4. 开始遍历
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
	
	//解析文件的方法
	public static void parseXML(){
	//加载XML文件
		try {
			 Document document = getBuilder().parse("book.xml");
			 //所有的操作都是从文档出发的
			 //开始遍历(解析) 将文件加载进DocumentBuilder
			 /*XML文档是由节点构成的 Node
			  * Node分为:
			  * 	属性节点 Node.ATTRIBUTE_NODE
			  * 	标签节点 Node.ELEMENT_NODE (内容)
			  * 	文本节点 Node.TEXT_NODE (回车)
			  *  获取节点的名称: getNodeName()
			  *  获取节点的值: getNodeValue()
			  *  获取节点的类型: getNodeType()
			  *  获取节点中的文本信息: getTextContent()	
			  * 
			  */
			 NodeList booklist = document.getElementsByTagName("book");
			 System.out.println("一共有 " + booklist.getLength() + "本书");
			 for (int i = 0; i < booklist.getLength(); i++) {
				Book b = new Book();
				 //通过下标获取节点列表中的单个节点
				 Node book = booklist.item(i);
				System.out.println("开始遍历" + "第 " + (i + 1) + "本书");
				//遍历属性
				NamedNodeMap attributes = book.getAttributes();
				System.out.println("总共有 " + attributes.getLength() + "个属性");
				for (int j = 0; j < attributes.getLength(); j++) {
						Node attr = attributes.item(j);
						System.out.println("属性名 : " + attr.getNodeName()
						 + "属性值 : " + attr.getNodeValue());
					}
				//遍历book节点下的子节点
				NodeList childNodes = book.getChildNodes();
				System.out.println("共有 " + childNodes.getLength() + "个子节点");
				for (int j = 0; j < childNodes.getLength(); j++) {
					Node node = childNodes.item(j);
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						//节点名称 节点值
						System.out.println("节点名称 : " + node.getNodeName() +
								", 节点值 : " + node.getTextContent());
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
