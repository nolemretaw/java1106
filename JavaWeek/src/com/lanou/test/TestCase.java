package com.lanou.test;

class T1{
	int i=0;
	public void Test1(){
		System.out.println(i);
	}
	public void Test2(){
		System.out.println(i);
	}
}
class T2 extends T1{
	int i=2;
	public void Test2(){
		System.out.println(i);
	}
}
public class TestCase {
	public static void main(String[] args) {
		T1 test = new T2();
		test.Test1();
		test.Test2();
		System.out.println(test.i);
		test = (T2)test;
		System.out.println(test.i);
	}
}
