package com.lanou.chatroom_������;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

//�ͻ��˽������ݵ��߳�
public class Receive  implements Runnable{
	//���շ�������������
	private DataInputStream dis;
	//�ж��߳��Ƿ��ִ��
	private boolean isRunning = true;
	//��������ʼ��������
	public Receive(Socket socket) {
		try {
			this.dis = new DataInputStream(socket.getInputStream());
			
		} catch (IOException e) {
			e.printStackTrace();
			CloseUtil.close(dis);
			isRunning = false;
		}
	}	
	//���շ��������ؿͻ��˵�����@return
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
	//���ϵؽ������ݲ���ӡ��ʾ
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (isRunning) {
			System.out.println(receive());
		}
	}

}
