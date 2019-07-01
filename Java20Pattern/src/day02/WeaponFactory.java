package day02;

import java.util.Scanner;

/*
 	武器工厂类
 	工厂设计模式
 	单一职责原则
 */
public class WeaponFactory {
	
	//创建武器的方法
	public static Weapon createWeapon() {
		System.out.println("请选择武器1:刀  2:剑  3:狼牙棒");
		int weaponType = new Scanner(System.in).nextInt();
		if (weaponType == GlobalConst.WEAPON_TYPE_KNIFE) {
			return new Knife();
		} else if (weaponType == GlobalConst.WEAPON_TYPE_SWORD) {
			return new Sword();
		} else if (weaponType == GlobalConst.WEAPON_TYPE_MACE) {
			return new Mace();
		} else {
			throw new WrongWeaponCheckedException("武器不存在");
		}
			
			/*switch(weaponType) {
			case WEAPON_TYPE_KNIFE://刀
				return new Knife();
			case 2://剑
				return new Sword();
			case 3://狼牙棒
				return new Mace();
			default://输入了错误指令
				throw new WrongWeaponCheckedException("武器不存在");
				
			}*/
	}
}
