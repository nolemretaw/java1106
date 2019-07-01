package com.lanou.tcp1;
 
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
 
public class ServerTCP {
	//������
	public static void testServer(){
		//����һ��������
		System.out.println("�ȴ��ͻ������ӡ�����");
		PrintWriter pwtoclien = null;//�ַ���ӡ
		Scanner keybordscanner = null;
		Scanner inScanner = null;
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(10000);
			//����һ���������ӿͻ��˵Ķ���
			Socket socket = serverSocket.accept();
			System.out.println(socket.getInetAddress()+"�ѳɹ����ӵ���̨�������ϡ�");
			//�ַ������
			pwtoclien = new PrintWriter(socket.getOutputStream());
			pwtoclien.println("�ѳɹ����ӵ�Զ�̷�������"+"\t");
			pwtoclien.flush();
			keybordscanner = new Scanner(System.in);
			inScanner = new Scanner(socket.getInputStream());
			//�����ȴ��ͻ��˷�����Ϣ����
			while(inScanner.hasNextLine()){
				String indata = inScanner.nextLine();
				System.out.println("�ͻ��ˣ�"+indata);
				System.out.print("����ˣ�");
				String keyborddata = keybordscanner.nextLine();
				System.out.println("����ˣ�"+keyborddata);
				pwtoclien.println(keyborddata);
				pwtoclien.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			pwtoclien.close();
			keybordscanner.close();
			inScanner.close();
			try {
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		testServer();
	}
}
