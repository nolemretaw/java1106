package com.lanou.josn;

public class Phone {
	private String brand;
	private String price;
	private String color;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
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
	public Phone() {
		
	}
	public Phone(String brand, String price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}
	
}
