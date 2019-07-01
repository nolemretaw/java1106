package com.lanou.aspect;

public class EmpAspect {
	/**开启事物*/
	public void beginTx(){
		System.out.println("前置通知==>开启事物");
	}
	/**提交事物*/
	public void commitTx(){
		System.out.println("后置通知==>提交事物");
	}
}
