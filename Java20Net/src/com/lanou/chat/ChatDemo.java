package com.lanou.chat;

public class ChatDemo {

	public static void main(String[] args) {
		// 
		UDPServer udpserver = new UDPServer(10000);
		UDPClient udpclient = new UDPClient(10000, "192.168.1.9");
		Thread thread1 = new Thread(udpserver);
		Thread thread2 = new Thread(udpclient);
		thread1.start();
		thread2.start();
		
	}

}
