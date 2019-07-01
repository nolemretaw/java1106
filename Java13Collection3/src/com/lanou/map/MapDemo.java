package com.lanou.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		/*
		 	Map����Ǵ洢��ֵ�Եļ���,ÿһ����ֵ�԰���һ��key  һ��value
		 	��Map��keyֵ�������ظ�,��һ��keyֵֻ��ӳ��һ��value  ��ȡvalue����ͨ��keyֵ!
		 */
		Map<String, String>map = new HashMap<String, String>();
		//1.��Ӽ�ֵ�Եķ���
		/*
		 	���ʱ,��Ϊmap������keyֵ�������ظ�
		 	����hashMap��ȥͨ��hashCode() �� equals()����
		 	����ӵ�key���д���,���Ƿ����,��������������,  �������,���޸�value
		 	
		 	����put�����Ĺ���: 1.���   2.�޸�
		 */
		/*
		 	HashMap�ǻ��ڹ�ϣ��ʵ�ֵ�
		 	HashMap�������
		 	����null����nullֵ�ô���,null��ֻ����һ��,��ֵ�����ж��
		 	ʱ�޲�ͬ��,�̲߳���ȫ
		 */
		map.put("Т�������", "�ν�");
		map.put("С���", "����");
		map.put("����ͷ", "�ֳ�");
		map.put("������", "����");
		map.put("����̫��", "����");
		System.out.println(map);
		
		//2.���һ���ֵ��
		Map<String, String>map1 = new HashMap<String, String>();
		map1.put("��԰��", "����");
		map1.put("˫��", "������");
		map.putAll(map1);
		System.out.println(map);
		
		//3.ͨ��keyֵ��ȡvalue   �����������Ҫ
		System.out.println(map.get("Т�������"));
		
		//4.ͨ��keyֵɾ����ֵ��
		map.remove("˫��");
		System.out.println(map);
		
		//5.�ж�map�������Ƿ����ĳһ��key
		System.out.println(map.containsKey("Т�������"));
		
		//6.�ж�map�������Ƿ����ĳһ��value
		System.out.println(map.containsValue("�ν�"));
		
		//7.���map����
		//map.clear();
		System.out.println(map);
		
		//8.�ж�map�����Ƿ�Ϊ��
		System.out.println(map.isEmpty());
		
		//9.�õ�map�����еļ�ֵ�Ը���
		System.out.println(map.size());
		
		//10.��α���map����
		/*
		����map����,ʵ��Ϊ���õ�valueֵ,����value�Ļ�ȡ��Ҫ�Ȼ��keyֵ,���Ա���map�ĵ�һ���õ����е�keyֵ,�ڱ������е�key,�õ���Ӧ��value
		 */
		//�õ����е�key     �˷������Ƽ�����map�ķ���!!!
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(map.get(key));
		}
		
		//2.
		/*
		 	�õ����м�ֵ�����ڵļ���,�����˼���,�õ�ÿһ����ֵ�Զ���Entry,�˶����ṩ��getKey()��ȡkeyֵ   �ṩ��getValue()��ȡvalueֵ
		 */
		Set<Entry<String,String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println("key = " + entry.getKey());
			System.out.println("value = " + entry.getValue());
		}
		
		
		
		
		
	}
}
