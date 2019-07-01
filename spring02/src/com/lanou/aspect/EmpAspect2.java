package com.lanou.aspect;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


/**
 * ���棨�����ߣ�
 * ��װ��ͨ��ҵ���߼�
 * */
@Component//����ǰ���ע�ᵽ����
@Aspect//ָ����ǰ���Ϊ��������������ࣩ
public class EmpAspect2 {
	/**��������*/
	@Before(value="execution(* com.lanou.service..*.*(..))")
	public void beginTx(){
		System.out.println("ǰ��֪ͨ==>��������");
	}
	/**�ύ����*/
	@AfterReturning(value="execution(* com.lanou.service..*.*(..))")
	public void commitTx(){
		System.out.println("����֪ͨ==>�ύ����");
	}
	/**�ع�����
	 * @throws FileNotFoundException */
	@AfterThrowing(value="execution(* com.lanou.service..*.*(..))",throwing="e")
	public void rollBackTx(Exception e) throws FileNotFoundException{
		System.out.println("e:"+e);
		System.out.println("�쳣֪ͨ==>�ع�����");
		//��¼�쳣��־
		PrintWriter out ;
		if (e instanceof NullPointerException) {
			out= new PrintWriter("NullPointerException.txt");
		}else if (e instanceof ArrayIndexOutOfBoundsException) {
			out = new PrintWriter("ArrayIndexOutOfBoundsException.txt");
		}else {
			out = new PrintWriter("otherlog.txt");
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		out.println("�쳣����ʱ�䣺"+sdf.format(new Date()));
		out.println("�쳣����ԭ��"+e.getCause());
		out.println("�쳣�������ͣ�"+e.getClass());
		out.println("==========�쳣��������===========");
		e.printStackTrace(out);
		out.close();
	}
	/**����֪ͨ*/
	@After(value="execution(* com.lanou.service..*.*(..))")
	public void close(){
		System.out.println("����֪ͨ==>�ر���Դ");
	}
	
	/**����֪ͨ
	 * Ŀ�귽��ִ��ǰ�󶼻�����
	 * JoinPoint ���ӵ㣬���ӵ�Ŀ�귽��
	 * @throws Throwable 
	 * */
	@Around(value="execution(* com.lanou.service..*.*(..))")
	public Object around(ProceedingJoinPoint joinpoint) throws Throwable {
		System.out.println("==����֪ͨǰ==");
		//ִ��Ŀ�귽��
		Object proceed = joinpoint.proceed();
		System.out.println("proceed="+proceed);
		System.out.println("==����֪ͨ��==");
		return proceed;
	}
}
