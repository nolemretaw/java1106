package com.lanou.homework_��Ϸ���;

import java.util.Scanner;
/*
 * ��ɫ������
 */
public class RoleFactory {

	//������ɫ�ķ���
		public static Role createRole() throws WrongRoleCheckedException{
			System.out.println("ѡ���ɫ: A.սʿ  B.��ʦ");
			String roleType = new Scanner(System.in).nextLine();
			if (roleType.equals(GlobalConst.ROLE_TYPE_SOLDIER)) {
				return new Soldier();
			} else if (roleType.equals(GlobalConst.ROLE_TYPE_MAGCIAN)) {
				return new Magcian();
			} else {//����ָ��
				throw new WrongRoleCheckedException("û�д˽�ɫ");			
			}

		}
}
