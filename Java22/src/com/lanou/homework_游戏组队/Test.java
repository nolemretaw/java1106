package com.lanou.homework_��Ϸ���;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
/*	�����ࣺ
 * 1�� ��ӣ����������ɫ
 * 2����ӹ���������ֵ
 * 
 */
	public static void main(String[] args) throws WrongRoleCheckedException {
		// ������������
		Weapon knife = new Knife();
		Weapon sword = new Sword();
		Weapon mace = new Mace();
		//��5����ɫ���뼯����
		List<Role> roles = new ArrayList<Role>();
		for (int i = 0; i < 5; i++) {
			//����һ����ɫ
			Role role = null;
			System.out.println("ѡ���" + (i+1) + "λ��ɫ: A.սʿ  B.��ʦ");
			String roleType = new Scanner(System.in).nextLine();
			
			switch (roleType) {//ѡ��ɫ
				case "A":role = new Soldier();
					System.out.println("��ѡ������1.��  2.��   3.������");
					int weapontype = new  Scanner(System.in).nextInt();
					switch (weapontype) {//ѡ����
						case 1:role.setWeapon(knife);							
							break;
							
						case 2:role.setWeapon(sword);							
						break;
						
						case 3:role.setWeapon(mace);							
						break;
						
						default://����ָ����쳣
							throw new WrongWeaponCheckedException("����������");
					}
					break;
					
				case "B":role = new Magcian();
					System.out.println("��ѡ������1.��  2.��   3.������");
					int weapontype1 = new  Scanner(System.in).nextInt();
					switch (weapontype1) {
						case 1:role.setWeapon(knife);							
							break;
							
						case 2:role.setWeapon(sword);							
						break;
						
						case 3:role.setWeapon(mace);							
						break;
						
						default://����ָ����쳣
							throw new WrongWeaponCheckedException("����������");
					}
					break;
				default:
					throw new WrongRoleCheckedException("û�������ɫ");
			}
			//�������Ľ�ɫ��ӵ�������
			roles.add(role);
			
		}
		//��������
		int hurt = 0;
		for (Role role : roles) {
			System.out.println(role);//println()�л����toString();
			hurt += role.getWeapon().attack();
		}
		System.out.println(hurt);
	}

}
