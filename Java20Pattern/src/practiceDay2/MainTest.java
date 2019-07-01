package practiceDay2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day02.WrongRoleCheckedException;
import day02.WrongWeaponCheckedException;

/**
 * 启动类
 * 1.组队,创建五个角色
 * 2.组队攻击,求五个角色伤害总值
 *
 */
public class MainTest {
	public static void main(String[] args) throws WrongRoleCheckedException  {
		//创建三种武器
		Weapon knife = new Knife();
		Weapon sword = new Sword();
		Weapon mace = new Mace();
		
		//将选出来的五个角色放入集合中
		List<Role> roles = new ArrayList<>();
		//循环五次,创建五个角色放入集合
		for (int i = 0; i < 5; i++) {
			//定义一个角色
			Role role = null;
			System.out.println("请输入AB创建角色");
			String roleType = new Scanner(System.in).nextLine();
			//判断用户选择角色类型
			switch (roleType) {
			case "A"://选择了战士
				role = new Soldier();
				//输入指令为战士选择武器
				System.out.println("请选择武器1:刀  2:剑  3:狼牙棒");
				int weaponType = new Scanner(System.in).nextInt();
				//判断用户选择武器的类型
				switch (weaponType) {
				case 1://选择了刀
					role.setWeapon(knife);
					break;
				case 2://选择了剑
					role.setWeapon(sword);
					break;
				case 3://选择了狼牙棒
					role.setWeapon(mace);
					break;

				default://用户输入了错误的指令
					//抛出自定义的运行时异常
					throw new WrongWeaponCheckedException("武器不存在");
				}
				break;
			case "B"://选择了法师
				role = new Magicer();
				//输入指令为法师选择武器
				System.out.println("请选择武器1:刀  2:剑  3:狼牙棒");
				int weaponType1 = new Scanner(System.in).nextInt();
				//判断用户选择武器的类型
				switch (weaponType1) {
				case 1://选择了刀
					role.setWeapon(knife);
					break;
				case 2://选择了剑
					role.setWeapon(sword);
					break;
				case 3://选择了狼牙棒
					role.setWeapon(mace);
					break;

				default://用户输入了错误的指令
					//抛出自定义的运行时异常
					throw new WrongWeaponCheckedException("武器不存在");
				}
				break;

			default://输入了其他错误指令
				//抛出自定义的编译期异常
				throw new WrongRoleCheckedException("角色不存在");
			}
			
			//将创建的角色添加到集合中
			roles.add(role);
		}
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
