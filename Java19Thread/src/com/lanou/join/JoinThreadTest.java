package com.lanou.join;

public class JoinThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinThread jThread1 = new JoinThread("�߳�1");
		JoinThread jThread2 = new JoinThread("�߳�2");
		JoinThread jThread3 = new JoinThread("�߳�3");
		jThread1.start();
		try {
			/*
		������߳�ִ��ʱ,��Ҫ����ĳһ�߳�ִ����֮�����Դ���߽��ʱ,���Խ������������߳�����Ϊ�����߳�.
		�����߳�Ϊ����ִ�����,�����̲߳���ִ��
		*/
			jThread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jThread2.start();
		jThread3.start();
	}

}
