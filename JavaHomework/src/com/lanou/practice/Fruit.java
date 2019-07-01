package com.lanou.practice;
/*
 设计一个水果类Fruit，创建一个能装5个水果的篮子Container，
 水果有苹果Apple,3元1个、橘子Orange,2元1个和香蕉Banana,
 1元1个,从控制台输入要购买的水果名称,然后放入篮子中,当篮子装满时,计算总价格
 */
public class Fruit {
	private String name;
	private int money;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	public Fruit(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", money=" + money + "]";
	}
	
}
