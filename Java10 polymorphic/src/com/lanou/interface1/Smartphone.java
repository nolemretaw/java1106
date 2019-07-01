package com.lanou.interface1;

public class Smartphone extends Phone implements PlayGameInterface, CrackPeanutInterface {

	@Override
	public void call() {
		System.out.println("智能手机使用语音打电话~");
	}

	@Override
	public void sendMessage() {
		System.out.println("智能手机使用语音发短信~");
	}

	@Override
	public void playgame() {
		System.out.println("智能手机在玩吃鸡~");
	}

	@Override
	public void crack() {
		System.out.println("锤子手机正在砸核桃~");
	}
	
}
