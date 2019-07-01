package com.lanou.fruit;

public abstract class Fruit {
	private String name;
	public Fruit(String name) {
		this.name = name;
	}
	public abstract double price();
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
}
