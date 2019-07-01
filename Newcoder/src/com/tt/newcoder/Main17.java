package com.tt.newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main17 {
//v价格；p重要度；q属性
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0])/10;//总钱数
		int m = Integer.parseInt(str.split(" ")[1]);//个数
		int[] v = new int[m+1];
		int[] p = new int[m+1];
		int[] q = new int[m+1];
		boolean[] flag = new boolean[m+1];
		int[][] res = new int[m+1][N+1];
		for (int i = 0; i < m; i++) {
			String[] strings = br.readLine().split(" ");
			v[i] = (Integer.parseInt(strings[0]))/10;
			
		}
		
	}

}
