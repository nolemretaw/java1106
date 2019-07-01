package com.lanou.chatroom_聊天室;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Send implements Runnable{
	//控制台输入流
	private BufferedReader console;
	//向服务器发送数据的输出流
	private DataOutputStream dos;
	//判断线程是否可运行
	private boolean isRunning = true;
	//用户名
	private String name;
	
	
	public Send() {
		this.console = new BufferedReader(new InputStreamReader(System.in));
	}
	public Send(Socket socket, String name) {
		this();//调无参构造器
		try {
			this.dos = new DataOutputStream(socket.getOutputStream());
			this.name = name;
			//将名字发给服务器
			send(this.name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			CloseUtil.close(dos);
			isRunning = false;
		}
	}
	
	//发送数据给服务器
	public void send(String msg) {
//		String msg = getMsgFromConsole();
		if (msg != null || !"".equals(msg)) {
			try {
				//将数据发给服务器
				this.dos.writeUTF(msg);
				this.dos.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				CloseUtil.close(dos);
				isRunning = false;
			}
			
		}
	}
	//从控制台读取数据
	public String getMsgFromConsole() {
		try {
			return console.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			CloseUtil.close(console);
			isRunning = false;
		}
		return "";
	}
	
	//线程不断地向服务器发送数据
	@Override
	public void run() {
		while (isRunning) {
			//向服务器发送的数据是从控制台读取的数据
			send(getMsgFromConsole());
		}	
	}
	
}
