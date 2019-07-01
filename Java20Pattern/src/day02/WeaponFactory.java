package day02;

import java.util.Scanner;

/*
 	����������
 	�������ģʽ
 	��һְ��ԭ��
 */
public class WeaponFactory {
	
	//���������ķ���
	public static Weapon createWeapon() {
		System.out.println("��ѡ������1:��  2:��  3:������");
		int weaponType = new Scanner(System.in).nextInt();
		if (weaponType == GlobalConst.WEAPON_TYPE_KNIFE) {
			return new Knife();
		} else if (weaponType == GlobalConst.WEAPON_TYPE_SWORD) {
			return new Sword();
		} else if (weaponType == GlobalConst.WEAPON_TYPE_MACE) {
			return new Mace();
		} else {
			throw new WrongWeaponCheckedException("����������");
		}
			
			/*switch(weaponType) {
			case WEAPON_TYPE_KNIFE://��
				return new Knife();
			case 2://��
				return new Sword();
			case 3://������
				return new Mace();
			default://�����˴���ָ��
				throw new WrongWeaponCheckedException("����������");
				
			}*/
	}
}
