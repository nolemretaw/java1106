package com.lanou.practice;

public class TicketTest {

	public static void main(String[] args) {
		SellTicket sellTicket = new SellTicket();
		Thread thread1 = new Thread(sellTicket, "����1"); 
		Thread thread2 = new Thread(sellTicket, "����2");
		Thread thread3 = new Thread(sellTicket, "����3");
		Thread thread4 = new Thread(sellTicket, "����4");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

	}

}
