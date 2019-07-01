package com.lanou.common;

import java.util.Arrays;

public class PhoneNum {
	public static StringBuilder anonymity(String number,int a, int b){//´Óaµ½b
		StringBuilder number2 = new StringBuilder(number);
		String str ="";
		for(int i=0; i<(b-a+1); i++){
			str += "*"; 
		}
		return (number2.replace(a-1, b-1, str));
	} 
}
