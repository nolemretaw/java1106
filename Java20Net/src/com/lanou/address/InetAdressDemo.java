package com.lanou.address;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * InetAddress�����ʾ������Э��(ip)��ַ
 */
public class InetAdressDemo {

	public static void main(String[] args) {
		
		try {
			//��λ�ȡ������InetAddressʵ��
			InetAddress address = InetAddress.getLocalHost();
			System.out.println(address);//������ / IP��ַ
			System.out.println("������: " + address.getHostName());
			System.out.println("IP��ַ: " + address.getHostAddress());
			//1. ͨ���������ƻ�ȡInetAddressʵ��
			InetAddress address1 = InetAddress.getByName("Cxj");
			System.out.println(address1);
			//2. ͨ��������ַ��ȡInetAddressʵ��
			InetAddress address2 = InetAddress.getByAddress(
					new byte[]{(byte)192,(byte)168,1,2});
			System.out.println(address2.getHostName());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
	}

}
