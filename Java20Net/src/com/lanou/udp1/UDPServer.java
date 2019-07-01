package com.lanou.udp1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

//����UDPЭ��ķ����
//���տͻ��˷��͵���Ϣ
public class UDPServer {
	public static void main(String[] args) {
		DatagramSocket datagramSocket = null;
		try {
			//1. �����������˵�һ����DatagramSocket ��ָ���˿ں�
			datagramSocket = new DatagramSocket(10000);
			//2. ����һ�����ݱ�(��)���ڽ��տͻ��˷�������Ϣ
			byte[] data = new byte[1024];
			System.out.println("����������ɹ�,�ȴ��ͻ��˵�����");
			
			while (true) {
				//3. ���ܿͻ��˷��͵�����
				//����ͻ���û������Ϣ,����˵���ͻ�����
				DatagramPacket datagramPacket = new DatagramPacket(data, data.length);
				datagramSocket.receive(datagramPacket);
				//4. ��ȡ�ͻ��˷��͵���Ϣ
				String info = new String(data,0, datagramPacket.getLength());
				System.out.println("�ͻ��˷�������Ϣ��: " + info);
			
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
