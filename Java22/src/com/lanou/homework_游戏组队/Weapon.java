package com.lanou.homework_��Ϸ���;

//����������
public abstract class Weapon {
	private String name;//����������
	public Weapon(String name) {//������������name���Ը�ֵ
		this.name = name;
	}
	// �����Ĺ���������ͬ�������˺�ֵ��ͬ��Ӧд�ɳ��󷽷�@return ���ؾ������������˺�ֵ
	public abstract int attack();
	@Override
	public String toString() {
		return name ;
	}
}
