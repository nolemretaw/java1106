package com.lanou.runable;

/*
 	实现线程的第二种方式
 		新建类,实现Runnable接口,并实现run()方法
 	为什么要在有继承实现的基础上,添加接口实现多线程
 	因为继承有单继承的局限性,当一个类继承了非Thread类,那么此时此类就无法实现多线程了
 	提供接口实现多线程,可以在不破坏继承关系的前提下,实现多线程
 */
public class RunThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			/*
			 	Thread类的类方法currentThread()可以得到当前的线程对象
			 */
			System.out.println(Thread.currentThread().getName() + "HelloWorld" + i);
		}
		
	}

}
