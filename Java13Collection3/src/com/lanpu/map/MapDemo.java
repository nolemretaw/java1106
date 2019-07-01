package com.lanpu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		/*Map�����Ǵ洢��ֵ�Եļ���,ÿһ����ֵ�� ����һ��key,һ��value,
		 * ��map��keyֵ�������ظ�,��һ��keyֵֻ��ӳ��һ��value,��ȡvalueֵֻ��ͨ��keyֵ
		 */
		Map<String, String> map = new HashMap<String,String>();//��̬
		//1. ��Ӽ�ֵ�Եķ���:
		/*���ʱ,��Ϊmap������keyֵ�������ظ�,����HashMap��ȥͨ��hashCode()��
		 * equals()��������ӵ�key���д���,���Ƿ����,������,���޸�value
		 * ������������Ӽ�ֵ��
		 */
		/*
		 * HashMap�ǻ��ڹ�ϣ��ʵ�ֵ�, HashMap�������
		 * ����null��,nullֵ���ڵ�,����null��ֻ����һ��
		 * �̲߳�ͬ��
		 */
		map.put("������", "����");
		map.put("Т�������", "�ν�");
		map.put("С���", "����");
		map.put("����ͷ", "�ֳ�");
		
		map.put("����̫��","����");
		map.put("������", "����");
		System.out.println(map);

		//2. ���һ���ֵ��
		Map<String, String> map1 = new HashMap<String,String>();
		map1.put("��԰��", "����");
		map1.put("˫��","������");
		map.putAll(map1);
		System.out.println(map);
		
		//3. ͨ��keyֵ��ȡ��Ӧ��valueֵ
		System.out.println(map.get("Т�������"));
		
		//4. ͨ��keyֵɾ����ֵ��
		map.remove("˫��");
		System.out.println(map);
		
		//5. �ж�map�������Ƿ����ĳһ��key
		System.out.println(map.containsKey("Т�������"));
		System.out.println(map.containsKey("˫��"));
		
		//6. �ж�map�������Ƿ����ĳ��value
		System.out.println(map.containsValue("�ֳ�"));
		
		//7. ���map����
//		map.clear();
//		System.out.println(map);
	
		//8. �ж�map�����Ƿ�Ϊ��
		System.out.println(map.isEmpty());
		
		//9.�õ�map�����еļ�ֵ�Ը���
		System.out.println(map.size());
		
		//10. ����map����
		/*����map����ʵ��Ϊ���õ�valueֵ,����valueֵ�Ļ�ȡ��Ҫ�ȵõ�key,���Ա���
		 * map�ĵ�һ�����õ����е�key,�ٱ������е�key,�õ���Ӧ��value
		 */
		//�õ����е�key
		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			System.out.println(map.get(keySet));
		}
		//2.
		/*�õ����м�ֵ�����ڵļ���,�����˼���,�õ�һ����ֵ�Զ���Entry,�˶����ṩ��getKey()
		 * ��ȡ��keyֵ,getValue()��ȡ��valueֵ
		 */
		Set<Entry<String,String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println("key = " + entry.getKey());
			System.out.println("value = " + entry.getValue());
		}
	}

}
