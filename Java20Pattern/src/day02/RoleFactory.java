package day02;

import java.util.Scanner;

/*
 	��ɫ������
 */
public class RoleFactory {
	
	//������ɫ�ķ���
		public static Role createRole() throws WrongRoleCheckedException {
			System.out.println("������AB������ɫ");
			String roleType = new Scanner(System.in).nextLine();
			if (roleType.equals(GlobalConst.ROLE_TYPE_SOLDIER)) {
				return new Soldier();
			} else if (roleType.equals(GlobalConst.ROLE_TYPE_MAGICER)) {
				return new Magicer();
			} else {
				throw new WrongRoleCheckedException("�����ڵĽ�ɫ");
			}
			/*switch (roleType) {
			case "A"://սʿ
				return new Soldier();
			case "B"://��ʦ
				return new Magicer();

			default://�����ָ��
				throw new WrongRoleCheckedException("��ɫ������");
			}*/
		}
}
