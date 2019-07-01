package com.lanou.chatroom_������;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Send implements Runnable{
	//����̨������
	private BufferedReader console;
	//��������������ݵ������
	private DataOutputStream dos;
	//�ж��߳��Ƿ������
	private boolean isRunning = true;
	//�û���
	private String name;
	
	
	public Send() {
		this.console = new BufferedReader(new InputStreamReader(System.in));
	}
	public Send(Socket socket, String name) {
		this();//���޲ι�����
		try {
			this.dos = new DataOutputStream(socket.getOutputStream());
			this.name = name;
			//�����ַ���������
			send(this.name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			CloseUtil.close(dos);
			isRunning = false;
		}
	}
	
	//�������ݸ�������
	public void send(String msg) {
//		String msg = getMsgFromConsole();
		if (msg != null || !"".equals(msg)) {
			try {
				//�����ݷ���������
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
	//�ӿ���̨��ȡ����
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
	
	//�̲߳��ϵ����������������
	@Override
	public void run() {
		while (isRunning) {
			//����������͵������Ǵӿ���̨��ȡ������
			send(getMsgFromConsole());
		}	
	}
	
}
