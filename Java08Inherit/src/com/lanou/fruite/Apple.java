package com.lanou.fruite;

public class Apple extends Fruite {

	private double price;
	private String smell;
	/*�޲ι���ķ���һ��Ҫ�ṩ
	 * ������ִ���޲ι��췽��ʱ,���Ȼ�ȥ���ø����е��޲ι��췽��,
	 * ���������ṩ���вι���ʱ�޲ι���Ͳ���Ĭ���ṩ,�����û���ֶ���д�޲ι���ʱ,
	 * ����һ���̳оͻᱨ��
	 * 
	 */
	public Apple() {
		super();//
		System.out.println("Apple�Ĺ��췽��ִ����");
	}
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
	/*���๹�췽���ڲ�
	 * ��ִ�и����е��вι��췽������ɶԹ�������(�̳�����)�ĸ�ֵ,
	 * Ȼ����ȥ�������ж��е����Ե�����ֵ, ����������˶�ȫ�����Եĸ�ֵ
	 */
//	public Apple(String color, String variety,double weight, double price, String smell) {
//		super(color,variety,weight);//���и����й��췽����ʵ��,�Ǽ̳�
//
////		setColor(color);
////		setVariety(variety);
////		setWeight(weight);
//		setPrice(price);
//		setSmell(smell);
//	}

	public Apple(String color, String variety, double weight, double price, String smell) {
		super(color, variety, weight);
		this.price = price;
		this.smell = smell;
	}
	
	
}
