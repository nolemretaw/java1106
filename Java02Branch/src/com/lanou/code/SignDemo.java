package com.lanou.code;

public class SignDemo {

	public static void main(String[] args) {
		// 符合运算符 += -= *= /= %=
		int a=2;
		a +=10;
		/*
		 * 关系,逻辑运算符
		 * 关系:> < >= <= == !=
		 * 由关系运算符链接的表达式都是bool 类型
		 * 逻辑:&&  ||  !
		 * && and 并且 逻辑与 
		 * 由&&连接的表达式想要为真,则需要满足 表达式1 && 表达式2 都为真  才能为真
		 * || or 或者 逻辑或
		 * 由|| 链接的表达式想要为真, 则只需满足其中一个表达式为真即可
		 * 
		 */
		int num1 = 10, num2 = 9;
		boolean isTrue = num1 > num2 || num1-- > num2;
//		&&同真为真,一假为假
//		||同假为假,一真为真
		//短路现象,boolean运算
		System.out.println(isTrue);
		System.out.println(num1);
		System.out.println(num2);
	}

}
