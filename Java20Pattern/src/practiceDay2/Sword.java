package practiceDay2;
//���������ལ
public class Sword extends Weapon {
	public Sword() {
		super("���ǽ�");
	}
	//���ؽ����˺�ֵ
	@Override
	public int attact() {
		// TODO Auto-generated method stub
		return Config.getIntValue("sword_hurt");
	}
}
