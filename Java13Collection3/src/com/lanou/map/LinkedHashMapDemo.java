package com.lanou.map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		/*
	 	LinkedHashMap�ǻ��ڹ�ϣ��������ʵ�ֵ�
	 	LinkedHashMap�������
	 	����null����nullֵ�ô���,null��ֻ����һ��,��ֵ�����ж��
	 	ʱ�޲�ͬ��,�̲߳���ȫ
	 */
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("������", "��ʤ");
		map.put("�Ƕ���", "����");
		map.put("������", "����ʤ");
		map.put("�෢��", "����");
		System.out.println(map);
		
		
		
	}
}
