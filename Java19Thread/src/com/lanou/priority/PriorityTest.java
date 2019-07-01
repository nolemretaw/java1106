package com.lanou.priority;

public class PriorityTest {

	public static void main(String[] args) {
		// 创建三条线程
		PriorityThread pThread1 = new PriorityThread("线程1");
		PriorityThread pThread2 = new PriorityThread("线程2");
		PriorityThread pThread3 = new PriorityThread("线程3");
		PriorityThread pThread4 = new PriorityThread("线程4");
		/*  static int	MAX_PRIORITY 
			          线程可以具有的最高优先级。
			static int	MIN_PRIORITY 
			          线程可以具有的最低优先级。
			static int	NORM_PRIORITY 
			          分配给线程的默认优先级。
		 * 线程优先级是1~10之间的整数,默认值为5
		 * 
		 * 优先级高的不是绝对的,是一种概率性问题,非100%
		 */
		pThread1.setPriority(Thread.MAX_PRIORITY);
		pThread2.setPriority(Thread.MIN_PRIORITY);
		pThread3.setPriority(Thread.MIN_PRIORITY);
		pThread4.setPriority(Thread.MIN_PRIORITY);
		
		pThread1.start();
		pThread2.start();
		pThread3.start();
		pThread4.start();
	}

}	
