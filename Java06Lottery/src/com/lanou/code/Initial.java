package com.lanou.code;

import com.lanou.entity.Student;
//导入外界类的语法
//import 包名.类名
/*
 * 1. 一个包中不允许存在同名的类
 * 2. 不同的包中可以存在同名的类
 * 3. 在同一个类中导入外界类时,不允许导入名称相同的类名,即使同名类是在不同的包中
 * 4. 如果目标类在当前的类在同一个包下面,不需导入即可使用
 * 5. 如果导入的类与当前类所在包中的类同名,导入类的优先级更高
 */
public class Initial {
/*
 * 如果想要在一个类中同时使用两个同名的类,则可以在创建对象时,使用全限定名
 * 全限定名: 包名.类名
 * 此时不需要用import导入
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		com.lanou.dao.Student student = new com.lanou.dao.Student();
		student.sayHi();
		Teacher teacher = new Teacher();//构造方法名, 与类名一致
		teacher.name = "陈清源";
		teacher.gender = "男";
		teacher.age =28;
		teacher.salary = 500000.0f;
		teacher.smoke("中华");
		teacher.watch("走进科学");
		teacher.teach();
	}

}
