package com.lanou.runable;

public class ThreadDemo {
	public static void main(String[] args) {
		//�����̶߳���
		/*���췽��ժҪ
		Thread(Runnable target) 
		          �����µ� Thread ����
		Thread(Runnable target, String name) 
		          �����µ� Thread ����
*/
		Thread thread = new Thread(new RunThread());
		thread.setName("����");
		Thread thread2 = new Thread(new RunThread());
		thread2.setName("�ƻ�");
		Thread thread3 = new Thread(new RunThread(), "С��");
		Thread thread4 = new Thread(new RunThread(), "���");
		
		thread.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}
