package com.lanou.thread;
/*
 * �̵߳ĵ�һ�ִ�����ʽ:
 * �½���,�̳�Thread��,������дrun����
 */
public class MyThread extends Thread{
	public MyThread() {
		// TODO Auto-generated constructor stub
	}
	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		/*run�����еĴ�����ǳ����в�����ʱ�ϴ�Ĵ���,run�����еĹ��ܾ��Ǵ��̵߳Ĺ���
		 * �߳��ǹ��ܹ�ִ��,��������ִ�е�
		 * 
		 */
		for (int i = 0; i < 50; i++) {
			System.out.println(this.getName() + "HelloWorld" + i);
		}
	}
}
