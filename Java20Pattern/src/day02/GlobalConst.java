package day02;
//全局常量
//开闭原则
public class GlobalConst {
	private static BaseConfig config = new DomXmlConfig();
	//武器的类型
	//刀的类型
	public static final int WEAPON_TYPE_KNIFE = config.getIntValue("weapon_type_knife");
	//剑的类型
	public static final int WEAPON_TYPE_SWORD = config.getIntValue("weapon_type_sword");
	//狼牙棒的类型
	public static final int WEAPON_TYPE_MACE = config.getIntValue("weapon_type_mace");
	
	//角色的类型
	//战士类型
	public static final String ROLE_TYPE_SOLDIER = config.getStringValue("role_type_soldier");
	//魔法师类型
	public static final String ROLE_TYPE_MAGICER = config.getStringValue("role_type_magicer");
	
	//武器的伤害值
	//刀的伤害值
	public static final int WEAPON_KNIFE_HURT = config.getIntValue("knife_hurt");
	//剑的伤害值
	public static final int WEAPON_SWORD_HURT = config.getIntValue("sword_hurt");
	//狼牙棒的伤害值
	public static final int WEAPON_MACE_HURT = config.getIntValue("mace_hurt");
}
