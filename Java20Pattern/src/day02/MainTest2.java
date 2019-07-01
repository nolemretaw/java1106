package day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 启动类
 * 1.组队,创建五个角色
 * 2.组队攻击,求五个角色伤害总值
 * 	单一职责
 *
 */
public class MainTest2 {
	public static void main(String[] args) throws WrongRoleCheckedException {
		List<Role> roles = group();
		groupAttack(roles);
	}

	private static List<Role> group() throws WrongRoleCheckedException {
		//将选出来的五个角色放入集合中
		List<Role> roles = new ArrayList<>();
		//循环五次,创建五个角色放入集合
		for (int i = 0; i < 5; i++) {
			//1.通过角色工厂创建一个角色
			Role role = RoleFactory.createRole();
			//2.通过武器工厂创建为该角色创建一个武器
			Weapon weapon = WeaponFactory.createWeapon();
			//3.将该武器赋给创建的角色
			role.setWeapon(weapon);
			//4.将角色添加进集合中
			roles.add(role);
		}
		return roles;
	}

	//组队攻击的方法
	private static void groupAttack(List<Role> roles) {
		//遍历集合,看角色是否添加进来
		int hurt = 0;
		for (Role role : roles) {
			System.out.println(role);
			//多态的应用
			hurt += role.getWeapon().attact();
		}
		System.out.println("伤害总值:" + hurt);
	}	
}
