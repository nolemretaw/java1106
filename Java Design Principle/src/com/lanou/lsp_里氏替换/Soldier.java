package com.lanou.lsp_�����滻;
//ʿ��ʵ����
public class Soldier {
	
	private AbstractGun gun;
	
	public void setGun(AbstractGun gun) {
		this.gun = gun;
	}
	
	public void killEnemy() {
		System.out.println("ʿ����ʼ���");
		this.gun.shoot();
	}
}
