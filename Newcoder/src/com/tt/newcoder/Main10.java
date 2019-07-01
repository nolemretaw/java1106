package com.tt.newcoder;

import java.util.HashSet;
import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		HashSet<Character> set = new HashSet<>();
		for (int i = line.length()-1; i >=0 ; i--) {
			if (!set.contains(line.charAt(i))) {				
				set.add(line.charAt(i));
			}
		}
		for (Character character : set) {
			System.out.print(character);
		}
	}

}
