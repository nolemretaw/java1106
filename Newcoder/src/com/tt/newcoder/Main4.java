package com.tt.newcoder;

import java.util.Scanner;

//鈥㈣繛缁緭鍏ュ瓧绗︿覆锛岃鎸夐暱搴︿负8鎷嗗垎姣忎釜瀛楃涓插悗杈撳嚭鍒版柊鐨勫瓧绗︿覆鏁扮粍锛� 
//鈥㈤暱搴︿笉鏄�8鏁存暟鍊嶇殑瀛楃涓茶鍦ㄥ悗闈㈣ˉ鏁板瓧0锛岀┖瀛楃涓蹭笉澶勭悊
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
