package com.lanou.runnable;
/*	ʵ���̵߳ĵڶ��ַ�ʽ:
 * �½���, ʵ��Runnable�ӿ�,��ʵ��run()����
 * ΪʲôҪ���м̳�ʵ�ֵĻ�����,��ӽӿ�ʵ�ֶ��߳�: ��Ϊ�̳��е��̳о���,��һ����̳��˷�Thread��,
 * ��ô��ʱ������޷�ʵ�ֶ��߳���
 * �ӿ��ṩʵ�ֶ��߳�,�����ڲ��ƻ��̳й�ϵ��ǰ����,ʵ�ֶ��߳�
 */
public class RunThead implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			/*	Thread����෽��currentThread()���Եõ���ǰ���̶߳���
			 */
			System.out.println(Thread.currentThread().getName() + "HelloWorld " + i);
		}
	}

}
