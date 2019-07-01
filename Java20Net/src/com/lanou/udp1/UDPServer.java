package com.lanou.udp1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

//基于UDP协议的服务端
//接收客户端发送的信息
public class UDPServer {
	public static void main(String[] args) {
		DatagramSocket datagramSocket = null;
		try {
			//1. 创建服务器端的一个类DatagramSocket 并指定端口号
			datagramSocket = new DatagramSocket(10000);
			//2. 创建一个数据报(包)用于接收客户端发来的信息
			byte[] data = new byte[1024];
			System.out.println("服务端启动成功,等待客户端的链接");
			
			while (true) {
				//3. 接受客户端发送的数据
				//如果客户端没发送消息,服务端到这就会阻塞
				DatagramPacket datagramPacket = new DatagramPacket(data, data.length);
				datagramSocket.receive(datagramPacket);
				//4. 获取客户端发送的消息
				String info = new String(data,0, datagramPacket.getLength());
				System.out.println("客户端发来的消息是: " + info);
			
			}
			} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (datagramSocket != null) {
				datagramSocket.close();
			}
		}
	}
}
