package com.lanou.fruit;

import java.util.Scanner;

public class FruitFactory {
	public static Fruit createFruite() {
		System.out.println("请选择水果:a.苹果 ￥3.00 o.香橙 ￥2.00 b.香蕉 ￥1.00");
		String fruits = new Scanner(System.in).next();
		if (fruits.equals(GlobalConst.FRUIT_TYPE_APPLE)) {
			return new Apple();
		}else if (fruits.equals(GlobalConst.FRUIT_TYPE_ORANGE)) {
			return new Orange();
		}else if (fruits.equals(GlobalConst.FRUIT_TYPE_BANANA)) {
			return new Banana();
		}else {
			throw new WrongFruitCheckedException("无该水果");
		}
	}
}
