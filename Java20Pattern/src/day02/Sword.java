package day02;
//武器的子类剑
public class Sword extends Weapon {
	public Sword() {
		super("七星剑");
	}
	//返回剑的伤害值
	@Override
	public int attact() {
		// TODO Auto-generated method stub
		return GlobalConst.WEAPON_SWORD_HURT;
	}
}
