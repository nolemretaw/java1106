package day02;

//���������൶
public class Knife extends Weapon {

	public Knife() {
		super("��Ҷ��");
	}
	//���ص����˺�ֵ
	@Override
	public int attact() {
		return GlobalConst.WEAPON_KNIFE_HURT;
	}
	
}
