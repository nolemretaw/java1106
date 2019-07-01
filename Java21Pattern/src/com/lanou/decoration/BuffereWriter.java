package com.lanou.decoration;
//装饰者模式可以在不改变类源码以及继承关系的前提下，为一个类添加功能
public class BuffereWriter extends Writer{
	private Writer writer;
	public BuffereWriter() {
		// TODO Auto-generated constructor stub
	}
	public BuffereWriter(Writer writer) {
		super();
		this.writer = writer;
	}
	
	public void buffer() {
		System.out.println("高效缓冲");
	}
	@Override
	public void write() {
		buffer();
		writer.write();
	}

}
