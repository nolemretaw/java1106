package com.lanou.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		BufferedReader bufferedReader = null;
		Socket socket = null;
		BufferedWriter bufferedWriter = null;
		try {
			//1. 创建服务端Socket,ServerSocket,在创建时需要指定服务端窗口并建立监听
			serverSocket = new ServerSocket(10010);
			//2. 开始监听, 等待客户端的连接
			System.out.println("服务端已经启动,正在等待服务端的连接!");
			socket = serverSocket.accept();//没有连接就处于阻塞
			//3. 获取客户端发送的数据或请求
			//socket中自带进行数据传输的io流
			InputStream inputStream = socket.getInputStream();
			//将字节流转换成字符流
			InputStreamReader iReader = new InputStreamReader(inputStream);
			//将字符流转换为高效的字符流
			bufferedReader = new BufferedReader(iReader);
			String info =null;
			while ((info = bufferedReader.readLine()) != null) {
				System.out.println("客户端发来的信息为: " + info);
			}
			//关闭socket中的流
			socket.shutdownInput();
			//获取输出流,回写数据给客户端
			OutputStream outputStream = socket.getOutputStream();
			OutputStreamWriter oWriter = new OutputStreamWriter(outputStream);
			bufferedWriter = new BufferedWriter(oWriter);
			bufferedWriter.write("你也是");
			bufferedWriter.flush();
			socket.shutdownOutput();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try { 
				if (bufferedReader != null) {
					bufferedReader.close();
				}
				if (bufferedWriter != null) {
					bufferedWriter.close();
				}
				if (socket != null) {
					socket.close();
				}
				if (serverSocket != null) {
					serverSocket.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
