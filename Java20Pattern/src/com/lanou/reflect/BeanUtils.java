package com.lanou.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class BeanUtils {
	/*
	 	ͨ�������ȡһ�����еķ���
	 */
	public static void getClassMethod(Object obj) {
		//Ҫ��ȡ����ڲ���Ϣ,����Ҫ��ȡ���������(�������)
		/*
		 	���ݵ����ĸ�����Ķ���,c����������������
		 */
		Class c = obj.getClass();
		//1.��ȡ���������
		System.out.println("�����������" + c.getSimpleName());
		/*
		 	Method��,��ʾ���Ƿ�������
		 	һ����Ա��������һ��Method����
		 	getMethods()������ȡ��������public���εķ���,��������̳е�
		 	getDeclaredMethods()������ȡ���Ǹ��������з���,���ʷ������η�
		 */
		Method[] methods = c.getMethods();
		//����
		for (Method method : methods) {
			//�Ȼ�ȡ�����ķ���ֵ����
			Class returnType = method.getReturnType();
			System.out.print(returnType.getSimpleName() + " ");
			//��ȡ������
			System.out.print(method.getName() + "(");
			//��ȡ��������
			Class[] parameterTypes = method.getParameterTypes();
			for (Class c1 : parameterTypes) {
				System.out.print(c.getSimpleName() + ",");
			}
			System.out.println(") {}");
		}
	}
	
	
	//��ȡ���еĳ�Ա����
	public static void getClassProperty(Object obj) {
		Class c = obj.getClass();
		/*
		 	Field ������ʾ��Ա�����Ķ���
		 	java.lang.reflect.Field
		 	Field���װ�˹��ڳ�Ա�����Ĳ���
		 	getFields()��ȡ����������public�ĳ�Ա��������Ϣ
		 	getDeclaredFields()��ȡ�����Ǹ��������еĳ�Ա������Ϣ
		 */
		//Field[] fields = c.getFields();
		Field[] fields = c.getDeclaredFields();
		for (Field field : fields) {
			//��ȡ��Ա����������
			Class type = field.getType();
			System.out.print(type.getName() + " ");
			//��ȡ��Ա����������
			System.out.println(field.getName());
		}
	}
	
	//��ȡһ�����еĹ��췽��
	public static void getClassConstructor(Object obj) {
		Class c = obj.getClass();
		/*
		 	���췽��Ҳ�Ƕ���
		 	java.lang.Constructor�з�װ�˹��췽������Ϣ
		 	getConstructors()��������õ���public ���εĹ��췽��
		 	getDeclaredConstructors()��������õ��������еĹ��췽��
		 */
		Constructor[] constructors = c.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			//��ȡ���췽����
			System.out.print(constructor.getName() + "(");
			//��ȡ���췽���Ĳ����б�
			Class[] parameterTypes = constructor.getParameterTypes();
			for (int i = 0; i < parameterTypes.length; i++) {
				if (i == parameterTypes.length - 1) {
					System.out.println(parameterTypes[i].getSimpleName() + ")");
				} else {
					System.out.print(parameterTypes[i].getSimpleName() + ",");
				}
			}
		}
	}
}
