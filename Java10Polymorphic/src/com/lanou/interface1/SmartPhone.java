package com.lanou.interface1;

public class SmartPhone extends Phone implements PlayGameInterface, CrackPeanutInterface {
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("�����ֻ�������绰");
	}
	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("�����ֻ�����������");
	}
	@Override
	public void playgame() {
		// TODO Auto-generated method stub
		System.out.println("�����ֻ�����Լ�");
	}
	public void crack() {
		System.out.println("�����ֻ������Һ���");
	}
}
