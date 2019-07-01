package com.lanou.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * ����ע��Ӧ��
 * @Component �൱��������
 * <bean id="exampleBean" class="com.lanou.bean.ExampleBean"></bean>
 * */
//�Լ�ָ��bean�����id,Ĭ��id����������ĸСд
@Component("exam")

//��������ķ�Χ
@Scope("singleton")

//�ӳ�ʵ����
@Lazy(true)//�ӳ�ʵ���� true:�ӳ�ʵ���� false:���ӳ�
public class ExampleBean {
	public ExampleBean() {
		System.out.println("==������==");
	}
	
	@PostConstruct//����֮��
	public void init(){
		System.out.println("==��ʼ��==");
	} 
	
	@PreDestroy//����֮ǰ
	public void destroy(){
		System.out.println("==����==");
	}
}
