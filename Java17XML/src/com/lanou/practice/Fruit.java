package com.lanou.practice;

public class Fruit {
	private String name;
	private String taste;
	private String price;
	private String color;
	private String shape;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public Fruit() {
		
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", taste=" + taste + ", price=" + price + ", color=" + color + ", shape=" + shape
				+ "]";
	}
	
	
}
