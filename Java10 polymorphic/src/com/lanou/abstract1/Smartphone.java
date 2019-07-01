package com.lanou.abstract1;

public class Smartphone extends Phone {

	@Override
	public void call() {
		System.out.println("智能手机使用语音打电话~");
	}

	@Override
	public void sendMessage() {
		System.out.println("智能手机使用语音发短信~");
	}
	
}
