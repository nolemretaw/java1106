package com.lanou.homework_��Ϸ���;
/*
 * �����ɫ������
 */
public abstract class Role {
	private String name;//��ɫ����
	private Weapon weapon;//��ɫ����
	//�Ǿ�̬���˶��󣬲��ܵ��ô˷���
	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Role(String name) {//�������������name���Ը�ֵ
		this.name = name;
	}

	@Override
	public String toString() {
		return "Role [name=" + name + ", weapon=" + weapon + "]";
	}
	
}
