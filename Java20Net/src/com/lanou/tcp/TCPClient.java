package com.lanou.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) {
		Socket socket = null;
		BufferedWriter bufferedWriter = null;
		BufferedReader bufferedReader = null;
		try {
			//1. 创建客户端的Socket,指定ip与端口
			socket = new Socket("localhost", 10010);
			//2. 通过socket的输出流来传输数据到服务端
			OutputStream outputStream = socket.getOutputStream();
			OutputStreamWriter oWriter = new OutputStreamWriter(outputStream);
			bufferedWriter = new BufferedWriter(oWriter);
			bufferedWriter.write("你很帅");
			bufferedWriter.flush();
			socket.shutdownOutput();
			//3. 获取输入流,回写数据给服务端
			InputStream inputStream = socket.getInputStream();
			//将字节流转换成字符流
			InputStreamReader iReader = new InputStreamReader(inputStream);
			//将字符流转换为高效的字符流
			bufferedReader = new BufferedReader(iReader);
			String info =null;
			while ((info = bufferedReader.readLine()) != null) {
				System.out.println("服务端发来的信息为: " + info);
			}
			//关闭socket中的流
			socket.shutdownInput();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (bufferedWriter != null) {
					bufferedWriter.close();
				}
				if (bufferedReader != null) {
					bufferedReader.close();
				}
				if (socket != null) {
					socket.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
