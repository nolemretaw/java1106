package com.lanou.fruit;

public class Fruit {
	private String color;
	private String variety;//种类
	private double weight;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getVariety() {
		return variety;
	}
	public void setVariety(String variety) {
		this.variety = variety;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Fruit() {//无参构造必须要有
		System.out.println("Fruit类的构造方法执行了");
	}
	
	
	public Fruit(String color, String variety, double weight) {
		super();
		this.color = color;
		this.variety = variety;
		this.weight = weight;
	}
	
	
}
