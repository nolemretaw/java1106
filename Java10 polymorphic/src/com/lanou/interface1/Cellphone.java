package com.lanou.interface1;

public class Cellphone extends Phone implements D {

	@Override
	public void call() {
		System.out.println("普通手机使用键盘打电话~");
	}

	@Override
	public void sendMessage() {
		System.out.println("普通手机使用键盘发短信~");
	}

	@Override
	public void testA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testB() {
		// TODO Auto-generated method stub
		
	}
	
}
