package com.lanou.ticket;

public class TicketDemo {

	public static void main(String[] args) {
	//�����ĸ���Ʊ����
		SellTicket sellTicket = new SellTicket("����1");
		SellTicket sellTicket2 = new SellTicket("����2");
		SellTicket sellTicket3 = new SellTicket("����3");
		SellTicket sellTicket4 = new SellTicket("����4");
		sellTicket.start();//��������ִ��һ��,�������͵ȴ�����ִ�����ٴ�����
		sellTicket2.start();
		sellTicket3.start();
		sellTicket4.start();
	}

}
