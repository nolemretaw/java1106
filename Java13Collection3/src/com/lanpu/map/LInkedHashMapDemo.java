package com.lanpu.map;

import java.util.LinkedHashMap;

public class LInkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
		map.put("������", "��ʤ");
		map.put("�Ƕ���", "����");
		map.put("������", "����ʤ");
		map.put("�෢��", "����");
		System.out.println(map);
		/*
		 * HashMap�ǻ��ڹ�ϣ��ʵ�ֵ�, HashMap�������
		 * ����null��,nullֵ���ڵ�,����null��ֻ����һ��
		 * �̲߳�ͬ��
		 */
	}

}
