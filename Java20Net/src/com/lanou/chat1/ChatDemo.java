package com.lanou.chat1;

public class ChatDemo {
	public static void main(String[] args) {
		//���������ҵĿͻ��������˵��̶߳���
		UDPServer udpServer = new UDPServer(10000);
		UDPClient udpClient = new UDPClient(10000, "192.168.1.124");
		Thread thread1 = new Thread(udpServer);
		Thread thread2 = new Thread(udpClient);
		
		thread1.start();
		thread2.start();
	}
}
