package com.lanou.lsp_里氏替换;

public class Client {

	public static void main(String[] args) {
		/*Soldier soldier = new Soldier();
		//士兵使用手枪
		soldier.setGun(new Handgun());
		soldier.killEnemy();
		
		//士兵使用步枪
		soldier.setGun(new Rifle());
		soldier.killEnemy();
		
		//士兵使用机枪
		soldier.setGun(new CachineGun());
		soldier.killEnemy();
		*/
		
		//狙击手用狙击步枪
		Snipper snipper = new Snipper();
		snipper.killEnemy(new AUG());//子类有其个性后无法里氏替换
	}

}
