package com.lanou.interface1;

public class Smartphone extends Phone implements PlayGameInterface, CrackPeanutInterface {

	@Override
	public void call() {
		System.out.println("�����ֻ�ʹ��������绰~");
	}

	@Override
	public void sendMessage() {
		System.out.println("�����ֻ�ʹ������������~");
	}

	@Override
	public void playgame() {
		System.out.println("�����ֻ�����Լ�~");
	}

	@Override
	public void crack() {
		System.out.println("�����ֻ������Һ���~");
	}
	
}
