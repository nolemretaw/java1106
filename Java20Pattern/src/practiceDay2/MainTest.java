package practiceDay2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day02.WrongRoleCheckedException;
import day02.WrongWeaponCheckedException;

/**
 * ������
 * 1.���,���������ɫ
 * 2.��ӹ���,�������ɫ�˺���ֵ
 *
 */
public class MainTest {
	public static void main(String[] args) throws WrongRoleCheckedException  {
		//������������
		Weapon knife = new Knife();
		Weapon sword = new Sword();
		Weapon mace = new Mace();
		
		//��ѡ�����������ɫ���뼯����
		List<Role> roles = new ArrayList<>();
		//ѭ�����,���������ɫ���뼯��
		for (int i = 0; i < 5; i++) {
			//����һ����ɫ
			Role role = null;
			System.out.println("������AB������ɫ");
			String roleType = new Scanner(System.in).nextLine();
			//�ж��û�ѡ���ɫ����
			switch (roleType) {
			case "A"://ѡ����սʿ
				role = new Soldier();
				//����ָ��Ϊսʿѡ������
				System.out.println("��ѡ������1:��  2:��  3:������");
				int weaponType = new Scanner(System.in).nextInt();
				//�ж��û�ѡ������������
				switch (weaponType) {
				case 1://ѡ���˵�
					role.setWeapon(knife);
					break;
				case 2://ѡ���˽�
					role.setWeapon(sword);
					break;
				case 3://ѡ����������
					role.setWeapon(mace);
					break;

				default://�û������˴����ָ��
					//�׳��Զ��������ʱ�쳣
					throw new WrongWeaponCheckedException("����������");
				}
				break;
			case "B"://ѡ���˷�ʦ
				role = new Magicer();
				//����ָ��Ϊ��ʦѡ������
				System.out.println("��ѡ������1:��  2:��  3:������");
				int weaponType1 = new Scanner(System.in).nextInt();
				//�ж��û�ѡ������������
				switch (weaponType1) {
				case 1://ѡ���˵�
					role.setWeapon(knife);
					break;
				case 2://ѡ���˽�
					role.setWeapon(sword);
					break;
				case 3://ѡ����������
					role.setWeapon(mace);
					break;

				default://�û������˴����ָ��
					//�׳��Զ��������ʱ�쳣
					throw new WrongWeaponCheckedException("����������");
				}
				break;

			default://��������������ָ��
				//�׳��Զ���ı������쳣
				throw new WrongRoleCheckedException("��ɫ������");
			}
			
			//�������Ľ�ɫ��ӵ�������
			roles.add(role);
		}
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
