package com.lanou.code;
//�вι���
public class Scc {
	private String brand;
	private int speed;
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Scc(String brand) {
		setBrand(brand);
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Scc(int speed) {
		setSpeed(speed);
	}
	public Scc() {
		
	}
	
	
	public static void main(String[] args) {
		Scc scc = new Scc("�����������Ԫ��");
		scc.speed = 100;
		Scc scc1 = new Scc("������458");
		scc1.speed = 110;
		System.out.println(scc.brand);
		System.out.println(scc1.brand);
		System.out.println(scc.speed + "��/��");
		System.out.println(scc1.speed + "��/��");
	}
}
