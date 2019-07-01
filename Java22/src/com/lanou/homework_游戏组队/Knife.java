package com.lanou.homework_游戏组队;

public class Knife extends Weapon{

	public Knife() {
		super("铁刀");
		// TODO Auto-generated constructor stub
	}
	//返回到的伤害值
	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return GlobalConst.WEAPON_KNIFE_HURT;
	}

}
