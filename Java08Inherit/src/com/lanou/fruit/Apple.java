package com.lanou.fruit;

public class Apple extends Fruit {
	private double price;
	private String smell;//ζ��
	
	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getSmell() {
		return smell;
	}


	public void setSmell(String smell) {
		this.smell = smell;
	}


	/*
	 	�޲ι��췽��һ��Ҫ�ṩ
	 	������ִ���޲ι��췽��ʱ,���Ȼ�ȥ���ø����е��޲ι��췽��,
	 	���������ṩ���вι��췽��ʱ �޲ι���Ͳ���Ĭ���ṩ,�����û���ֶ�����д�޲ι���
	 	����һ���̳оͻᱨ��!
	 */
	public Apple() {
		super();
		System.out.println("Apple�Ĺ��췽��ִ����");
	}



	/*
	 	���๹�췽���ڲ�
	 	��ִ�и����е��вι��췽������ɶԹ�������(�̳�����)�ĸ�ֵ
	 	Ȼ����ȥ�������ж��е����Ե�����ֵ!
	 	����������˶��������Եĸ�ֵ!
	 */
	public Apple(double price, String smell, String color, String variety, double weight) {
		//super();
		/*setColor(color);
		setVariety(variety);
		setWeight(weight);*/
		super(color, variety, weight);
		setPrice(price);
		setSmell(smell);
	}
	
	/*public Apple(String color, String variety, double weight, double price, String smell) {
		super(color, variety, weight);
		this.price = price;
		this.smell = smell;
	}*/
	

}
