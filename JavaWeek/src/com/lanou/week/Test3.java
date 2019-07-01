package com.lanou.week;

public class Test3 {
	 public static String change(String s){
	        s="zhangsan";
	        return s;
	    }
	    
	    public static void main(String[] args) {
	        String s=new String("lisi");
	        System.out.println(s);
	        System.out.println(change(s));
	        System.out.println(s);
	    }
}

