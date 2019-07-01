package com.lanou.code;

public class Plant {
	private String name;
	private int hp;
	private int atk;
	private void setName(String name){
		this.name = name;
	}
	private String getName(){
		return name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getHp(){
		return hp;
	}
	public void setAtk(int atk){
		this.atk = atk;
	}
	public int getAtk(){
		return atk;
	}
	public Plant(){}
	public Plant(String name, int hp, int atk){
		setName(name);
		setHp(hp);
		setAtk(atk);		
	}
	public int loseHp(int hitted){
		hp -= hitted;
		System.out.println("±»½©Ê¬¹¥»÷,ËðÊ§ " + hitted + "ÑªÁ¿");
		return hp;
	}
	public boolean isDead(){
		if (hp <= 0) {
			return true; 
		}
		return false;
	}
	
}
