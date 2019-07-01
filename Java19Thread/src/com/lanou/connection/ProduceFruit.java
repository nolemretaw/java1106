package com.lanou.connection;

public class ProduceFruit extends Thread{
	private Fruit fruit;
	
	public ProduceFruit() {
		// TODO Auto-generated constructor stub
	}
	public ProduceFruit(Fruit fruit) {
		this.fruit = fruit; 
	}
	@Override
	public void run() {
		while (true) {
			synchronized (fruit) {
				if (fruit.isExist()) {
					try {
						fruit.wait();
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
				System.out.println(fruit.getBrand() + "被生产了");
				fruit.setExist(true);
				fruit.notify();
			}
		}
	}
}
