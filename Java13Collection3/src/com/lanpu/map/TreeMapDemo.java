package com.lanpu.map;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		/*TreeMap�Ĺ��췽��,
		 * 1. �޲ι���,��key��������õ�����Ȼ����,��Ҫ������key�����ڲ�ʵ��Comparable�ӿ�,
		 * ����compareTo��������ʵ��
		 * 2. �вι���, �����ڴ���TreeMapʱ,����һ���Ƚ�������,�Ƚ����ڲ�ʵ����Comparator�ӿ�,
		 * ����compare��������ʵ��,�Ƚ����Ƕ�key������еıȽ�
		 * 
		 * 
		 * Treemap�ǻ��ں����ʵ�ֵ�,���������ܵ�map����,TreeMap�������
		 * ����nullֵ�Ĵ���,��������null���Ĵ���,ʵ���ǲ�ͬ����,�̲߳���ȫ
		 */
		TreeMap<String, String> map = new TreeMap<String,String>();
		map.put("tuanzhang", "������");
		map.put("heshang", "κ����");
		map.put("kaipao", "����");
		map.put("zhengwei", "�Ը�");
		System.out.println(map);
		
		TreeMap<Student, String> map1 = new TreeMap<Student,String>();
		map1.put(new Student("a", 18),"��");
		map1.put(new Student("b", 22),"��");
		map1.put(new Student("c", 24),"��");
		map1.put(new Student("e", 19),"��");
		System.out.println(map1);
		int size = map.size();
	}

}
