package com.lanou.priority;

public class PriorityTest {

	public static void main(String[] args) {
		// ���������߳�
		PriorityThread pThread1 = new PriorityThread("�߳�1");
		PriorityThread pThread2 = new PriorityThread("�߳�2");
		PriorityThread pThread3 = new PriorityThread("�߳�3");
		PriorityThread pThread4 = new PriorityThread("�߳�4");
		/*  static int	MAX_PRIORITY 
			          �߳̿��Ծ��е�������ȼ���
			static int	MIN_PRIORITY 
			          �߳̿��Ծ��е�������ȼ���
			static int	NORM_PRIORITY 
			          ������̵߳�Ĭ�����ȼ���
		 * �߳����ȼ���1~10֮�������,Ĭ��ֵΪ5
		 * 
		 * ���ȼ��ߵĲ��Ǿ��Ե�,��һ�ָ���������,��100%
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
