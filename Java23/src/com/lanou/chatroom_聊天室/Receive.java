package com.lanou.chatroom_聊天室;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

//客户端接收数据的线程
public class Receive  implements Runnable{
	//接收服务器的输入流
	private DataInputStream dis;
	//判断线程是否可执行
	private boolean isRunning = true;
	//构造器初始化输入流
	public Receive(Socket socket) {
		try {
			this.dis = new DataInputStream(socket.getInputStream());
			
		} catch (IOException e) {
			e.printStackTrace();
			CloseUtil.close(dis);
			isRunning = false;
		}
	}	
	//接收服务器返回客户端的数据@return
	public String receive() {
		String msg = "";
		try {
			msg = dis.readUTF();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			CloseUtil.close(dis);
			isRunning = false;
		}
		return msg;
	}
	//不断地接收数据并打印显示
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (isRunning) {
			System.out.println(receive());
		}
	}

}
