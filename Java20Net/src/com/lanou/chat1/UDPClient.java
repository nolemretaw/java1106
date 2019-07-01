package com.lanou.chat1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPClient implements Runnable {
	private int port;//端口
	private String ip;//ip地址
	public UDPClient(int port, String ip) {
		super();
		this.port = port;
		this.ip = ip;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		DatagramSocket datagramSocket = null;
		BufferedReader bufferedReader  = null;
		
		try {
			//1.创建DatgramSocket对象
			datagramSocket= new DatagramSocket();
			
			//2.准备数据，发送的信息，(服务端)发送地址,发送的端口
			InetAddress address = InetAddress.getByName(ip);
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			
			while (true) {
				String info = bufferedReader.readLine();
				byte[] data = info.getBytes();
				
				//3.创建数据报，来封装发送的信息以及目的地
				DatagramPacket datagramPacket = new DatagramPacket(data, data.length, address, port);
				
				//4.
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
		} finally {
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
