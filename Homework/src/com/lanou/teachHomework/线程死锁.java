package com.lanou.teachHomework;

public class �߳����� {
/**
 * �߳�����
 * ����ԭ��
 * 	1����ǰ�߳�ӵ�������߳�����Ҫ����Դ
 * 	2����ǰ�߳���Ҫ�ȴ������߳��ͷ���Դ
 * 	3��˫�������ͷ��Լ�������Դ
 * */
	public static void main(String[] args) {
		// ����������
		Object innerLock = new Object();
		Object outerLock = new Object();
		//���������
		Thread t1 = new Thread(){
			public void run() {
				//���������ӵ���������
				synchronized (outerLock) {
					System.out.println(Thread.currentThread()
							.getName()+" t1-->outerLock");
					synchronized (innerLock) {
						System.out.println(Thread.currentThread()
								.getName()+" t1-->innerLock����");
					}
				}
			}
		};
		//���������
		Thread t2 = new Thread(){
			//��������������������
			public void run() {
				synchronized (innerLock) {
					System.out.println(Thread.currentThread()
							.getName()+" t2-->innerLock");
					synchronized (outerLock) {
						System.out.println(Thread.currentThread()
								.getName()+" t2-->outerLock����");
					}
				}
			}
		};
		t1.start();
		t2.start();
	}

}
