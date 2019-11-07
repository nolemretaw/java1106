package com.tt.newcoder;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String[] mid = sc.nextLine().split("\\s+");
			addPare(map,mid);
		}
		System.out.println(mapToString(map));
	}

	private static String mapToString(Map<Integer, Integer> map) {
		StringBuilder stringBuilder = new StringBuilder();
		for (Map.Entry<Integer, Integer> e:map.entrySet()) {
			stringBuilder.append(e.getKey()).append(" ").append(e.getValue()).append(" ");
			
		}
		return stringBuilder.toString() ;
	}

	private static void addPare(Map<Integer, Integer> map, String[] mid) {
		int key = Integer.parseInt(mid[0]);
		int value = Integer.parseInt(mid[1]);
		if (map.containsKey(key)) {
			map.put(key, value+map.get(key));
		} else {
			map.put(key, value);
		}
	}

}
