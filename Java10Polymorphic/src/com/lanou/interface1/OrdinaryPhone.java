package com.lanou.interface1;

public class OrdinaryPhone extends Phone {
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("普通手机使用键盘打电话");
	}
	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("普通手机使用键盘发短信");
	}
}
