package com.lanou.fruite;

public class Apple extends Fruite {

	private double price;
	private String smell;
	/*无参构造的方法一定要提供
	 * 当子类执行无参构造方法时,首先会去调用父类中的无参构造方法,
	 * 当父类中提供了有参构造时无参构造就不会默认提供,而如果没有手动书写无参构造时,
	 * 子类一旦继承就会报错
	 * 
	 */
	public Apple() {
		super();//
		System.out.println("Apple的构造方法执行了");
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
	/*子类构造方法内部
	 * 先执行父类中的有参构造方法来完成对公共属性(继承属性)的赋值,
	 * 然后再去对子类中独有的属性单独赋值, 这样就完成了对全部属性的赋值
	 */
//	public Apple(String color, String variety,double weight, double price, String smell) {
//		super(color,variety,weight);//进行父类中构造方法的实现,非继承
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
