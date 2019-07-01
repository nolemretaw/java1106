package com.lanou.abstract1;

public class Cellphone extends Phone {

	@Override
	public void call() {
		System.out.println("普通手机使用键盘打电话~");
	}

	@Override
	public void sendMessage() {
		System.out.println("普通手机使用键盘发短信~");
	}
	
}
