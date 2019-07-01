package com.lanou.homework_游戏组队;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
/*	启动类：
 * 1、 组队，创建五个角色
 * 2、组队攻击，求总值
 * 
 */
	public static void main(String[] args) throws WrongRoleCheckedException {
		// 创建三种武器
		Weapon knife = new Knife();
		Weapon sword = new Sword();
		Weapon mace = new Mace();
		//将5个角色放入集合中
		List<Role> roles = new ArrayList<Role>();
		for (int i = 0; i < 5; i++) {
			//定义一个角色
			Role role = null;
			System.out.println("选择第" + (i+1) + "位角色: A.战士  B.法师");
			String roleType = new Scanner(System.in).nextLine();
			
			switch (roleType) {//选角色
				case "A":role = new Soldier();
					System.out.println("请选择类型1.刀  2.剑   3.狼牙棒");
					int weapontype = new  Scanner(System.in).nextInt();
					switch (weapontype) {//选武器
						case 1:role.setWeapon(knife);							
							break;
							
						case 2:role.setWeapon(sword);							
						break;
						
						case 3:role.setWeapon(mace);							
						break;
						
						default://错误指令，抛异常
							throw new WrongWeaponCheckedException("武器不存在");
					}
					break;
					
				case "B":role = new Magcian();
					System.out.println("请选择类型1.刀  2.剑   3.狼牙棒");
					int weapontype1 = new  Scanner(System.in).nextInt();
					switch (weapontype1) {
						case 1:role.setWeapon(knife);							
							break;
							
						case 2:role.setWeapon(sword);							
						break;
						
						case 3:role.setWeapon(mace);							
						break;
						
						default://错误指令，抛异常
							throw new WrongWeaponCheckedException("武器不存在");
					}
					break;
				default:
					throw new WrongRoleCheckedException("没有这个角色");
			}
			//将创建的角色添加到集合中
			roles.add(role);
			
		}
		//遍历集合
		int hurt = 0;
		for (Role role : roles) {
			System.out.println(role);//println()中会调用toString();
			hurt += role.getWeapon().attack();
		}
		System.out.println(hurt);
	}

}
