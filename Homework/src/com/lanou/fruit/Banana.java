package com.lanou.fruit;

public class Banana extends Fruit{
	public Banana() {
		super("Ñ©Àæ");	
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return GlobalConst.BANANA_PRICE;
	}
	
}