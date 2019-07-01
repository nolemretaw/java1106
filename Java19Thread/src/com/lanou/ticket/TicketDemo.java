package com.lanou.ticket;

public class TicketDemo {

	public static void main(String[] args) {
	//创建四个买票窗口
		SellTicket sellTicket = new SellTicket("窗口1");
		SellTicket sellTicket2 = new SellTicket("窗口2");
		SellTicket sellTicket3 = new SellTicket("窗口3");
		SellTicket sellTicket4 = new SellTicket("窗口4");
		sellTicket.start();//能抢到则执行一会,抢不到就等待别人执行完再次争夺
		sellTicket2.start();
		sellTicket3.start();
		sellTicket4.start();
	}

}
