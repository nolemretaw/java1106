package com.lanou.practice;
/*
 ���һ��ˮ����Fruit������һ����װ5��ˮ��������Container��
 ˮ����ƻ��Apple,3Ԫ1��������Orange,2Ԫ1�����㽶Banana,
 1Ԫ1��,�ӿ���̨����Ҫ�����ˮ������,Ȼ�����������,������װ��ʱ,�����ܼ۸�
 */
public class Fruit {
	private String name;
	private int money;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	public Fruit(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", money=" + money + "]";
	}
	
}
