package day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ������
 * 1.���,���������ɫ
 * 2.��ӹ���,�������ɫ�˺���ֵ
 * 	��һְ��
 *
 */
public class MainTest2 {
	public static void main(String[] args) throws WrongRoleCheckedException {
		List<Role> roles = group();
		groupAttack(roles);
	}

	private static List<Role> group() throws WrongRoleCheckedException {
		//��ѡ�����������ɫ���뼯����
		List<Role> roles = new ArrayList<>();
		//ѭ�����,���������ɫ���뼯��
		for (int i = 0; i < 5; i++) {
			//1.ͨ����ɫ��������һ����ɫ
			Role role = RoleFactory.createRole();
			//2.ͨ��������������Ϊ�ý�ɫ����һ������
			Weapon weapon = WeaponFactory.createWeapon();
			//3.�����������������Ľ�ɫ
			role.setWeapon(weapon);
			//4.����ɫ��ӽ�������
			roles.add(role);
		}
		return roles;
	}

	//��ӹ����ķ���
	private static void groupAttack(List<Role> roles) {
		//��������,����ɫ�Ƿ���ӽ���
		int hurt = 0;
		for (Role role : roles) {
			System.out.println(role);
			//��̬��Ӧ��
			hurt += role.getWeapon().attact();
		}
		System.out.println("�˺���ֵ:" + hurt);
	}	
}
