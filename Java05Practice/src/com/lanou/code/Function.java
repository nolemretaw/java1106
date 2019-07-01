package com.lanou.code;

public class Function {
	/*方法的注意事项:
	 * 1. 方法是具有特定功能的代码段
	 * 2. 目的是为了简化代码,提高代码的复用性,体现了封装的思想
	 * 3. 方法是不允许嵌套定义的
	 * 从方法定义角度出发,分为:
	 * 		系统库方法
	 * 		自定义方法
	 * 			手动定义方法,完成对方法的分装
	 * 
	 * 方法定义的语法格式:
	 *  访问修饰符  返回值类型  方法名(参数列表) {
	 *  	封装的功能
	 *  }
	 *  访问修饰符  作用:限定定义的方法的访问范围
	 *  public protected private
	 *  public表示此方法可以在任意位置被调用
	 *  
	 *  方法要体现此方法的功能,见名知意,首字母小写,驼峰法,可以重复命名
	 */
	/*
	 * 从返回值与参数出发,可以将方法分为四种:
	 * 有参有返  
	 * 无参无返
	 * 有参无返
	 * 无参有返
	 * 如果一个需求中想要得到一个结果,则需要返回值,反之,则无返回值
	 * 如果一个需求中有不明确的或多变的信息,则将此信息声明为参数
	 */
	//1 无参无返  打印hello world
	public static void sayHi() {
		System.out.println("hello world");
	}
	//2 有参无返  封装一个整型数字的功能
	public static void printNum(int num) {
		System.out.println(num);
	}
	/*
	 * 参数列表中的语法格式:
	 * 		参数类型  参数名1, 参数类型  参数名2, ...
	 * 参数名的命名规则和变量名的命名规则一致
	 */
	//3. 无参有返  得到一个[10 , 20]区间的随机整数
	/*
	 * 返回值的注意事项:
	 * 1. 返回值类型一定要与方法内部return的结果一致
	 * 2. 有返回值, 方法内部就要有return代码,而无返回值,方法内部返回值类型为void,内部没有return代码,
	 * 如何有return,则属return;
	 * 3. return语句之后的语句都能不会执行
	 * 4. 返回值的类型是唯一的, 返回数组为    返回值类型[]
	 */
	public static int randomNum(){
		int num = (int)(Math.random()*(20-10+1))+10;
		return num;
	}
	//有参有返  得到某一个区间内的随机整数
	/*方法的重载,是Java提供的一种机制
	 * 重载构成的条件如下:
	 * 		1. 在同一个类内部
	 * 		2. 方法名一致
	 * 		3. 参数类型, 个数, 顺序不一致
	 * 		4. 与返回值类型和访问修饰符无关
	 * 重载的方法, 在调用时会根据传入的具体参数信息,来选择执行相对应的方法
	 */
	
	public static int randomNum(int min, int max) {
		return (int)(Math.random()*(max-min+1))+10;
	}
	public static void main(String[] args) {
		/*
		 * 方法的使用:方法的定义  方法的调用
		 * 方法定义完成,内部的代码如果没有调用方法,是不会执行的
		 * 调用方法:
		 * 方法名(参数列表), 无参数()内不行内容
		 */
		sayHi();
		/*
		 * 当有参数时,方法调用要注意:
		 * 定义时的参数个数,顺序(类型)  要与参数传入时一致
		 * 方法调用时,是值的拷贝操作,而非替换操作
		 * 方法调用时,形参会拷贝实参的值参与运算
		 * 形参:方法定义时的参数
		 * 实参:方法调用时的参数
		 */
		printNum(988);
		int num = randomNum();
		System.out.println(num);
		System.out.println(randomNum(20, 30));
	}

}
