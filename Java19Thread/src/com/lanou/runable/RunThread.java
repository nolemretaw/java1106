package com.lanou.runable;

/*
 	ʵ���̵߳ĵڶ��ַ�ʽ
 		�½���,ʵ��Runnable�ӿ�,��ʵ��run()����
 	ΪʲôҪ���м̳�ʵ�ֵĻ�����,��ӽӿ�ʵ�ֶ��߳�
 	��Ϊ�̳��е��̳еľ�����,��һ����̳��˷�Thread��,��ô��ʱ������޷�ʵ�ֶ��߳���
 	�ṩ�ӿ�ʵ�ֶ��߳�,�����ڲ��ƻ��̳й�ϵ��ǰ����,ʵ�ֶ��߳�
 */
public class RunThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			/*
			 	Thread����෽��currentThread()���Եõ���ǰ���̶߳���
			 */
			System.out.println(Thread.currentThread().getName() + "HelloWorld" + i);
		}
		
	}

}
