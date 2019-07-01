package aaaa;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class EverythingIsTrue {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InstantiationException, NoSuchFieldException, SecurityException {
		Entity e = new Entity();
		System.out.println("before: " + e.s);
		//通过反射拿到Entity中“s”字段
		Field f = Entity.class.getDeclaredField("s");
		//将字段的访问权限设为true：即去除private修饰符的影响 
		f.setAccessible(true);
		/*------------------去除final修饰符的影响，将字段设为可修改的-------------------*/
		
		//将Field字段类的modifiers变量设置为可访问，即除去Modifier的private影响。以便使用FINAL字段的int值
		Field modifiersField = Field.class.getDeclaredField("modifiers");
		modifiersField.setAccessible(true);
		modifiersField.setInt(f, f.getModifiers() & ~Modifier.FINAL);

		//设置e.s字段
		f.set(e, "新的数据");

		System.out.println("after: " + e.s);
	}
}


class Entity {
	public final String s = new String("旧的数据");
}