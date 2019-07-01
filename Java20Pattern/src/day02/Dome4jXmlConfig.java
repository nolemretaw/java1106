package day02;
//dom4j��xml����

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Dome4jXmlConfig implements BaseConfig {
	/*
	 	����xml,�����������Map
	 	key:��ǩ��
	 	value:�ı�����
	 */
	public static Map<String, String> parseXml() throws DocumentException {
		Map<String, String> map = new HashMap<String, String>();
		//����xml������
		SAXReader reader = new SAXReader();
		//���������ȡxml������
		InputStream in = Dome4jXmlConfig.class.getClassLoader().getResourceAsStream("game.xml");
		//��ȡxml�ĵ����ڴ�,����document�ĵ���
		Document doc = reader.read(in);
		//System.out.println(doc.asXML());
		//��ȡ��Ԫ��
		Element root = doc.getRootElement();
		//������������Ԫ��
		Iterator<Element> it = root.elementIterator();
		while (it.hasNext()) {
			//ȡ��һ����Ԫ��
			Element element = it.next();
			//��ȡԪ�ر�ǩ��
			String name = element.getName();
			//��ȡԪ���ı�����
			String value = element.getTextTrim();
			//System.out.println(name + ":" + value);
			map.put(name, value);
		}
		
		return map;
	}
	
	//����key��ȡ�ַ�������value
	@Override
	public String getStringValue(String key) {
		try {
			Map<String, String> map = parseXml();
			return map.get(key);
		} catch (DocumentException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	//����key��ȡint����valueֵ
	@Override
	public int getIntValue(String key) {
		try {
			Map<String, String> map = parseXml();
			return Integer.parseInt(map.get(key));
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public static void main(String[] args) throws DocumentException {
		System.out.println(parseXml());
	}
}
