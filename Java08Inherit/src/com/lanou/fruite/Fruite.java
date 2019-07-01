package com.lanou.fruite;

public class Fruite {
	private String color;
	private String variety;
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
	
	public Fruite() {
		System.out.println("Fruite的构造方法执行了");
	}
	public Fruite(String color, String variety, double weight) {
		super();
		this.color = color;
		this.variety = variety;
		this.weight = weight;
	}
	
	
}
