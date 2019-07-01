package com.lanou.ticket;

public class SellTicket extends Thread {
	public SellTicket() {
		// TODO Auto-generated constructor stub
	}
	
	public SellTicket(String name) {
		super(name);
	}
	
	//共享余票
	/*并发问题出现的条件:
	 * 操作的是共享资源,并且对共享资源进行了修改,多个线程可以同时访问
	 */
	private static int tickets = 100;
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
				if (tickets > 0) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(this.getName() + "正在卖第" + tickets-- + "张票" );
				}else {
					System.out.println("售完");
					break;
				}
			}
		}	
	}
}
