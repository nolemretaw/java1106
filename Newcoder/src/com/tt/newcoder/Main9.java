package com.tt.newcoder;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * 数据表记录包含表索引和数值，
 * 请对表索引相同的记录进行合并，
 * 即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 * */
public class Main9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < num; i++) {
			int index = in.nextInt();
			int value = in.nextInt();
			if (map.containsKey(index)) {
				map.put(index, map.get(index)+value);
			}else {
				map.put(index, value);
			}
		}
		StringBuilder builder = new StringBuilder();
		for (Map.Entry<Integer, Integer> e: map.entrySet()) {
			builder.append(e.getKey()).append(" ").append(e.getValue());
		}
		System.out.println(builder.toString());
	}	
	
}
