package com.lanou.homework_��Ϸ���;

import java.util.Scanner;

/*����������
 *��һְ��ԭ��
 *�������ģʽ 
 */
public class WeaponFactory {
	
	//������������
		public static Weapon createWeapon(){
			System.out.println("��ѡ������1.��  2.��   3.������");
			int weaponType = new Scanner(System.in).nextInt();
			if (weaponType == GlobalConst.WEAPON_TYPE_KNIFE) {
				return new Knife();
			}else if (weaponType == GlobalConst.WEAPON_TYPE_SWORD) {
				return new Sword();
			}else if (weaponType == GlobalConst.WEAPON_TYPE_MACE) {
				return new Mace();
			}else {//����ָ����쳣
				throw new WrongWeaponCheckedException("����������");
			}
		}
}
