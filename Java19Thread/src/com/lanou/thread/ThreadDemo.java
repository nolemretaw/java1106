package com.lanou.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		// �����̶߳���
		/*���췽��ժҪ
			Thread() 
			          �����µ� Thread ����
			
			Thread(String name) 
			          �����µ� Thread ���� 
		 */
		MyThread myThread = new MyThread();
		myThread.setName("����");
		MyThread myThread1 = new MyThread();
		myThread1.setName("�ƻ�");
		
		MyThread myThread2 = new MyThread("С��");
		MyThread myThread3 = new MyThread("����");
		//�̵߳���������run()����.��ֻ��������װ�̹߳��ܷ�����
		//�̵߳�������ִ��start����,����run()����
		myThread.start();
		myThread1.start();
		myThread2.start();
		myThread3.start();
		
	}

}
