package com.lanou.ticket;

public class SellTicket extends Thread {
	public SellTicket() {
		// TODO Auto-generated constructor stub
	}
	
	public SellTicket(String name) {
		super(name);
	}
	
	//������Ʊ
	/*����������ֵ�����:
	 * �������ǹ�����Դ,���ҶԹ�����Դ�������޸�,����߳̿���ͬʱ����
	 */
	private static int tickets = 100;
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
				if (tickets > 0) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(this.getName() + "��������" + tickets-- + "��Ʊ" );
				}else {
					System.out.println("����");
					break;
				}
			}
		}	
	}
}
