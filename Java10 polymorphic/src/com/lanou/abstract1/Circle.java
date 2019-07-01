package com.lanou.abstract1;

public class Circle extends Shape {
	private double radius;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(String lineColor, String lineWidth, double radius) {
		super(lineColor, lineWidth);
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("Բ���ܳ�Ϊ: " + radius +
							"�ߵ���ɫΪ: " + getLineColor() +
							"�ߵĿ��Ϊ�� " + getLineWidth());
	}

	@Override
	public double perimeter() {
		return Math.PI * 2 * radius;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
}
