package practiceDay2;
//����������������
public class Mace extends Weapon {
	public Mace() {
		super("������");
	}
	//�������������˺�ֵ
	@Override
	public int attact() {
		// TODO Auto-generated method stub
		return Config.getIntValue("mace_hurt");
	}
}
