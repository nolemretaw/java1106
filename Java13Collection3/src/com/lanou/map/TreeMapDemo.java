package com.lanou.map;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		/*
		 	TreeMap�Ĺ��췽��
			 	1.�޲ι���,��key�����������Ȼ����,��Ҫ��key�����ڲ�ʵ��Compareble�ӿ�,����compareTo��������ʵ��
			 	2.�вι���,key�ڴ���TreeMapʱ,����һ���Ƚ������, �Ƚ����ڲ�ʵ����Comparator�ӿ�,����compare��������ʵ��
			 	�Ƚ����Ƕ�key�����ͽ��еıȽ�
			 
			 TreeMap�ǻ��ں����ʵ�ֵ�,���������ܵ�map����
			 TreeMap�������
			 ����nullֵ�Ĵ���,��������null���Ĵ���
			 ʵ���ǲ�ͬ����,�̲߳���ȫ
		 */
		TreeMap<String, String>map = new TreeMap<String, String>();
		map.put("tuanzhang", "������");
		map.put("heshang", "κ����");
		map.put("zhengwei", "�Ը�");
		map.put("kaipao", "����");
		System.out.println(map);
		
		
		
		TreeMap<Student, String> map1 = new TreeMap<Student, String>();
		map1.put(new Student("chenchen", 18), "����");
		map1.put(new Student("guoxin", 22), "�Ժ�");
		map1.put(new Student("jianhui", 24), "����ʶ��");
		map1.put(new Student("huangxuan", 19), "����");
		System.out.println(map1);
	}
}
