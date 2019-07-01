package com.lanou.chatroom_聊天室;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
	//构建集合存储所有的客户端连接对象
	static List<MyChannel> all = new ArrayList<>();
	
	

	public static void main(String[] args) throws IOException {
		//创建服务器，并开始端口
		ServerSocket server = new ServerSocket(9999);
		System.err.println("服务端已启动");
		
		//循环接收客户端，并为每一个客户分配一个线程
		while (true) {
			//接收客户端的连接（阻塞式）
			Socket socket = server.accept();
			//远程获取端口和ip
			System.err.println("客户端： " + socket.getRemoteSocketAddress() + "已连接");
			//为连接来的客户端构建一个线程并启动
			MyChannel channel = new MyChannel(socket);
			//将当前客户端连接存入集合
			all.add(channel);
			new Thread(channel).start();
		}
	}
	
	//为每一个客户端开辟一条独立的线程
	static class MyChannel implements Runnable{
		//接收客户端传过来的数据
		private DataInputStream dis;
		//向客户端回传数据
		private DataOutputStream dos;
		//判断线程是否可运行
		private boolean isRunning = true;
		//当前客户端连接线程的名字
		private String name;
		
		
		//构造器初始化流
		public MyChannel(Socket socket) {
			try {
				this.dis = new DataInputStream(socket.getInputStream());
				this.dos = new DataOutputStream(socket.getOutputStream());
				//获取客户端发来的名称
				this.name = dis.readUTF();
				//进群后给自己发一条消息
				this.send("欢迎进入聊天室");
				this.sendOthers(this.name + "进入了聊天室",true);
				
				//然后给已经在群内的其他人发送消息（转发）
				
				
			} catch (IOException e) {
				e.printStackTrace();
				CloseUtil.close(dis,dos);
				isRunning = false;
				all.remove(this);
			}
		}
		
		//接收客户端发送的数据
		public String receive(){
			String msg = "";
			try {
				msg = dis.readUTF();
				System.err.println(msg);
			} catch (IOException e) {
				e.printStackTrace();
				CloseUtil.close(dis);
				isRunning = false;
				all.remove(this);
			}
			return msg;
		}
		
		//给客户端回传数据
		public void send(String msg){
			if (msg == null || "".equals(msg)){
				return ;
			}
			try {
				dos.writeUTF(msg);
				dos.flush();
			} catch (IOException e) {
				e.printStackTrace();
				CloseUtil.close(dos);
				isRunning = false;
				all.remove(this);
			}
			
		}
	
		/**将当前客户端发送的消息转发给其他客户端
		 * 判断消息格式：
		 * 约定： @XXX:hello 该格式为私聊
		 * 其他格式为群聊
		 */
		public void sendOthers(String msg, boolean isSystemMsg) {
			//判断内容是否为私聊
			if (msg.startsWith("@") && msg.contains(":")) {
				//获取要私聊的人名
				String name = msg.substring(1, msg.lastIndexOf(":"));
				//获取要私聊的内容
				String content = msg.substring(msg.lastIndexOf(":") + 1);
				//遍历集合，查找要私聊的客户端
				for (MyChannel other : all) {
					if (other.name.equals(name)) {
						other.send(this.name+"私聊 ： " + content);
					}
				}
			}else {
				//获取当前客户端发送的消息
//				String msg = receive();
				for (MyChannel other : all) {
					if (other == this) {//如果遍历到自己，跳过
						continue;
					}
					if (isSystemMsg) {//是系统消息
						other.send(msg);
						
					}else {//不是系统消息
						//给其他客户端发送消息
						other.send(this.name + "对所有人说：" + msg);
					}				
				}
			}	
		}
		
		//将从客户端接收到数据再转发给其他客户端
		@Override
		public void run() {
			while (isRunning) {
				sendOthers(receive(),false);
			}
		}
		
	}

}
