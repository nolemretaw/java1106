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
						//wait()方法是object类的
						/*
						 * 当前对象为数据共享,谁此时占用了数据共享,挂起的就是该条线程
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
				System.out.println(fruit.getBrand() + "被买走了");
				fruit.setExist(false);
				fruit.notify();
			}
			
		}
		
	}
}
