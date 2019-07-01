package com.lanou.code;

public class Food {
	private String pizza;
	private String ice;
	
	public void setPizza(String pizza) {
		this.pizza =pizza;
	}
	public String getPizza(String pizza) {
		return pizza;
	}
	public void setIce(String ice) {
		this.ice = ice;
	}
	public String getIce(String ice) {
		return ice;
	}
	
	public static void main(String[] args) {
		Food food = new Food();
		food.pizza = "至尊四合一匹萨";
		food.ice = "巧克力";
		System.out.println(food.pizza);
		System.out.println(food.ice);
		
		Food food1 = new Food();
		food1.pizza = "圣诞四合一匹萨";
		food1.ice = "草莓";
		System.out.println(food1.pizza);
		System.out.println(food1.ice);
	}
}
