package com.lanou.week;

public class Test6 {
	public static String outPut="";
	public static void foo(int i) {	
		try {
			if (i==1)
				throw new Exception();
			outPut+="1";
		} catch (Exception e) {
			outPut+="2";
			return;
		}finally{
			outPut+="3";
		}
		outPut+="4";
	}
	
	
	
	public static void main(String[] args) {
//	foo(0);
//	System.out.println(outPut);
	foo(1);
	System.out.println(outPut);
	}

}
