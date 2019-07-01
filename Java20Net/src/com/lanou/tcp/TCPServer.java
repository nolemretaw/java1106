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
			//1. ���������Socket,ServerSocket,�ڴ���ʱ��Ҫָ������˴��ڲ���������
			serverSocket = new ServerSocket(10010);
			//2. ��ʼ����, �ȴ��ͻ��˵�����
			System.out.println("������Ѿ�����,���ڵȴ�����˵�����!");
			socket = serverSocket.accept();//û�����Ӿʹ�������
			//3. ��ȡ�ͻ��˷��͵����ݻ�����
			//socket���Դ��������ݴ����io��
			InputStream inputStream = socket.getInputStream();
			//���ֽ���ת�����ַ���
			InputStreamReader iReader = new InputStreamReader(inputStream);
			//���ַ���ת��Ϊ��Ч���ַ���
			bufferedReader = new BufferedReader(iReader);
			String info =null;
			while ((info = bufferedReader.readLine()) != null) {
				System.out.println("�ͻ��˷�������ϢΪ: " + info);
			}
			//�ر�socket�е���
			socket.shutdownInput();
			//��ȡ�����,��д���ݸ��ͻ���
			OutputStream outputStream = socket.getOutputStream();
			OutputStreamWriter oWriter = new OutputStreamWriter(outputStream);
			bufferedWriter = new BufferedWriter(oWriter);
			bufferedWriter.write("��Ҳ��");
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
