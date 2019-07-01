package com.tt.newcoder;

import java.util.Scanner;

public class 密码验证合格 {
/*
 * 密码要求:
1.长度超过8位
2.包括大小写字母.数字.其它符号,以上四种至少三种
3.不能有相同长度超2的子串重复
说明:长度超过2的子串
 * */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String string = in.next();
			int i = 0;
			int[]cla = {0,0,0,0};
			if (string.length()<9||string==null) {
				System.out.println("NG");
			}else {
				for (int j = 0; j < string.length(); j++) {
					char ch = string.charAt(j);
					if (ch>='0'&&ch<='9') {
						cla[0]=1;
					}else if (ch>='A'&&ch<='Z') {
						cla[1]=1;
					}else if (ch>='a'&&ch<='z') {
						cla[2]=1;
					}else {
						cla[3]=1;
					}
				}
				if (cla[0]+cla[1]+cla[2]+cla[3]<3) {
					System.out.println("NG");
				}else {
					System.out.println(isHasRepeatSub(string));
				}
			}
		}

	}

private static String isHasRepeatSub(String str) {
	for (int i = 0; i < str.length()-3; i++) {
		String str1 = str.substring(i, i+3);
		String str2 = str.substring(i+3);
		if (str2.contains(str1)) {
			return "NG";
		}
	}
	
	return "OK";
}

}
