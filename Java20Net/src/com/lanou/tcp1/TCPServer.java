package com.lanou.tcp1;

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
			serverSocket = new ServerSocket(10090);
			while (true) {
				//1. ���������Socket,ServerSocket,�ڴ���ʱ��Ҫָ������˴��ڲ���������
				
				//2. ��ʼ����, �ȴ��ͻ��˵�����
				System.out.println("������Ѿ�����,���ڵȴ�����˵�����!");
				socket = serverSocket.accept();//û�����Ӿʹ�������
				InputStream inputStream = socket.getInputStream();//�Է���������
				InputStreamReader iReader = new InputStreamReader(inputStream);
				bufferedReader = new BufferedReader(iReader);
				String info =null;
				while ((info = bufferedReader.readLine()) != null) {
					System.out.println("�ͻ��˷�������ϢΪ: " + info);
				}
				//�ر�socket�е���
				socket.shutdownInput();
				
				OutputStream outputStream = socket.getOutputStream();//�Է��������
				bufferedReader = new BufferedReader(new InputStreamReader(System.in));//��������
				info = bufferedReader.readLine();
				byte[] data = info.getBytes();
				outputStream.write(data, 0, data.length);
				outputStream.flush();
				socket.shutdownOutput();	
				
			}
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
