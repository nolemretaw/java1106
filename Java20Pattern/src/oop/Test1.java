package oop;

import oop.Outer.Inner;
import oop.Outer.Inner2;

/**
 * 
	�ڲ���
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.name = "aa";
		//Inner inner = outer.new Inner();
		//ʵ���ڲ�����󹹽�
		Inner inner = new Outer().new Inner();
		
		//��̬�ڲ������Ĺ���
		Outer.age = 10;
		Inner2 inner2 = new Inner2();
		
		
		//�����ڲ���
		Father father = new Father(){
			@Override
			public void eat() {
				System.out.println("�Թ�ʺ");
			}
		};
		father.eat();
		
		new IA() {
			//�����ڲ���
			@Override
			public void m1() {
				System.out.println("aaaa");
			}	
		}.m1();;
		
	}
}

class Father {
	public void eat() {
		System.out.println("��ʺ");
	}
}
interface IA {
	void m1();
}
/*class aa implements IA {
	@Override
	public void m1() {
		
	}
}*/
/*class Child extends Father {
	@Override
	public void eat() {
		System.out.println("�Թ�ʺ");
	}
}*/

class Outer {
	//ʵ��������������
	String name;
	static int age;
	//ʵ���ڲ���(ʵ�����Ƕ���)
	class Inner {
		private void say() {

		}
	}
	//��̬�ڲ���
	static class Inner2 {
		
	}
	//�ֲ��ڲ���
	public void m1() {
		String msg;
		class Inner3 {
			
		}
		Inner3 inner3 = new Inner3();
	}
}