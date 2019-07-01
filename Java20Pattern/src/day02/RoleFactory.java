package day02;

import java.util.Scanner;

/*
 	角色工厂类
 */
public class RoleFactory {
	
	//创建角色的方法
		public static Role createRole() throws WrongRoleCheckedException {
			System.out.println("请输入AB创建角色");
			String roleType = new Scanner(System.in).nextLine();
			if (roleType.equals(GlobalConst.ROLE_TYPE_SOLDIER)) {
				return new Soldier();
			} else if (roleType.equals(GlobalConst.ROLE_TYPE_MAGICER)) {
				return new Magicer();
			} else {
				throw new WrongRoleCheckedException("不存在的角色");
			}
			/*switch (roleType) {
			case "A"://战士
				return new Soldier();
			case "B"://法师
				return new Magicer();

			default://错误的指令
				throw new WrongRoleCheckedException("角色不存在");
			}*/
		}
}
