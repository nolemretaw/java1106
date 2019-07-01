package day02;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

//Dom����
public class DomXmlConfig implements BaseConfig {
	//����xml,�����ݷ�װ��map
	public Map<String, String> parseXml() throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		//��������������
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		//ͨ��������������������
		DocumentBuilder builder = factory.newDocumentBuilder();
		//���ý�������Դ
		InputStream in = DomXmlConfig.class.getClassLoader().getResourceAsStream("game.xml");
		Document doc = builder.parse(in);
		//��ȡ��Ԫ��
		NodeList nodeList = doc.getElementsByTagName("game");
		Element root = (Element)nodeList.item(0);
		//������Ԫ��,��ȡ���е���Ԫ��
		NodeList childList = root.getChildNodes();
		//System.out.println(childList.getLength());
		for (int i = 0; i < childList.getLength(); i++) {
			//ȡ��һ���ӽڵ�
			Node node = childList.item(i);
			//�жϵ�ǰ�ڵ��Ƿ�ΪԪ�ؽڵ�
			if (node instanceof Element) {
				Element element = (Element)node;
				String name = element.getNodeName();
				String value = element.getTextContent();
				map.put(name, value);
			}
		}
		
		return map;
	}
	@Override
	public int getIntValue(String key) {
		try {
			Map<String, String> map = parseXml();
			return Integer.parseInt(map.get(key));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	@Override
	public String getStringValue(String key) {
		try {
			Map<String, String> map = parseXml();
			return map.get(key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(new DomXmlConfig().parseXml());
	}
}
