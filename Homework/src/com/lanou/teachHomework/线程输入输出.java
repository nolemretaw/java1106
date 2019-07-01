package com.lanou.teachHomework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * һ���̲߳��ϵشӿ���̨���룬��һ���̲߳��ϵؽ���Щ����д�뵽�ļ�
 * 
 * ������������ģʽ��
 * �����ߣ��ӿ���̨���������߳�
 * �������ڴ��ж���һ����������������
 * �����ߣ�������д�����ļ����߳�
 * */
public class �߳�������� {

	public static void main(String[] args) {
		//����
		Ram ram = new Ram();
		//������
		ReadThread readThread = new ReadThread(ram);
		//������
		WriteThread writeThread = new WriteThread(ram);
		readThread.start();
		writeThread.start();
	}

}
/**�����ߣ���ȡ���ݵ��߳�*/
class ReadThread extends Thread{
	private Ram ram;
	public ReadThread(Ram ram) {
		this.ram = ram;
	}
	//���ϵض�
	@Override
	public void run() {
		while (true) {
			ram.read();
		}
	}
}

/**�������ڴ�*/
class Ram{
	/**����̨������*/
	BufferedReader console;
	/**�ļ������*/
	PrintWriter out;
	/**��ȡ����һ������*/
	String line;
	/**�ж������Ƿ�����*/
	public boolean isFull;
	public Ram() {
		this.console = new BufferedReader(new InputStreamReader(System.in));
		try {
			this.out = new PrintWriter("test13.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	/**�ӿ���̨��ȡ���ݵķ���*/
	public synchronized void read() {
		//1���ж������Ƿ����������˵ȴ�
		if (isFull) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//2����ȡһ������
		try {
			System.out.println("�����룺");
			line = console.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//3���޸ı�־λ����ʾ��������
		isFull = true;
		//4��֪ͨ�����߳�
		this.notify();
	}
	/**���ļ�д���ݵķ���*/
	public synchronized void write() {
		//�ж������Ƿ�������δ����ȴ�
		if (!isFull) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//2��������ݵ��ļ�
		out.println(line);
		out.flush();
	//3���޸ı�־λ
		isFull = false;
		//4��֪ͨ�����߳�
		this.notify();
	}
}
/**�����ߣ�д�����ݵ��ļ����߳�*/
class WriteThread extends Thread{
	private Ram ram;
	public WriteThread(Ram ram) {
		this.ram = ram;
	}
	//���ϵ�д
	@Override
	public void run() {
		while(true){
			ram.write();
		}
	}
}