package com.lanou.address;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * InetAddress此类表示互联网协议(ip)地址
 */
public class InetAdressDemo {

	public static void main(String[] args) {
		
		try {
			//如何获取本机的InetAddress实例
			InetAddress address = InetAddress.getLocalHost();
			System.out.println(address);//主机名 / IP地址
			System.out.println("主机名: " + address.getHostName());
			System.out.println("IP地址: " + address.getHostAddress());
			//1. 通过主机名称获取InetAddress实例
			InetAddress address1 = InetAddress.getByName("Cxj");
			System.out.println(address1);
			//2. 通过主机地址获取InetAddress实例
			InetAddress address2 = InetAddress.getByAddress(
					new byte[]{(byte)192,(byte)168,1,2});
			System.out.println(address2.getHostName());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
	}

}
