package day02;
//���������ལ
public class Sword extends Weapon {
	public Sword() {
		super("���ǽ�");
	}
	//���ؽ����˺�ֵ
	@Override
	public int attact() {
		// TODO Auto-generated method stub
		return GlobalConst.WEAPON_SWORD_HURT;
	}
}
