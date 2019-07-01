package com.lanou.teachHomework;

public class 单例模式 {
/**单例模式：在一个类中只允许存在一个对象，提供给外界使用
 * 懒汉式单例
 * 	1、特点:
 * 		在外界需要单例对象，调用方法时才会构建出来的对象，
 * 		相当于延迟构建对象时机，会节省内存空间
 *	2、缺点:
 *		在多线程高并发的情况下，可能会有线程不安全的问题，产生多个对象
 *	3、解决:
 *		1>加同步代码块，能保证线程安全，但是所有线程都需要等待，时间性能会下降
 *		2>双重检查锁:保证后面来的线程不需要等待，提升时间性能
 *			提升时间性能，能保证:节省内存，线程安全，时间性能高
 * 饿汉式单例
 * 	1、特点:
 * 		无论外界需不需要使用到这个单例对象，在类加载时，
 * 		都会直接构建对象，可能会造成空间浪费
 * 	2、缺点:
 * 		类加载时(也许只是想调用静态方法，不想构建对象)，都会直接构建对象，
 * 		可能会造成空间浪费
 * 	3、解决:
 * 		使用静态内部类，外部类加载时，不会构建对象，只有调用方法需要构建对象时，
 * 		才会加载静态内部类，初始化单例对象
 * */
	public static void main(String[] args) {
		//启动20条线程获取单例的任务
//		for (int i = 0; i < 20; i++) {
//			Thread t = new Thread(new GetInstanceTask());
//			t.start();
//		}
		Single.method();
	}
}
/*懒汉式单例模式*/
class Singletion{
	/**构造器私有化，不允许在外界构建对象*/
	private Singletion(){
		System.out.println("懒汉");
	}
	
	/**声明本类的对象*/
	private static Singletion instance;
	
	/**对外界提供一个公开的方法来获取这个单例对象*/
	public static Singletion getInstance(){
		/**同步代码块:
		 * 	所有代码块都会在这里进行等待，然后逐个进去
		 * 	判断instance是否为null
		 * 	第一批过来的线程会顺次序过来执行判断，并创建一个对象返回，
		 * 	但是后面过来的线程也会等待，然后顺次序进入同步代码块执行判断操作，
		 * 	这样会造成时间上的浪费
		 * 
		 * 解决方案:
		 * 	双重检查锁 double checked 再加一个判断,
		 * 	为后面过来的线程省掉了等待时间，可以提升时间性能
		 * 	
		 * */
		if (instance == null) {
			synchronized (Singletion.class){
				if (instance == null) {
					instance = new Singletion();
				}	
			}
		}
		return instance;
	}
}
/**饿汉式单例*/
class Single{
	/**构造器私有化*/
	private Single(){
		System.out.println("饿汉实例");
	}
	public static void method() {
		System.out.println("饿汉method");
	}
	/**构建本类的对象*/
	static class SingleHolder{
	private static Single instance = new Single();
	}
	
	/**对外界提供一个公开方法，来获取这个单例对象*/
	
	public static Single getInstance(){
		return SingleHolder.instance;
	}
}

/**获取懒汉单例的任务类*/
class GetInstanceTask implements Runnable{
	@Override
	public void run() {
//		Singletion instance = Singletion.getInstance();
//		System.out.println(instance);
		Single instance = Single.getInstance();
		System.out.println(instance);
	}
}