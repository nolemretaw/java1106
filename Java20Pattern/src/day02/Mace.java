package day02;
//����������������
public class Mace extends Weapon {
	public Mace() {
		super("������");
	}
	//�������������˺�ֵ
	@Override
	public int attact() {
		// TODO Auto-generated method stub
		return GlobalConst.WEAPON_MACE_HURT;
	}
}
