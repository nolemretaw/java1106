package com.lanou.teachHomework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * 一个线程不断地从控制台输入，另一个线程不断地将这些数据写入到文件
 * 
 * 生产者消费者模式：
 * 生产者：从控制台输入数据线程
 * 容器：内存中定义一个变量来接收数据
 * 消费者：将数据写出到文件的线程
 * */
public class 线程输入输出 {

	public static void main(String[] args) {
		//容器
		Ram ram = new Ram();
		//生产者
		ReadThread readThread = new ReadThread(ram);
		//消费者
		WriteThread writeThread = new WriteThread(ram);
		readThread.start();
		writeThread.start();
	}

}
/**生产者，读取数据的线程*/
class ReadThread extends Thread{
	private Ram ram;
	public ReadThread(Ram ram) {
		this.ram = ram;
	}
	//不断地读
	@Override
	public void run() {
		while (true) {
			ram.read();
		}
	}
}

/**容器：内存*/
class Ram{
	/**控制台输入流*/
	BufferedReader console;
	/**文件输出流*/
	PrintWriter out;
	/**读取到的一行数据*/
	String line;
	/**判断容器是否已满*/
	public boolean isFull;
	public Ram() {
		this.console = new BufferedReader(new InputStreamReader(System.in));
		try {
			this.out = new PrintWriter("test13.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	/**从控制台读取数据的方法*/
	public synchronized void read() {
		//1、判断容器是否已满，满了等待
		if (isFull) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//2、读取一行数据
		try {
			System.out.println("请输入：");
			line = console.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//3、修改标志位，表示容器已满
		isFull = true;
		//4、通知其他线程
		this.notify();
	}
	/**向文件写数据的方法*/
	public synchronized void write() {
		//判断容器是否已满，未满则等待
		if (!isFull) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//2、输出数据到文件
		out.println(line);
		out.flush();
	//3、修改标志位
		isFull = false;
		//4、通知其他线程
		this.notify();
	}
}
/**消费者：写出数据到文件的线程*/
class WriteThread extends Thread{
	private Ram ram;
	public WriteThread(Ram ram) {
		this.ram = ram;
	}
	//不断地写
	@Override
	public void run() {
		while(true){
			ram.write();
		}
	}
}