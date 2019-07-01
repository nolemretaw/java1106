package day02;
/*
 	代表角色抽象类
 */
public abstract class Role {
	//角色的名称
	private String name;
	//角色的武器
	private Weapon weapon;
	
	//构造器给对象的name属性赋值
	public Role(String name) {
		this.name = name;
	}
	//获取对象的weapon属性值
	public Weapon getWeapon() {
		return weapon;
	}
	//给对象的weapon属性赋值
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	@Override
	public String toString() {
		return "Role [name=" + name + ", weapon=" + weapon + "]";
	}
	
}
