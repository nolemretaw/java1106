package com.lanou.homework_��Ϸ���;
/*
 * ȫ�ֳ���
 * ����ԭ��
 */
public class GlobalConst {
	//�������ýӿڵ��������
	private static BaseConfig config = new PullXmlConfig();//Config/Dom4jXmlConfig/DomXmlConfig �ӿڶ�̬
/** ����������*/
	/**������*/
	public static final int WEAPON_TYPE_KNIFE= config.getIntValue("weapon_type_knife");
	/**������*/
	public static final int WEAPON_TYPE_SWORD= config.getIntValue("weapon_type_sword");
	/**����������*/
	public static final int WEAPON_TYPE_MACE= config.getIntValue("weapon_type_mace");
	
/** ��ɫ������*/
	/**սʿ����*/
	public static final String ROLE_TYPE_SOLDIER = config.getStringValue("role_type_soldier");
	/**ħ��ʦ����*/
	public static final String ROLE_TYPE_MAGCIAN = config.getStringValue("role_type_magcian");	
/**�������˺�ֵ*/
	/**���������˺�ֵ*/
	public static final int WEAPON_KNIFE_HURT = config.getIntValue("knife_hurt");
	/**���������˺�ֵ*/
	public static final int WEAPON_SWORD_HURT = config.getIntValue("sword_hurt");
	/**�������������˺�ֵ*/
	public static final int WEAPON_MACE_HURT = config.getIntValue("mace_hurt");

}
