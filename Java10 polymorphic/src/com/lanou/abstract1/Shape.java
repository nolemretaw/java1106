package com.lanou.abstract1;

public abstract class Shape {
	private String lineColor;//���Ƶ�����ɫ
	private String lineWidth;//���Ƶ��߿��
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
	
	//����Ļ��Ʒ���
	public abstract void draw();
	//�ܳ�������ķ���
	public abstract double perimeter();
	public abstract double area();
	
	
	
	
	
}
