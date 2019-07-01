package com.lanou.lsp_里氏替换2;

import java.util.Collection;
import java.util.Map;

public class Son extends Father{
	public Collection doSomething(Map map) {
		System.out.println("子类被执行");
		return map.values();
	}
}
