package com.lanou.chatroom_������;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//�ͻ���
public class Client {

	public static void main(String[] args) throws Exception {
		//����һ���ͻ��˶��󣬲�ָ��Ҫ���ӵķ�����ip�Ͷ˿�
		System.out.println("�������������");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
				
		Socket client = new Socket("localhost", 9999);
		//���������̣߳����ϵشӿ���̨��ȡ���ݣ�����������
		new Thread(new Send(client, name)).start();//ͨ��run()����Send(client).send()
		//���������̣߳����ϵشӷ������������ݣ���ʾ����̨
		new Thread(new Receive(client)).start();//ͨ��run()����Receive(client).receive()
	}

}
