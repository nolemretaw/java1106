package com.lanou.connection;

public class FruitTest {

	public static void main(String[] args) {
		Fruit fruit = new Fruit();
		fruit.setBrand("ÁñÁ«");
		fruit.setExist(false);
		BuyFruit buyFruit = new BuyFruit(fruit);
		ProduceFruit produceFruit = new ProduceFruit(fruit);
		buyFruit.start();
		produceFruit.start();
	}

}
