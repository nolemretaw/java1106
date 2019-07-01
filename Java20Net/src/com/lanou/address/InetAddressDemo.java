package com.lanou.address;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 	InetAddress �����ʾ������Э��(ip)��ַ!
 */
public class InetAddressDemo {
	public static void main(String[] args) {
		
		try {
			//��λ�ȡ������InetAddressʵ��
			InetAddress address = InetAddress.getLocalHost();
			
			System.out.println("������" + address.getHostName());
			System.out.println("ip��ַ" + address.getHostAddress());
			
			/*
			 	ֱ�Ӵ�ӡ���InetAddress����,�õ�����   ������/ip��ַ
			 */
			System.out.println(address);
			
			//��λ�ȡ�κ�һ��������InetAddressʵ��
			//1.ͨ���������ƻ�ȡInetAddressʵ��
			InetAddress newAdd = InetAddress.getByName("Cxj");
			System.out.println(newAdd);
			
			//2.ͨ��������ip��ַ,��ȡInetAddressʵ��
			InetAddress newAdd1 = InetAddress.getByAddress(new byte[]{(byte)192, (byte)168, (byte)1, (byte)2});
			System.out.println(newAdd1);
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
