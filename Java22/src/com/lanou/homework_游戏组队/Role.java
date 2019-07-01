package com.lanou.homework_游戏组队;
/*
 * 代表角色抽象类
 */
public abstract class Role {
	private String name;//角色名称
	private Weapon weapon;//角色武器
	//非静态有了对象，才能调用此方法
	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Role(String name) {//构造器给对象的name属性赋值
		this.name = name;
	}

	@Override
	public String toString() {
		return "Role [name=" + name + ", weapon=" + weapon + "]";
	}
	
}
