package practiceDay2;
//ÎäÆ÷µÄ×ÓÀàÀÇÑÀ°ô
public class Mace extends Weapon {
	public Mace() {
		super("ÀÇÑÀ°ô");
	}
	//·µ»ØÀÇÑÀ°ôµÄÉËº¦Öµ
	@Override
	public int attact() {
		// TODO Auto-generated method stub
		return Config.getIntValue("mace_hurt");
	}
}
