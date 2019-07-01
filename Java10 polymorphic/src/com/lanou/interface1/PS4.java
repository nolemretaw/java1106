package com.lanou.interface1;
/*
 	智能手机Smartphone已经继承了抽象类Phone
 	此时想要增加玩游戏的功能，并且PS4这个类也具备玩游戏的功能
 	1、在抽象类Phone内部增加一个抽象方法玩游戏，那么Smartphone
 		就具备了玩游戏的功能，但是此时想要让PS4玩游戏，也要继承
 		Phone,但是继承关系就错了，因为PS4并不是手机！
 	2、重新定义一个抽象类，内部定义玩游戏的抽象方法，让Smartphone
 		与PS4同时继承。但是Smartphone已经继承了Phone,因为类的
 		继承是单继承的，所以也不行！
 */
public class PS4 implements PlayGameInterface, C {

	@Override
	public void playgame() {
		System.out.println("PS4正在玩拳皇~");
	}

	@Override
	public void testB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testC() {
		// TODO Auto-generated method stub
		
	}
	
}
