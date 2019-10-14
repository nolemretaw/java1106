package com.lanou.lsp_里氏替换2;

import java.util.Collection;
import java.util.HashMap;

//覆盖或实现父类的方法时输入参数可以被放大
public class Father {
	public Collection doSomthing(HashMap map) {
		System.out.println("父类被执行");
		return map.values();
	}
}
