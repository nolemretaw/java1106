package com.lanpu.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("1");
		list.add("3");
		list.add("1");
		//ȥ���ظ�Ԫ��
		//1. ����Set���ϵĲ��ظ���
		HashSet<String> set = new HashSet<String>(list);
		System.out.println(set);
		
		//2. ����Map���ϵĲ��ظ���
		HashMap<String, String> map = new HashMap<String,String>();
		for (String string : list) {
			map.put(string, "");
		}
		System.out.println(map.keySet());
		
		String str = "i have a dream i have a dream i have";
		//ͳ��ÿ�����ʳ��ֵĴ���
		HashMap<String, Integer> map1 = new HashMap<String , Integer>();
		//�ָ�
		String[] strs = str.split(" ");
		for (String string : strs) {
			if (map1.containsKey(string)) {
				Integer integer = map1.get(string);
				integer++;//Integer��int��Ӧ�ð�װ����
				map1.put(string, integer);
			}else {
				map1.put(string, 1);
			}
		}
		System.out.println(map1);
		
		
	}

}
