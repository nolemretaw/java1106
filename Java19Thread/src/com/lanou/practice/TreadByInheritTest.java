package com.lanou.practice;

public class TreadByInheritTest {

	public static void main(String[] args) {
		MyThreadByInherit threadByInherit = new MyThreadByInherit("��");
		MyThreadByInherit threadByInherit2 = new MyThreadByInherit("��");
		threadByInherit.start();
		threadByInherit2.start();
	}

}
