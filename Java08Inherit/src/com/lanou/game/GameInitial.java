package com.lanou.game;

public class GameInitial {

	public static void main(String[] args) {
		
		Zombie zombie = new Zombie("僵尸",100, 5, 8);
		MetalBucketZombie bucketZombie = new MetalBucketZombie("僵尸:", "铁桶僵尸",100, 5, 8, 30);
		System.out.println("本回合 : " + zombie.toString());
		System.out.println("本回合: " + bucketZombie.toString());
		while(!(zombie.isDead())) {
			
		}
	}

}
