package com.lanou.code;

public class SwitchDemo {

	public static void main(String[] args) {
		/*1 . switch()括号内放的变量的类型只能是byte short int char String Enum枚举(很少用)
		 * 2. case后面给定的值一定要与switch控制的变量的类型相同
		 * 3. case语句中的break不能省略,省略会贯彻case,直到switch结束
		 * 4. 如果所有的case都没有匹配,则会执行defaul代码
		 */
		String season = "spring";
		switch (season) {
			case "spring":
				System.out.println("放风筝");
				break;
			case "summer":
				System.out.println("游泳");
				break;
			case "automn":
				System.out.println("吃火锅");
				break;
			case "winter":
				System.out.println("打雪仗");
				break;
//			default:		
		}
	}

}
