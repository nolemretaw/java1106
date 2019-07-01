package com.lanou.ticket1;

public class TicketDemo {

	public static void main(String[] args) {
	//创建四个买票窗口
		SellTicket sellTicket = new SellTicket();
		Thread thread1 = new Thread(sellTicket,"窗口1");
		Thread thread2 = new Thread(sellTicket,"窗口2");
		Thread thread3 = new Thread(sellTicket,"窗口3");
		Thread thread4 = new Thread(sellTicket,"窗口4");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
