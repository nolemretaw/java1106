package com.lanou.game;

import java.time.chrono.MinguoChronology;

public class MetalBucketZombie extends Zombie {
	private String name;
	private int armorHp;//����
	public void setName(String name1){
		this.name = name1;
	}
	public String getName(){
		return name;
	}
	public void setArmorHp(int armorHp) {
		this.armorHp = armorHp;
	}
	public int getArmorHp() {
		return armorHp;
	}
	public MetalBucketZombie() {}
	
	
	public MetalBucketZombie(String name, String name1,int hp, int atk, int spd, int armorHp) {
		super(name, hp, atk, spd);
		this.name = name1;
		this.armorHp = armorHp;
	}
	public int loseArmorHp(int hitted) {
		armorHp -= hitted;
		System.out.println("������ļ�" + hitted);
		return armorHp;
	}
	public boolean weakness(boolean isAttract){
		if (isAttract) {
			armorHp = 0;
			System.out.println("���߱�������");
			return true;
		}
		return false;
	}
	public boolean isDeadArmor(){
		if (armorHp <= 0) {
			System.out.println("��������");
			return true;
		}
		return false;
	}
	public String toString(){
		return name + " ���� : " + getHp() + " ������ : " + getAtk() +" �������: " +armorHp + " �ٶ� : " + getSpd(); 
	}
}
