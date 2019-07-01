package com.lanou.teachHomework;

public class ����ģʽ {
/**����ģʽ����һ������ֻ�������һ�������ṩ�����ʹ��
 * ����ʽ����
 * 	1���ص�:
 * 		�������Ҫ�������󣬵��÷���ʱ�Żṹ�������Ķ���
 * 		�൱���ӳٹ�������ʱ�������ʡ�ڴ�ռ�
 *	2��ȱ��:
 *		�ڶ��̸߲߳���������£����ܻ����̲߳���ȫ�����⣬�����������
 *	3�����:
 *		1>��ͬ������飬�ܱ�֤�̰߳�ȫ�����������̶߳���Ҫ�ȴ���ʱ�����ܻ��½�
 *		2>˫�ؼ����:��֤���������̲߳���Ҫ�ȴ�������ʱ������
 *			����ʱ�����ܣ��ܱ�֤:��ʡ�ڴ棬�̰߳�ȫ��ʱ�����ܸ�
 * ����ʽ����
 * 	1���ص�:
 * 		��������費��Ҫʹ�õ�������������������ʱ��
 * 		����ֱ�ӹ������󣬿��ܻ���ɿռ��˷�
 * 	2��ȱ��:
 * 		�����ʱ(Ҳ��ֻ������þ�̬���������빹������)������ֱ�ӹ�������
 * 		���ܻ���ɿռ��˷�
 * 	3�����:
 * 		ʹ�þ�̬�ڲ��࣬�ⲿ�����ʱ�����ṹ������ֻ�е��÷�����Ҫ��������ʱ��
 * 		�Ż���ؾ�̬�ڲ��࣬��ʼ����������
 * */
	public static void main(String[] args) {
		//����20���̻߳�ȡ����������
//		for (int i = 0; i < 20; i++) {
//			Thread t = new Thread(new GetInstanceTask());
//			t.start();
//		}
		Single.method();
	}
}
/*����ʽ����ģʽ*/
class Singletion{
	/**������˽�л�������������繹������*/
	private Singletion(){
		System.out.println("����");
	}
	
	/**��������Ķ���*/
	private static Singletion instance;
	
	/**������ṩһ�������ķ�������ȡ�����������*/
	public static Singletion getInstance(){
		/**ͬ�������:
		 * 	���д���鶼����������еȴ���Ȼ�������ȥ
		 * 	�ж�instance�Ƿ�Ϊnull
		 * 	��һ���������̻߳�˳�������ִ���жϣ�������һ�����󷵻أ�
		 * 	���Ǻ���������߳�Ҳ��ȴ���Ȼ��˳�������ͬ�������ִ���жϲ�����
		 * 	���������ʱ���ϵ��˷�
		 * 
		 * �������:
		 * 	˫�ؼ���� double checked �ټ�һ���ж�,
		 * 	Ϊ����������߳�ʡ���˵ȴ�ʱ�䣬��������ʱ������
		 * 	
		 * */
		if (instance == null) {
			synchronized (Singletion.class){
				if (instance == null) {
					instance = new Singletion();
				}	
			}
		}
		return instance;
	}
}
/**����ʽ����*/
class Single{
	/**������˽�л�*/
	private Single(){
		System.out.println("����ʵ��");
	}
	public static void method() {
		System.out.println("����method");
	}
	/**��������Ķ���*/
	static class SingleHolder{
	private static Single instance = new Single();
	}
	
	/**������ṩһ����������������ȡ�����������*/
	
	public static Single getInstance(){
		return SingleHolder.instance;
	}
}

/**��ȡ����������������*/
class GetInstanceTask implements Runnable{
	@Override
	public void run() {
//		Singletion instance = Singletion.getInstance();
//		System.out.println(instance);
		Single instance = Single.getInstance();
		System.out.println(instance);
	}
}