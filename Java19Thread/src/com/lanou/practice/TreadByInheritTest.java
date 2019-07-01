package com.lanou.practice;

public class TreadByInheritTest {

	public static void main(String[] args) {
		MyThreadByInherit threadByInherit = new MyThreadByInherit("¼×");
		MyThreadByInherit threadByInherit2 = new MyThreadByInherit("ÒÒ");
		threadByInherit.start();
		threadByInherit2.start();
	}

}
