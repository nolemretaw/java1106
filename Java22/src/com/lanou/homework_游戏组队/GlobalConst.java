package com.lanou.homework_游戏组队;
/*
 * 全局常量
 * 开闭原则
 */
public class GlobalConst {
	//构建配置接口的子类对象
	private static BaseConfig config = new PullXmlConfig();//Config/Dom4jXmlConfig/DomXmlConfig 接口多态
/** 武器的类型*/
	/**刀类型*/
	public static final int WEAPON_TYPE_KNIFE= config.getIntValue("weapon_type_knife");
	/**剑类型*/
	public static final int WEAPON_TYPE_SWORD= config.getIntValue("weapon_type_sword");
	/**狼牙棒类型*/
	public static final int WEAPON_TYPE_MACE= config.getIntValue("weapon_type_mace");
	
/** 角色的类型*/
	/**战士类型*/
	public static final String ROLE_TYPE_SOLDIER = config.getStringValue("role_type_soldier");
	/**魔法师类型*/
	public static final String ROLE_TYPE_MAGCIAN = config.getStringValue("role_type_magcian");	
/**武器的伤害值*/
	/**武器刀的伤害值*/
	public static final int WEAPON_KNIFE_HURT = config.getIntValue("knife_hurt");
	/**武器剑的伤害值*/
	public static final int WEAPON_SWORD_HURT = config.getIntValue("sword_hurt");
	/**武器狼牙棒的伤害值*/
	public static final int WEAPON_MACE_HURT = config.getIntValue("mace_hurt");

}
