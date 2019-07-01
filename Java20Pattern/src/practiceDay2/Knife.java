package practiceDay2;

//武器的子类刀
public class Knife extends Weapon {

	public Knife() {
		super("柳叶刀");
	}
	//返回刀的伤害值
	@Override
	public int attact() {
		return Config.getIntValue("knife_hurt");
	}
	
}
