package practiceDay2;

//���������൶
public class Knife extends Weapon {

	public Knife() {
		super("��Ҷ��");
	}
	//���ص����˺�ֵ
	@Override
	public int attact() {
		return Config.getIntValue("knife_hurt");
	}
	
}
