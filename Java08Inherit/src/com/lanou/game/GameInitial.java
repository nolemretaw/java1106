package com.lanou.game;

public class GameInitial {

	public static void main(String[] args) {
		
		Zombie zombie = new Zombie("��ʬ",100, 5, 8);
		MetalBucketZombie bucketZombie = new MetalBucketZombie("��ʬ:", "��Ͱ��ʬ",100, 5, 8, 30);
		System.out.println("���غ� : " + zombie.toString());
		System.out.println("���غ�: " + bucketZombie.toString());
		while(!(zombie.isDead())) {
			
		}
	}

}
