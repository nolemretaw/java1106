package com.lanou.connection;

public class Fruit {
	private String brand;
	private boolean isExist;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public boolean isExist() {
		return isExist;
	}
	public void setExist(boolean isExist) {
		this.isExist = isExist;
	}
	public Fruit(String brand, boolean isExist) {
		super();
		this.brand = brand;
		this.isExist = isExist;
	}
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	
}
