package oop;

import oop.Outer.Inner;

/**
 * �ڲ���
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		o.name = "aa";
		//ʵ���ڲ�����󹹽�
		Inner i = new Outer().new Inner();
		//��̬�ڲ������Ĺ���
		Outer.age = 10;
		Outer.Inner2 i2 = new Outer.Inner2();
		Father f = new Father(){//���̳У������ڲ���
			@Override
			public void eat() {
			System.out.println("��������");
			}
		};
		f.eat();
		
		new IA(){//���̳У������ڲ���
			@Override
			public void m1() {
				System.out.println("addidas");
			}		
		}.m1();//ʡ��������
	}
	
}

class Father{
	public void eat() {
		System.out.println("��������");
	}
}

interface IA{
		void m1();
}

/*class AA implements IA{
	@Override
	public void m1() {
		
	}
}
*/

/*class Child extends Father{
	@Override
	public void eat() {
	System.out.println("��������");
	}
}
*/

class Outer{
	String name;
	static int age;
	/** ʵ���ڲ���*/
	class Inner{
		public void say(){}
	}
	/**��̬�ڲ���*/
	static class Inner2{
		
	}
	/**�ֲ��ڲ���*/
	public void m1() {
		String mSg;
		class Inner3{
			
		}
		Inner3 i3 = new Inner3();
	}

}