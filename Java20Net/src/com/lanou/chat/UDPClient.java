package com.lanou.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPClient implements Runnable{
	private int port;
	private String ip;
	public UDPClient(int port, String ip) {
		// TODO Auto-generated constructor stub
	super();
	this.ip = ip;
	this.port = port;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		DatagramSocket datagramSocket = null;
		BufferedReader bufferedReader = null;
		try {
			//1. ����datagramSocket����
			datagramSocket = new DatagramSocket();
			//2. ׼������,���͵���Ϣ,(�����)���͵�
		
			InetAddress address = InetAddress.getByName(ip);
//			int port = 10000;
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				String info = bufferedReader.readLine();
				byte[] data = info.getBytes();
				//3. �������ݱ�,����װ���͵���Ϣ�Լ�Ŀ�ĵ�
				DatagramPacket datagramPacket = new DatagramPacket(data, data.length,address,port);
				//4. �����ݱ�����
				
				datagramSocket.send(datagramPacket);
			}
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
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
