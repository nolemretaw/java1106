package day02;
/*
 	��������������
 */
public abstract class Weapon {
	//��������������
	private String name;
	
	//��������name���Ը�ֵ
	public Weapon(String name) {
		this.name = name;
	}
	/*
	 	�����Ĺ�������
	 		��Ϊ��ͬ�����Ĺ�����ʽ,�����˺�ֵ����ͬ,����Ӧ��д�ɳ��󷽷�
	 	@return ���ؾ������������Ĺ����˺�ֵ
	 */
	public abstract int attact();
	@Override
	public String toString() {
		return "Weapon [name=" + name + "]";
	}
	
}
