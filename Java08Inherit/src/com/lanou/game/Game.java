package com.lanou.game;

public class Game {
	private String name;//名字
	private int hp;//血量
	private String method;//攻击方法
	private int attack;//攻击力
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getHp() {
		return hp;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getMethod() {
		return method;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getAttack() {
		return attack;
	}
	public Game() {
		
	}
	public Game(String name, int hp, String method, int attack) {
		this.name = name;
		this.hp = hp;
		this.method = method;
		this.attack = attack;
	}
	@Override
	public String toString() {
		return "Game [ name ="+ name +", hp ="+ hp +", method = "+ method +", attack ="+ attack +" ]";
	}
}
