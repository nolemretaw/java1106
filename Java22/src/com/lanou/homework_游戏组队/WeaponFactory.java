package com.lanou.homework_游戏组队;

import java.util.Scanner;

/*武器工厂类
 *单一职责原则
 *工厂设计模式 
 */
public class WeaponFactory {
	
	//创建武器方法
		public static Weapon createWeapon(){
			System.out.println("请选择类型1.刀  2.剑   3.狼牙棒");
			int weaponType = new Scanner(System.in).nextInt();
			if (weaponType == GlobalConst.WEAPON_TYPE_KNIFE) {
				return new Knife();
			}else if (weaponType == GlobalConst.WEAPON_TYPE_SWORD) {
				return new Sword();
			}else if (weaponType == GlobalConst.WEAPON_TYPE_MACE) {
				return new Mace();
			}else {//错误指令，抛异常
				throw new WrongWeaponCheckedException("武器不存在");
			}
		}
}
