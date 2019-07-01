package com.lanou.teachHomework;
/**生产者消费者模式
 * 	主要用于解决线程在同步之后
 * 保证线程的执行先后顺序
 * */
public class 生产者消费者 {

	public static void main(String[] args) {
		// 容器，java有默认无参构造
		Container container = new Container();
		//生产者
		Producer producer = new Producer(container);
		//消费者
		Consumer consumer = new Consumer(container);
		//启动线程
		producer.start();
		consumer.start();
	}

}
//生产者:蓝鸥
class Producer extends Thread{
	private Container container;
	public Producer(Container container) {
		this.container = container;
	}
	//线程不断向容器中存数据
	@Override
	public void run() {
		int i =0;
		while (true) {
			container.put(i++);
		}
	}
}
//容器:人才市场
class Container{
	//姓名
	private String name;
	//性别
	private String gender;
	//判断容器是否已满
	private boolean isFull;
	/**往容器中存放数据
	 * 静态方法加锁:锁对象   类.class
	 * 实例方法加锁:锁对象是 this，也就是main()中构建的container对象
	 * put()和pop()共享同一把锁，两个方法就会同步执行
	 * */
	/**往容器中存放数据*/
	public synchronized void put(int i){
		//1、判断容器是否已满，如果满了就等待
		if (isFull) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//存放数据
		if (i%2==0) {
			this.name = "东东";
			this.gender = "男";
		}else {
			this.name = "花花";
			this.gender = "女";
		}
		//3、修改标志位，表示容器满了
		isFull = true;
		//4、通知其他具备相同锁(pop)的线程执行(取数据)
		this.notify();
	}
	/**从容器中取数据*/
	public synchronized void pop(){
		//1、判断容器是否已满，没有满则等待
		if (!isFull) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//2、取数据
		System.out.println(this.name+"/"+this.gender);
		//3、取完数据修改标志位，表示容器空了
		isFull = false;
		//4、通知其他具备相同锁(put)的线程执行(存数据)
		this.notify();
	}
}
//消费者:公司
class Consumer extends Thread{
	private Container container;
	public Consumer(Container container) {
		this.container = container;
	}
	//不断从容器取东西
	@Override
	public void run() {
		int i =0;
			while (true) {
				container.pop();
			}
		}
}