package com.lanou.excepton;

import javax.naming.spi.DirStateFactory.Result;

//自定义 异常类,需要继承Exception
class MyException extends Exception {
	String message; //保存异常信息
	public MyException(String message) {
		this.message = message;
	}
	//返回错误信息的方法是继承的方法
	@Override
	public String getMessage() {
		return message;
	}
}
public class DefineException {
	public static int test(int a, int b) throws MyException {
		if (b < 0) {
			//抛出自定义异常
			throw new MyException("除数不能小于0");
		}
		System.out.println("测试");
		return a / b;
	}
	public static void main(String[] args) {
		int a = 10, b = -1;
		int result = 0;
		try {
			result = test(a, b);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("其他异常");
		}
		System.out.println(result);
	}
}
