package com.lanou.abstract1;

public abstract class Shape {
	private String lineColor;//绘制的线颜色
	private String lineWidth;//绘制的线宽度
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public String getLineWidth() {
		return lineWidth;
	}
	public void setLineWidth(String lineWidth) {
		this.lineWidth = lineWidth;
	}
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	public Shape(String lineColor, String lineWidth) {
		super();
		this.lineColor = lineColor;
		this.lineWidth = lineWidth;
	}
	
	//抽象的绘制方法
	public abstract void draw();
	//周长、面积的方法
	public abstract double perimeter();
	public abstract double area();
	
	
	
	
	
}
