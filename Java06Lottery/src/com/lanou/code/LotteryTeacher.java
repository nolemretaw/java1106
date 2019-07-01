package com.lanou.code;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryTeacher {
	/*
	 	ϵͳ����������ĸ�1000~9999�����֣����Ҳ��ظ�
	 	�û��ֶ�����һ����λ��
	 	��ƥ�䣬����û��������ĸ��������н���
	 	
	 	��¼��ע�ᣡ
	 	1��ע��
	 		ע�����ʾ�Ѿ�ע��
	 			��û�е�¼
	 				�����¼�ˣ�ҡ��
	 				δ��¼����¼
	 		δע�����û�ȥע��
	 			ע��ɹ��������¼
	 	2����¼
	 	3��ҡ��
	 	4���˳�
	 */
	static Scanner scanner = new Scanner(System.in);
	//�û���������
	static String username = "";
	static String password = "";
	//ע�ᡢ��¼״̬
	static boolean isRegist = false;
	static boolean isLogin = false;
	
	public static void main(String[] args) {
		//ҡ��ϵͳ����ѭ��
		while (true) {
			System.out.println("��ӭ������Ÿҡ����");
			System.out.println("1ע��\t 2��¼\t 3ҡ��\t 4�˳�\t");
			int num = scanner.nextInt();
			if (num == 4) {
				System.out.println("�͹����ߣ���ӭ�´ι��٣�");
				break;
			} else {
				//��װһ������������ɶ�ע�ᡢ��¼��ҡ���Ĵ���
				doSomething(num);
			}
		}
	}
	//ע�᷽��
	public static void regist() {
		System.out.println("��ӭ����ע��ҳ��~");
		System.out.println("�����������û�����");
		username = scanner.next();
		System.out.println("�������������룺");
		password = scanner.next();
		System.out.println("ע��ɹ���");
		isRegist = true;
		login();
	}
	//��¼����
	public static void login() {
		System.out.println("��ӭ������¼ҳ��~");
		System.out.println("�����������û�����");
		String uname = scanner.next();
		System.out.println("�������������룺");
		String pwd = scanner.next();
		if (username.equals(uname) && password.equals(pwd)) {
			System.out.println("��¼�ɹ���");
			isLogin = true;
			shake();
		} else {
			System.out.println("��¼ʧ�ܣ�");
			login();
		}
	}
	//����һ����������ķ���
	public static int[] createArr(int min, int max, int count) {
		int[] arr = new int[count];
		int index = 0;
		while (arr[count - 1] == 0) {
			int num = (int)(Math.random() * (max - min + 1)) + min;
			boolean isRepeat = false;
			for (int i = 0; i < arr.length; i++) {
				if (num == arr[i]) {
					isRepeat = true;
					break;
				}
			}
			if (!isRepeat) {
				arr[index] = num;
				index++;
			}
		}
		return arr;
	}
	//ҡ������
	public static void shake() {
		System.out.println("��ӭ����ҡ��ҳ��~");
		int[] arr = createArr(1000, 9999, 4);
		System.out.println("������һ����λ����");
		int num = scanner.nextInt();
		System.out.println(Arrays.toString(arr));
		boolean isWin = false;
		for (int i : arr) {
			if (num == i) {
				isWin = true;
				break;
			}
		}
		if (isWin) {
			System.out.println("���˶�������������������۷�~");
		} else {
			System.out.println("���˿������Ŭ����~");
		}
	}
	
	public static void doSomething(int num) {
		switch (num) {
			case 1:
				//ע��
				if (isRegist) {
					if (isLogin) {
						System.out.println("����ע�ᡢ��¼������ҡ����");
						shake();
					} else {
						System.out.println("����ע��������¼");
						login();
					}
				} else {
					regist();
				}
				break;
			case 2:
				//��¼
				if (isLogin) {
					System.out.println("���ѵ�¼������ҡ����");
					shake();
				} else {
					if (isRegist) {
						login();
					} else {
						System.out.println("����û��ע�ᣬ����ע�ᣡ");
						regist();
					}
				}
				break;
			case 3:
				//ҡ��
				if (isLogin) {
					shake();
				} else {
					if (isRegist) {
						System.out.println("���ȵ�¼������ҡ����");
						login();
					} else {
						System.out.println("����û��ע�ᣬ����ע�ᣡ");
						regist();
					}
				}
				break;
			default:
				break;
		}
	}
}
