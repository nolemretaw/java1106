package com.lanou.homework_游戏组队;

//武器抽象类
public abstract class Weapon {
	private String name;//武器的名字
	public Weapon(String name) {//构造器给武器name属性赋值
		this.name = name;
	}
	// 武器的攻击方法不同、返回伤害值不同，应写成抽象方法@return 返回具体子类武器伤害值
	public abstract int attack();
	@Override
	public String toString() {
		return name ;
	}
}
