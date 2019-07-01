package com.lanou.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 测试注解应用
 * @Component 相当于配置了
 * <bean id="exampleBean" class="com.lanou.bean.ExampleBean"></bean>
 * */
//自己指定bean组件的id,默认id是类名首字母小写
@Component("exam")

//控制组件的范围
@Scope("singleton")

//延迟实例化
@Lazy(true)//延迟实例化 true:延迟实例化 false:非延迟
public class ExampleBean {
	public ExampleBean() {
		System.out.println("==构造器==");
	}
	
	@PostConstruct//构造之后
	public void init(){
		System.out.println("==初始化==");
	} 
	
	@PreDestroy//销毁之前
	public void destroy(){
		System.out.println("==销毁==");
	}
}
