package com.lanpu.map;

import java.util.Hashtable;
import java.util.Set;

public class HashtableDemo {

	public static void main(String[] args) {
		/*1. Hashtable���ڹ�ϣ��ʵ�ֵ�,��֤key����һ��Ҫʵ��
		 * hashCode��equals����
		 *2. Hashtable�������
		 *3. Hashtable�в��������null����nullֵ
		 */
		Hashtable<String, String> map = new Hashtable<String,String>();
		map.put("����̫��", "��С��");
		map.put("��������", "��С��");
		map.put("������", "��С��");
		System.out.println(map);
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			if (key.equals("��������")) {
				map.put("С����", "��ͨ");
			}
			System.out.println(map.get("С����"));
		}
		System.out.println(map);
	}

}
