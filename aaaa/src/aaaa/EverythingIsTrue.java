package aaaa;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class EverythingIsTrue {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InstantiationException, NoSuchFieldException, SecurityException {
		Entity e = new Entity();
		System.out.println("before: " + e.s);
		//ͨ�������õ�Entity�С�s���ֶ�
		Field f = Entity.class.getDeclaredField("s");
		//���ֶεķ���Ȩ����Ϊtrue����ȥ��private���η���Ӱ�� 
		f.setAccessible(true);
		/*------------------ȥ��final���η���Ӱ�죬���ֶ���Ϊ���޸ĵ�-------------------*/
		
		//��Field�ֶ����modifiers��������Ϊ�ɷ��ʣ�����ȥModifier��privateӰ�졣�Ա�ʹ��FINAL�ֶε�intֵ
		Field modifiersField = Field.class.getDeclaredField("modifiers");
		modifiersField.setAccessible(true);
		modifiersField.setInt(f, f.getModifiers() & ~Modifier.FINAL);

		//����e.s�ֶ�
		f.set(e, "�µ�����");

		System.out.println("after: " + e.s);
	}
}


class Entity {
	public final String s = new String("�ɵ�����");
}