package com.tt.newcoder;

import java.util.Scanner;

//•连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组； 
//•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理
public class Main4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			
			String str = in.next();
			split(str);
		}
	}

	private static void split(String s) {
		 while(s.length()>=8){
	            System.out.println(s.substring(0, 8));
	            s=s.substring(8);
	        }
	        if(s.length()<8&&s.length()>0){
	            s=s+"00000000";
	            System.out.println(s.substring(0, 8));
	        }
	}
}
