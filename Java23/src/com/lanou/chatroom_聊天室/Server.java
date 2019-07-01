package com.lanou.chatroom_������;

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
	//�������ϴ洢���еĿͻ������Ӷ���
	static List<MyChannel> all = new ArrayList<>();
	
	

	public static void main(String[] args) throws IOException {
		//����������������ʼ�˿�
		ServerSocket server = new ServerSocket(9999);
		System.err.println("�����������");
		
		//ѭ�����տͻ��ˣ���Ϊÿһ���ͻ�����һ���߳�
		while (true) {
			//���տͻ��˵����ӣ�����ʽ��
			Socket socket = server.accept();
			//Զ�̻�ȡ�˿ں�ip
			System.err.println("�ͻ��ˣ� " + socket.getRemoteSocketAddress() + "������");
			//Ϊ�������Ŀͻ��˹���һ���̲߳�����
			MyChannel channel = new MyChannel(socket);
			//����ǰ�ͻ������Ӵ��뼯��
			all.add(channel);
			new Thread(channel).start();
		}
	}
	
	//Ϊÿһ���ͻ��˿���һ���������߳�
	static class MyChannel implements Runnable{
		//���տͻ��˴�����������
		private DataInputStream dis;
		//��ͻ��˻ش�����
		private DataOutputStream dos;
		//�ж��߳��Ƿ������
		private boolean isRunning = true;
		//��ǰ�ͻ��������̵߳�����
		private String name;
		
		
		//��������ʼ����
		public MyChannel(Socket socket) {
			try {
				this.dis = new DataInputStream(socket.getInputStream());
				this.dos = new DataOutputStream(socket.getOutputStream());
				//��ȡ�ͻ��˷���������
				this.name = dis.readUTF();
				//��Ⱥ����Լ���һ����Ϣ
				this.send("��ӭ����������");
				this.sendOthers(this.name + "������������",true);
				
				//Ȼ����Ѿ���Ⱥ�ڵ������˷�����Ϣ��ת����
				
				
			} catch (IOException e) {
				e.printStackTrace();
				CloseUtil.close(dis,dos);
				isRunning = false;
				all.remove(this);
			}
		}
		
		//���տͻ��˷��͵�����
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
		
		//���ͻ��˻ش�����
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
	
		/**����ǰ�ͻ��˷��͵���Ϣת���������ͻ���
		 * �ж���Ϣ��ʽ��
		 * Լ���� @XXX:hello �ø�ʽΪ˽��
		 * ������ʽΪȺ��
		 */
		public void sendOthers(String msg, boolean isSystemMsg) {
			//�ж������Ƿ�Ϊ˽��
			if (msg.startsWith("@") && msg.contains(":")) {
				//��ȡҪ˽�ĵ�����
				String name = msg.substring(1, msg.lastIndexOf(":"));
				//��ȡҪ˽�ĵ�����
				String content = msg.substring(msg.lastIndexOf(":") + 1);
				//�������ϣ�����Ҫ˽�ĵĿͻ���
				for (MyChannel other : all) {
					if (other.name.equals(name)) {
						other.send(this.name+"˽�� �� " + content);
					}
				}
			}else {
				//��ȡ��ǰ�ͻ��˷��͵���Ϣ
//				String msg = receive();
				for (MyChannel other : all) {
					if (other == this) {//����������Լ�������
						continue;
					}
					if (isSystemMsg) {//��ϵͳ��Ϣ
						other.send(msg);
						
					}else {//����ϵͳ��Ϣ
						//�������ͻ��˷�����Ϣ
						other.send(this.name + "��������˵��" + msg);
					}				
				}
			}	
		}
		
		//���ӿͻ��˽��յ�������ת���������ͻ���
		@Override
		public void run() {
			while (isRunning) {
				sendOthers(receive(),false);
			}
		}
		
	}

}
