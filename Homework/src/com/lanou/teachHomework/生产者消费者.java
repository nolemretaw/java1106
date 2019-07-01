package com.lanou.teachHomework;
/**������������ģʽ
 * 	��Ҫ���ڽ���߳���ͬ��֮��
 * ��֤�̵߳�ִ���Ⱥ�˳��
 * */
public class ������������ {

	public static void main(String[] args) {
		// ������java��Ĭ���޲ι���
		Container container = new Container();
		//������
		Producer producer = new Producer(container);
		//������
		Consumer consumer = new Consumer(container);
		//�����߳�
		producer.start();
		consumer.start();
	}

}
//������:��Ÿ
class Producer extends Thread{
	private Container container;
	public Producer(Container container) {
		this.container = container;
	}
	//�̲߳����������д�����
	@Override
	public void run() {
		int i =0;
		while (true) {
			container.put(i++);
		}
	}
}
//����:�˲��г�
class Container{
	//����
	private String name;
	//�Ա�
	private String gender;
	//�ж������Ƿ�����
	private boolean isFull;
	/**�������д������
	 * ��̬��������:������   ��.class
	 * ʵ����������:�������� this��Ҳ����main()�й�����container����
	 * put()��pop()����ͬһ���������������ͻ�ͬ��ִ��
	 * */
	/**�������д������*/
	public synchronized void put(int i){
		//1���ж������Ƿ�������������˾͵ȴ�
		if (isFull) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//�������
		if (i%2==0) {
			this.name = "����";
			this.gender = "��";
		}else {
			this.name = "����";
			this.gender = "Ů";
		}
		//3���޸ı�־λ����ʾ��������
		isFull = true;
		//4��֪ͨ�����߱���ͬ��(pop)���߳�ִ��(ȡ����)
		this.notify();
	}
	/**��������ȡ����*/
	public synchronized void pop(){
		//1���ж������Ƿ�������û������ȴ�
		if (!isFull) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//2��ȡ����
		System.out.println(this.name+"/"+this.gender);
		//3��ȡ�������޸ı�־λ����ʾ��������
		isFull = false;
		//4��֪ͨ�����߱���ͬ��(put)���߳�ִ��(������)
		this.notify();
	}
}
//������:��˾
class Consumer extends Thread{
	private Container container;
	public Consumer(Container container) {
		this.container = container;
	}
	//���ϴ�����ȡ����
	@Override
	public void run() {
		int i =0;
			while (true) {
				container.pop();
			}
		}
}