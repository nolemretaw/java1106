package com.lanou.code;
//有参构造
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
		Scc scc = new Scc("兰博基尼第六元素");
		scc.speed = 100;
		Scc scc1 = new Scc("法拉利458");
		scc1.speed = 110;
		System.out.println(scc.brand);
		System.out.println(scc1.brand);
		System.out.println(scc.speed + "米/秒");
		System.out.println(scc1.speed + "米/秒");
	}
}
