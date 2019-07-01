package com.lanou.excepton;

import javax.naming.spi.DirStateFactory.Result;

//�Զ��� �쳣��,��Ҫ�̳�Exception
class MyException extends Exception {
	String message; //�����쳣��Ϣ
	public MyException(String message) {
		this.message = message;
	}
	//���ش�����Ϣ�ķ����Ǽ̳еķ���
	@Override
	public String getMessage() {
		return message;
	}
}
public class DefineException {
	public static int test(int a, int b) throws MyException {
		if (b < 0) {
			//�׳��Զ����쳣
			throw new MyException("��������С��0");
		}
		System.out.println("����");
		return a / b;
	}
	public static void main(String[] args) {
		int a = 10, b = -1;
		int result = 0;
		try {
			result = test(a, b);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("�����쳣");
		}
		System.out.println(result);
	}
}
