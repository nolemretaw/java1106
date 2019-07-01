package com.tt.newcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			list.add(in.next());
		}
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
	}

}
