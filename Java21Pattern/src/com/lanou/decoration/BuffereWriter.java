package com.lanou.decoration;
//װ����ģʽ�����ڲ��ı���Դ���Լ��̳й�ϵ��ǰ���£�Ϊһ������ӹ���
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
		System.out.println("��Ч����");
	}
	@Override
	public void write() {
		buffer();
		writer.write();
	}

}
