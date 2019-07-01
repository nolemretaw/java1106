package com.lanou.abstract1;

public class Rectangle extends Shape {
	
	private double width;//���
	private double height;//�߶�
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(String lineColor, String lineWidth, double width, double height) {
		super(lineColor, lineWidth);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		System.out.println("���εĿ��Ϊ: " + width +
							", ���εĸ߶�Ϊ: " + height +
							", �ߵ���ɫΪ: " + getLineColor() +
							", �ߵĿ��Ϊ: " + getLineWidth());
	}
	@Override
	public double perimeter() {
		return width * 2 + height * 2;
	}
	@Override
	public double area() {
		return width * height;
	}
	
}
