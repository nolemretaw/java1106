package day02;
/*
 	代表武器抽象类
 */
public abstract class Weapon {
	//代表武器的名字
	private String name;
	
	//构造器给name属性赋值
	public Weapon(String name) {
		this.name = name;
	}
	/*
	 	武器的攻击方法
	 		因为不同武器的攻击方式,返回伤害值不相同,所以应该写成抽象方法
	 	@return 返回具体子类武器的攻击伤害值
	 */
	public abstract int attact();
	@Override
	public String toString() {
		return "Weapon [name=" + name + "]";
	}
	
}
