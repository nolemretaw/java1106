package com.lanou.homework_��Ϸ���;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
/*	�����ࣺ
 * 1�� ��ӣ����������ɫ
 * 2����ӹ���������ֵ
 * 	 ��һְ��
 */
	public static void main(String[] args) throws WrongRoleCheckedException {
		// ������������
		//��5����ɫ���뼯����
		List<Role> roles = makeTeam();
		int hurt = groupAtk(roles);
		System.out.println("���˺�Ϊ " + hurt);
	}
	//��ӹ�������
	private static int groupAtk(List<Role> roles) {
		//��������
		int hurt = 0;
		for (Role role : roles) {
			System.out.println(role);//println()�л����toString();
			hurt += role.getWeapon().attack();
		}
		return hurt;
	}
	//�������鷽��
	private static List<Role> makeTeam() throws WrongRoleCheckedException {
		List<Role> roles = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			//1.ͨ����ɫ��������һ����ɫ
			Role role = RoleFactory.createRole();
			//2.ͨ����������Ϊ�ý�ɫ��������
			Weapon weapon = WeaponFactory.createWeapon();
			//3.�������������ý�ɫ
			role.setWeapon(weapon);
			//4.����ɫ��ӵ�������
			roles.add(role);
		}
		return roles;
	}
	
	
	
	
}
