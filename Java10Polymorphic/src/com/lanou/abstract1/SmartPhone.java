package com.lanou.abstract1;

public class SmartPhone extends Phone {
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("智能手机语音打电话");
	}
	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("智能手机语音发短信");
	}
}
