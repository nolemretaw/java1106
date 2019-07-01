package com.lanou.fruit;

import java.util.ArrayList;
import java.util.List;

public class Container {

	public static void main(String[] args) {
		List<Fruit> fruits = new ArrayList<>();
		double allPrice = 0.00;
		for (int i = 0; i < 5; i++) {
			Fruit fruit = FruitFactory.createFruite();
			fruits.add(fruit);
		}
		for (Fruit fruit : fruits) {
			allPrice += fruit.price();
		}
		System.out.printf("%.2f Ԫ",allPrice);
	}

}
