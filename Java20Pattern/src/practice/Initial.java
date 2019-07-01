package practice;

import java.util.Scanner;

public class Initial {
	public static void main(String[] args) {
		int sum = 0;//攻击力
		int sums = 0;//总攻击力
		for (int i = 1; i < 6; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入创建角色A.战士  B.魔法师");
			String Roble = scanner.next();
			if (Roble.equals("A")) {
				System.out.println("创建战士");
				Role role = new Warrior();
				System.out.println("战士创建成功");
				System.out.println("请选择武器1.刀  2.剑  3.狼牙棒");
				String weapon = scanner.next();
				if (weapon.equals("1")) {
					System.out.println("战士" + i + "选择武器:刀");
					sum = new Knife().getAttack();
					System.out.println("攻击力" + sum);
					sums = sum + sums;
					
				} else if (weapon.equals("2")) {
					System.out.println("战士" + i + "选择武器:剑");
					sum = new Sword().getAttack();
					System.out.println("攻击力" + sum);
					sums = sum + sums;
					
				} else {
					System.out.println("战士" + i + "选择武器:狼牙棒");
					sum = new Stick().getAttack();
					System.out.println("攻击力" + sum);
					sums = sum + sums;
				}
			} else {
				System.out.println("创建魔法师");
				Role role = new Enchanter();
				System.out.println("魔法师创建成功");System.out.println("请选择武器1.刀  2.剑  3.狼牙棒");
				String weapon = scanner.next();
				if (weapon.equals("1")) {
					System.out.println("魔法师" + i + "选择武器:刀");
					sum = new Knife().getAttack();
					System.out.println("攻击力" + sum);
					sums = sum + sums;
					
				} else if (weapon.equals("2")) {
					System.out.println("魔法师" + i + "选择武器:剑");
					sum = new Sword().getAttack();
					System.out.println("攻击力" + sum);
					sums = sum + sums;
					
				} else {
					System.out.println("魔法师" + i + "选择武器:狼牙棒");
					sum = new Stick().getAttack();
					System.out.println("攻击力" + sum);
					sums = sum + sums;
					
				}
			}
			if (i == 5) {
				System.out.println("队伍创建完毕,开始攻击");
			}
		}
		
		System.out.println("总攻击力 = " + sums);
	}
}
