package com.lanou.fruit;

public class Orange extends Fruit{
	public Orange() {
		super("���");	
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return GlobalConst.ORANGE_PRICE;
	}
	
}