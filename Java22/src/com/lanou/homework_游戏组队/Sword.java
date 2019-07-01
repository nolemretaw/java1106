package com.lanou.homework_游戏组队;
//武器子类剑
public class Sword extends Weapon{

	public Sword() {
		super("剑");
		// TODO Auto-generated constructor stub
	}

	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return GlobalConst.WEAPON_SWORD_HURT;
	}
	
}
