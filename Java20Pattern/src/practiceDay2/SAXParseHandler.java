package practiceDay2;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


import day02.Weapon;

public class SAXParseHandler extends DefaultHandler {
	int weaponIndex = 0;//����ڼ�������
	Properties weapon = null;//��ʾ��������������
	Properties hurt = null;
	String value = null;//������ǽڵ�����
	ArrayList<Weapon> weapons = new ArrayList<Weapon>();//���������鼮
	@Override
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
			/*
			 	qName �ڵ�����
			 	attributes ���Լ���
			 */
			if (qName.equals("weapon")) {
				weapon = new Properties();
				weaponIndex++;
				System.out.println("��ʼ������" + weaponIndex + "��");
				//��ȡ����
				for (int i = 0; i < attributes.getLength(); i++) {
					System.out.println("������:" + attributes.getQName(i) + "����ֵ:" + attributes.getValue(i));
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
				weapon.setName(value);
				break;
			case "hurt":
				weapon.setHurt(value);
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
			System.out.println("�ĵ���������");
		}
}
