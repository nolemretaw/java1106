package com.lanou.practice;

public class SellTicket implements Runnable {
	private static int tickets = 100;
	private static Object object = new Object();
	@Override
	public void run() {
		while (true) {
			synchronized (object) {
				if (tickets > 0) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "������"+ "��" + tickets-- + "Ʊ");
				}else {
					System.out.println("����");
					break;
				}//ִ����֮���ó�������,����������Դ
			}
		}
	}
}
