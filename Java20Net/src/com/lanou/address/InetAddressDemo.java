package com.lanou.address;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 	InetAddress 此类表示互联网协议(ip)地址!
 */
public class InetAddressDemo {
	public static void main(String[] args) {
		
		try {
			//如何获取本机的InetAddress实例
			InetAddress address = InetAddress.getLocalHost();
			
			System.out.println("主机名" + address.getHostName());
			System.out.println("ip地址" + address.getHostAddress());
			
			/*
			 	直接打印这个InetAddress对象,得到的是   主机名/ip地址
			 */
			System.out.println(address);
			
			//如何获取任何一个主机的InetAddress实例
			//1.通过主机名称获取InetAddress实例
			InetAddress newAdd = InetAddress.getByName("Cxj");
			System.out.println(newAdd);
			
			//2.通过主机的ip地址,获取InetAddress实例
			InetAddress newAdd1 = InetAddress.getByAddress(new byte[]{(byte)192, (byte)168, (byte)1, (byte)2});
			System.out.println(newAdd1);
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
