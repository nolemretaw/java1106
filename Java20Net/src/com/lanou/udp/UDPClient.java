package com.lanou.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPClient {
	public static void main(String[] args) {
		DatagramSocket datagramSocket = null;
		try {
			//1. ����datagramSocket����
			datagramSocket = new DatagramSocket();
			//2. ׼������,���͵���Ϣ,(�����)���͵�
			byte[] data = "����˧".getBytes(); 
			InetAddress address = InetAddress.getByName("192.168.1.222");
			int port = 10000;
			//3. �������ݱ�,����װ���͵���Ϣ�Լ�Ŀ�ĵ�
			DatagramPacket datagramPacket = new DatagramPacket(data, data.length,address,port);
			//4. �����ݱ�����
			
			datagramSocket.send(datagramPacket);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
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
