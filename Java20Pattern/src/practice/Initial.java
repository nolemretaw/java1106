package practice;

import java.util.Scanner;

public class Initial {
	public static void main(String[] args) {
		int sum = 0;//������
		int sums = 0;//�ܹ�����
		for (int i = 1; i < 6; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("�����봴����ɫA.սʿ  B.ħ��ʦ");
			String Roble = scanner.next();
			if (Roble.equals("A")) {
				System.out.println("����սʿ");
				Role role = new Warrior();
				System.out.println("սʿ�����ɹ�");
				System.out.println("��ѡ������1.��  2.��  3.������");
				String weapon = scanner.next();
				if (weapon.equals("1")) {
					System.out.println("սʿ" + i + "ѡ������:��");
					sum = new Knife().getAttack();
					System.out.println("������" + sum);
					sums = sum + sums;
					
				} else if (weapon.equals("2")) {
					System.out.println("սʿ" + i + "ѡ������:��");
					sum = new Sword().getAttack();
					System.out.println("������" + sum);
					sums = sum + sums;
					
				} else {
					System.out.println("սʿ" + i + "ѡ������:������");
					sum = new Stick().getAttack();
					System.out.println("������" + sum);
					sums = sum + sums;
				}
			} else {
				System.out.println("����ħ��ʦ");
				Role role = new Enchanter();
				System.out.println("ħ��ʦ�����ɹ�");System.out.println("��ѡ������1.��  2.��  3.������");
				String weapon = scanner.next();
				if (weapon.equals("1")) {
					System.out.println("ħ��ʦ" + i + "ѡ������:��");
					sum = new Knife().getAttack();
					System.out.println("������" + sum);
					sums = sum + sums;
					
				} else if (weapon.equals("2")) {
					System.out.println("ħ��ʦ" + i + "ѡ������:��");
					sum = new Sword().getAttack();
					System.out.println("������" + sum);
					sums = sum + sums;
					
				} else {
					System.out.println("ħ��ʦ" + i + "ѡ������:������");
					sum = new Stick().getAttack();
					System.out.println("������" + sum);
					sums = sum + sums;
					
				}
			}
			if (i == 5) {
				System.out.println("���鴴�����,��ʼ����");
			}
		}
		
		System.out.println("�ܹ����� = " + sums);
	}
}
