package com.lanou.code;

public class SwitchDemo {

	public static void main(String[] args) {
		/*1 . switch()�����ڷŵı���������ֻ����byte short int char String Enumö��(������)
		 * 2. case���������ֵһ��Ҫ��switch���Ƶı�����������ͬ
		 * 3. case����е�break����ʡ��,ʡ�Ի�᳹case,ֱ��switch����
		 * 4. ������е�case��û��ƥ��,���ִ��defaul����
		 */
		String season = "spring";
		switch (season) {
			case "spring":
				System.out.println("�ŷ���");
				break;
			case "summer":
				System.out.println("��Ӿ");
				break;
			case "automn":
				System.out.println("�Ի��");
				break;
			case "winter":
				System.out.println("��ѩ��");
				break;
//			default:		
		}
	}

}
