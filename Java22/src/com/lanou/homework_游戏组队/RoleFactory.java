package com.lanou.homework_游戏组队;

import java.util.Scanner;
/*
 * 角色工厂类
 */
public class RoleFactory {

	//创建角色的方法
		public static Role createRole() throws WrongRoleCheckedException{
			System.out.println("选择角色: A.战士  B.法师");
			String roleType = new Scanner(System.in).nextLine();
			if (roleType.equals(GlobalConst.ROLE_TYPE_SOLDIER)) {
				return new Soldier();
			} else if (roleType.equals(GlobalConst.ROLE_TYPE_MAGCIAN)) {
				return new Magcian();
			} else {//错误指令
				throw new WrongRoleCheckedException("没有此角色");			
			}

		}
}
