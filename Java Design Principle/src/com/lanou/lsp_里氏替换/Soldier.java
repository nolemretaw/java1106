package com.lanou.lsp_里氏替换;
//士兵实现类
public class Soldier {
	
	private AbstractGun gun;
	
	public void setGun(AbstractGun gun) {
		this.gun = gun;
	}
	
	public void killEnemy() {
		System.out.println("士兵开始射击");
		this.gun.shoot();
	}
}
