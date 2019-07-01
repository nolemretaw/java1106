package com.lanou.interface1;

/*
	如果抽象类内部所有的方法都是抽象方法，那么此时，可以使用接口来存放这些方法
	接口其实就是行为规范，它只对行为进行抽象，也就是接口中只有方法，没有属性
	接口也是数据类型
*/
/*
	接口定义的语法格式：
	接口名一般有两种表示形式  
	以 I开头 PlayGameInterface IPlayGame
	或者最后一个单词是Service或者Interface
	public interface 接口名(与类名的命名一致) {
		抽象方法...
	}
*/
/*
	接口的特点：
	1、接口中的方法都是抽象的，那么在定义时，可以省略abstract关键字
	2、接口中的方法同样只有声明，没有实现,没有大括号
	3、接口不能直接创建对象或者直接实例化
	4、接口的实现语法格式 implements 接口1, 接口2...
	5、实现接口的类，必须实现接口中定义的方法
	6、一个类可以实现多个接口
	7、接口中的方法，不能与static final private 共存
	8、接口中定义的都是常量，常量一般都会放到接口中定义
	默认就是static final修饰的，可以通过实现类的对象访问，也可以通过
	接口名直接访问(推荐使用)，并且命名规范是全大写，多个单词之间使用下划线隔开
	9、接口是可以继承的，可以多继承，也可以多级继承
*/
public interface PlayGameInterface {
	public static final int NUM = 10;
	public void playgame();
}
