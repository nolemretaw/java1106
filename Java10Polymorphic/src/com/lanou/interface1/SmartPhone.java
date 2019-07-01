package com.lanou.interface1;

public class SmartPhone extends Phone implements PlayGameInterface, CrackPeanutInterface {
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
	@Override
	public void playgame() {
		// TODO Auto-generated method stub
		System.out.println("智能手机在玩吃鸡");
	}
	public void crack() {
		System.out.println("锤子手机正在砸核桃");
	}
}
