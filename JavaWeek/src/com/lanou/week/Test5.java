package com.lanou.week;
/**
 * F11:以断点运行
 * F6:单步跟踪
 * F5:方法调用处进入到方法内部
 * F7:方法内部进入到方法调用处
 * F8:结束断点执行
 * */
public class Test5 {

	public static void main(String[] args) {
		add(10,0);
	}
	public static int add(int a,int b) {
		System.out.println("add()");
		if (a!=0&&b!=0) {
			return a+b;
		} else {
			return 0;
		}
	}

}
