package com.lanou.game;
//��ʬ
public class Zombie {
	private String name;
	private int hp;
	private int atk;
	private int spd;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getSpd() {
		return spd;
	}
	public void setSpd(int spd) {
		this.spd = spd;
	}

	public Zombie(){}
	public Zombie(String name, int hp, int atk, int spd){
		super();
		setName(name);
		setAtk(atk);
		setHp(hp);
		setSpd(spd);
	}
	public int loseHp(int hitted){
		hp -= hitted;
		System.out.println("��ʬ�յ�����,��ʧ" + hitted + "Ѫ��");
		return hp;
	}
	public int move(int road){
		road -= spd; 
		System.out.println("��ʬǰ��" + spd + "��");
		return road;
	}
	public boolean isDead() {
		if (hp <= 0) {
			System.out.println("��ʬ����");
			return true;
		}else {
			System.out.println("��ʬ��������");
			return false;
		}
	}
	public String toString(){
		return name + " ���� : " + hp + " ������ :" + atk + " �ٶ�: " + spd;
	}
}
