package day02;
/*
 	�����ɫ������
 */
public abstract class Role {
	//��ɫ������
	private String name;
	//��ɫ������
	private Weapon weapon;
	
	//�������������name���Ը�ֵ
	public Role(String name) {
		this.name = name;
	}
	//��ȡ�����weapon����ֵ
	public Weapon getWeapon() {
		return weapon;
	}
	//�������weapon���Ը�ֵ
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	@Override
	public String toString() {
		return "Role [name=" + name + ", weapon=" + weapon + "]";
	}
	
}
