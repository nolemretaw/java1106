package com.lanou.ticket1;

public class SellTicket implements Runnable {
	
	
	//共享余票
	/*并发问题出现的条件:
	 * 操作的是共享资源,并且对共享资源进行了修改,多个线程可以同时访问
	 */
	private int tickets = 100;
	//共享锁对象
	private static Object object = new Object();
	public void run() {	
		while (true) {
			synchronized (object) {
				/*同步的语法格式:
				 * synchronized(共享锁对象) {
				 * 		产生并发问题的代码
				 * } 
				 * 注意: 
				 * 锁对象可以是任何对象,但通常情况下为Object!
				 * 锁对象必须是共享对象
				 * 线程一旦抢夺到资源,就拥有了锁,加锁的代码不允许第二条线程访问. 
				 * 执行完之后,才会让出锁对象,重新抢夺资源
				*/
				/*synchronized是可以修饰方法的
				 * 如果是静态方法,默认锁对象是当前类的类对象SellTicket.class,继承与实现接口
	 		 		都可以修饰
	 			 * 如果是非静态方法，默认锁对象就是当前类的对象 this 前提是实现接口
				 */
				if (tickets > 0) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets-- + "张票" );
				}else {
					System.out.println("售完");
					break;
				}
			}
		}	
	}
}
