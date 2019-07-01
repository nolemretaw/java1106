package com.lanou.chat1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

//基于UDP协议的服务端
//接收客户端发送的信息
public class UDPServer implements Runnable {
	private  int port;//端口
	public UDPServer(int port) {
		super();
		this.port = port;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		DatagramSocket datagramSocket = null;
		try {
			//1.创建服务器端的类DatagramSocket 并且指定端口号
			datagramSocket = new DatagramSocket(port);
			
			//2.创建一个数据报(包),用于接收客服端发来的信息
			byte[] data = new byte[1024];
			System.out.println("服务端启动成功,等待客户端的连接");
			
			while (true) {
				//3.接收客户端的输入发出的数据
				//如果客户端没有发送消息,服务端到此就会堵塞

				DatagramPacket datagramPacket = new DatagramPacket(data, data.length);
				datagramSocket.receive(datagramPacket);
				
				//4.获取客户端发送的消息
				String info = new String(data, 0, data.length);
				System.out.println("客户端发来的消息" + info);
			}
			
			
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (datagramSocket != null) {
				datagramSocket.close();
			}
		}
	}
}
