package com.lanou.code;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryTeacher {
	/*
	 	系统会随机生成四个1000~9999的数字，并且不重复
	 	用户手动输入一个四位数
	 	做匹配，如果用户的数在四个数中则中奖。
	 	
	 	登录、注册！
	 	1、注册
	 		注册过提示已经注册
	 			有没有登录
	 				如果登录了，摇奖
	 				未登录，登录
	 		未注册让用户去注册
	 			注册成功，让其登录
	 	2、登录
	 	3、摇奖
	 	4、退出
	 */
	static Scanner scanner = new Scanner(System.in);
	//用户名和密码
	static String username = "";
	static String password = "";
	//注册、登录状态
	static boolean isRegist = false;
	static boolean isLogin = false;
	
	public static void main(String[] args) {
		//摇奖系统的死循环
		while (true) {
			System.out.println("欢迎来到蓝鸥摇奖！");
			System.out.println("1注册\t 2登录\t 3摇奖\t 4退出\t");
			int num = scanner.nextInt();
			if (num == 4) {
				System.out.println("客观慢走，欢迎下次光临！");
				break;
			} else {
				//封装一个方法，来完成对注册、登录、摇奖的处理
				doSomething(num);
			}
		}
	}
	//注册方法
	public static void regist() {
		System.out.println("欢迎来到注册页面~");
		System.out.println("请输入您的用户名：");
		username = scanner.next();
		System.out.println("请输入您的密码：");
		password = scanner.next();
		System.out.println("注册成功！");
		isRegist = true;
		login();
	}
	//登录方法
	public static void login() {
		System.out.println("欢迎来到登录页面~");
		System.out.println("请输入您的用户名：");
		String uname = scanner.next();
		System.out.println("请输入您的密码：");
		String pwd = scanner.next();
		if (username.equals(uname) && password.equals(pwd)) {
			System.out.println("登录成功！");
			isLogin = true;
			shake();
		} else {
			System.out.println("登录失败！");
			login();
		}
	}
	//定义一个生成数组的方法
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
	//摇奖方法
	public static void shake() {
		System.out.println("欢迎来到摇奖页面~");
		int[] arr = createArr(1000, 9999, 4);
		System.out.println("请输入一个四位数：");
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
			System.out.println("幸运儿，你的人生即将走向巅峰~");
		} else {
			System.out.println("臭屌丝，继续努力吧~");
		}
	}
	
	public static void doSomething(int num) {
		switch (num) {
			case 1:
				//注册
				if (isRegist) {
					if (isLogin) {
						System.out.println("您已注册、登录过，请摇奖！");
						shake();
					} else {
						System.out.println("您已注册过，请登录");
						login();
					}
				} else {
					regist();
				}
				break;
			case 2:
				//登录
				if (isLogin) {
					System.out.println("您已登录过，请摇奖！");
					shake();
				} else {
					if (isRegist) {
						login();
					} else {
						System.out.println("您还没有注册，请先注册！");
						regist();
					}
				}
				break;
			case 3:
				//摇奖
				if (isLogin) {
					shake();
				} else {
					if (isRegist) {
						System.out.println("请先登录，再来摇奖！");
						login();
					} else {
						System.out.println("您还没有注册，请先注册！");
						regist();
					}
				}
				break;
			default:
				break;
		}
	}
}
