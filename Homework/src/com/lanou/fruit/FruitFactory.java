package com.lanou.fruit;

import java.util.Scanner;

public class FruitFactory {
	public static Fruit createFruite() {
		System.out.println("��ѡ��ˮ��:a.ƻ�� ��3.00 o.��� ��2.00 b.�㽶 ��1.00");
		String fruits = new Scanner(System.in).next();
		if (fruits.equals(GlobalConst.FRUIT_TYPE_APPLE)) {
			return new Apple();
		}else if (fruits.equals(GlobalConst.FRUIT_TYPE_ORANGE)) {
			return new Orange();
		}else if (fruits.equals(GlobalConst.FRUIT_TYPE_BANANA)) {
			return new Banana();
		}else {
			throw new WrongFruitCheckedException("�޸�ˮ��");
		}
	}
}
