package com.lanou.connection;

public class BuyFruit extends Thread{
	private Fruit fruit;
	public BuyFruit() {
		// TODO Auto-generated constructor stub
	}
	public BuyFruit(Fruit fruit) {
		this.fruit = fruit; 
	}
	@Override
	public void run() {
		while (true) {
			synchronized (fruit) {
				if (!fruit.isExist()) {
					try {
						fruit.wait();
						//wait()������object���
						/*
						 * ��ǰ����Ϊ���ݹ���,˭��ʱռ�������ݹ���,����ľ��Ǹ����߳�
						 */
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}			
				}
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(fruit.getBrand() + "��������");
				fruit.setExist(false);
				fruit.notify();
			}
			
		}
		
	}
}
