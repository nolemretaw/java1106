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
		/*	Dom4j是对原生DOM解析的封装
		 * 	Dom4j解析文档的原理与原生Dom是一致的,只不过解析代码更加简洁,效率更高
		 */
		//使用DOM4J对xml文档进行解析
		//创建一个SaxReader对象
		SAXReader saxReader = new SAXReader();
		
		try {
			//加载xml文档
			Document document = saxReader.read("book.xml");
			//得到根节点
			Element rootElement = document.getRootElement();
			//得到根节点的迭代器
			Iterator elementIterator = rootElement.elementIterator();
			//开始遍历书籍
			while (elementIterator.hasNext()) {
				Book b = new Book();//创建的一个新容器,用以解析后的输出
				Element book = (Element) elementIterator.next();
				//得到属性
				List<Attribute> attributes = book.attributes();
				for (Attribute attribute : attributes) {
					System.out.println("属性名 : " + attribute.getName() + 
							", 属性值 : " + attribute.getValue());
				}
				//开始遍历book的子节点
				Iterator iterator = book.elementIterator();
				while (iterator.hasNext()) {
					Element e = (Element) iterator.next();
					System.out.println("节点名 : " + e.getName() + 
							",节点值 : " + e.getStringValue());
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
