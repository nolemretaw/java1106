package com.lanou.chatroom_聊天室;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//客户端
public class Client {

	public static void main(String[] args) throws Exception {
		//构建一个客户端对象，并指定要连接的服务器ip和端口
		System.out.println("请输入你的名字");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
				
		Socket client = new Socket("localhost", 9999);
		//启动发送线程，不断地从控制台读取数据，发给服务器
		new Thread(new Send(client, name)).start();//通过run()驱动Send(client).send()
		//启动接收线程，不断地从服务器接收数据，显示控制台
		new Thread(new Receive(client)).start();//通过run()驱动Receive(client).receive()
	}

}
