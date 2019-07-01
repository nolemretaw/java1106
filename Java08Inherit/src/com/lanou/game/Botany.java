package com.lanou.game;
//Ö²Îï
public class Botany extends Game {
	private String colour;
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String colour() {
		return colour;
	}
	public Botany() {
		super();
	}
	public Botany(String name, int hp, String method, int attack, String colour) {
		super(name, hp, method, attack);
		setColour(colour);
	}
	@Override
	public String toString() {
		return "Botany [colour=" + colour + ", getName()=" + getName() + ", getHp()=" + getHp() + ", getMethod()="
				+ getMethod() + ", getAttack()=" + getAttack() + "]";
	}
	
}
