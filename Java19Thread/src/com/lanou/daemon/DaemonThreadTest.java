package com.lanou.daemon;

public class DaemonThreadTest {
	public static void main(String[] args) {
		DaemonThread dThread = new DaemonThread();
		dThread.setName("�ػ��߳�");
		
		CommonThread cThread = new CommonThread();
		cThread.setName("���ػ��߳�");
		
		/*
		 	�����ػ��̵߳Ĵ���,����������start()֮ǰ,
		 	���������û������һ�����ػ��߳�,���ػ��߳���ֹ����
		 	�ػ��߳��ǰ�����ػ��߳�
		 	eg:JVM�������վ��Ƿǳ���ְ��һ���ػ��߳�
		 */
		dThread.setDaemon(true);
		
		dThread.start();
		cThread.start();
	}
}
