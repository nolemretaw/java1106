package com.lanou.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Practice {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("1");
		list.add("3");
		list.add("1");
		
		//1.set����ȥ���ظ�Ԫ��
		HashSet<String> set = new HashSet<String>(list);
		System.out.println(set);
		
		//2.Map����key�Ĳ��ظ���
		HashMap<String, String> map = new HashMap<String, String>();
		for (String string : set) {
			map.put(string, "");
		}
		System.out.println(map.keySet());
		
		
		
		String str = "i have a dream i have a dream i have";
		//ͳ��ÿ�����ʳ��ֵĴ���
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		//�ָ�
		String[] strs = str.split(" ");
		for (String string : strs) {
			if (map1.containsKey(string)) {
				Integer integer= map1.get(string);//ȡ����
				integer++;
				map1.put(string, integer);//ˢ�´���
			} else {
				map1.put(string, 1);
			}
		}
		System.out.println(map1);
		
		
		
		
	}
}
