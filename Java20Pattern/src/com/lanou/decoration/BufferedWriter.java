package com.lanou.decoration;

/*
 	装饰者模式可以在不改变源码以及继承关系的前提下,为一个类添加功能!!!
 */
public class BufferedWriter extends Write {
	
	
	private Write write;
	public BufferedWriter() {
		// TODO Auto-generated constructor stub
	}
	public BufferedWriter(Write write) {
		this.write = write;
	}
	@Override
	public void write() {
		buffer();
		write.write();
		
	}
	public void buffer() {
		System.out.println("高效缓冲");
	}
}
