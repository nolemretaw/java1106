package com.lanou.decoration;

/*
 	װ����ģʽ�����ڲ��ı�Դ���Լ��̳й�ϵ��ǰ����,Ϊһ������ӹ���!!!
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
		System.out.println("��Ч����");
	}
}
