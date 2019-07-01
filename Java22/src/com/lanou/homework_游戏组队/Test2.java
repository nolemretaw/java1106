package com.lanou.homework_游戏组队;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
/*	启动类：
 * 1、 组队，创建五个角色
 * 2、组队攻击，求总值
 * 	 单一职责
 */
	public static void main(String[] args) throws WrongRoleCheckedException {
		// 创建三种武器
		//将5个角色放入集合中
		List<Role> roles = makeTeam();
		int hurt = groupAtk(roles);
		System.out.println("总伤害为 " + hurt);
	}
	//组队攻击方法
	private static int groupAtk(List<Role> roles) {
		//遍历集合
		int hurt = 0;
		for (Role role : roles) {
			System.out.println(role);//println()中会调用toString();
			hurt += role.getWeapon().attack();
		}
		return hurt;
	}
	//创建队伍方法
	private static List<Role> makeTeam() throws WrongRoleCheckedException {
		List<Role> roles = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			//1.通过角色工厂创建一个角色
			Role role = RoleFactory.createRole();
			//2.通过武器工厂为该角色创建武器
			Weapon weapon = WeaponFactory.createWeapon();
			//3.将该武器付给该角色
			role.setWeapon(weapon);
			//4.将角色添加到集合中
			roles.add(role);
		}
		return roles;
	}
	
	
	
	
}
