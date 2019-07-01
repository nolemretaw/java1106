package com.lanou.lsp_里氏替换2;

import java.util.HashMap;

public class Client {

	public static void main(String[] args) {
		// 父类存在的地方，子类也能存在
		/**父类的形参(小)是一个HashMap,子类的形参(大)是Map，将形参称为前置条件
		 * 子类的形参相较于父类范围变大了,子类代替父类，子类的方法不被执行
		 **/
//		Father father = new Father();
		Son father = new Son();
		HashMap map = new HashMap();
		//给父类传一个比其形参范围大的,
		father.doSomthing(map);
	}

}
