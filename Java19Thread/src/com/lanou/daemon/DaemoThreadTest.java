package com.lanou.daemon;

public class DaemoThreadTest {

	public static void main(String[] args) {
		Thread dthread = new Thread(new DaemonThread(), "�ػ��߳�");
		Thread cthread = new Thread(new CommandThread(), "���ػ��߳�");
		/*
		 * �����ػ��̵߳Ĵ��������start()֮ǰ,���������û������һ�����ػ��߳�,���ػ��߳���ֹ����
		 * �ػ��߳��ǰ�����ػ��̵߳�
		 * ����:JVM�������վ���һ���ػ��߳�
		 */
		dthread.setDaemon(true);
		dthread.start();
		cthread.start();
	}
}



