package com.lanou.lsp_�����滻;

public class Client {

	public static void main(String[] args) {
		/*Soldier soldier = new Soldier();
		//ʿ��ʹ����ǹ
		soldier.setGun(new Handgun());
		soldier.killEnemy();
		
		//ʿ��ʹ�ò�ǹ
		soldier.setGun(new Rifle());
		soldier.killEnemy();
		
		//ʿ��ʹ�û�ǹ
		soldier.setGun(new CachineGun());
		soldier.killEnemy();
		*/
		
		//�ѻ����þѻ���ǹ
		Snipper snipper = new Snipper();
		snipper.killEnemy(new AUG());//����������Ժ��޷������滻
	}

}
