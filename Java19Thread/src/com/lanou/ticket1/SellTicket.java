package com.lanou.ticket1;

public class SellTicket implements Runnable {
	
	
	//������Ʊ
	/*����������ֵ�����:
	 * �������ǹ�����Դ,���ҶԹ�����Դ�������޸�,����߳̿���ͬʱ����
	 */
	private int tickets = 100;
	//����������
	private static Object object = new Object();
	public void run() {	
		while (true) {
			synchronized (object) {
				/*ͬ�����﷨��ʽ:
				 * synchronized(����������) {
				 * 		������������Ĵ���
				 * } 
				 * ע��: 
				 * ������������κζ���,��ͨ�������ΪObject!
				 * ����������ǹ������
				 * �߳�һ�����ᵽ��Դ,��ӵ������,�����Ĵ��벻����ڶ����̷߳���. 
				 * ִ����֮��,�Ż��ó�������,����������Դ
				*/
				/*synchronized�ǿ������η�����
				 * ����Ǿ�̬����,Ĭ���������ǵ�ǰ��������SellTicket.class,�̳���ʵ�ֽӿ�
	 		 		����������
	 			 * ����ǷǾ�̬������Ĭ����������ǵ�ǰ��Ķ��� this ǰ����ʵ�ֽӿ�
				 */
				if (tickets > 0) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "��������" + tickets-- + "��Ʊ" );
				}else {
					System.out.println("����");
					break;
				}
			}
		}	
	}
}
