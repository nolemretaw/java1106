package com.lanou.aspect;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;


/**
 * ���棨�����ߣ�
 * ��װ��ͨ��ҵ���߼�
 * */
public class EmpAspect {
	/**��������*/
	public void beginTx(){
		System.out.println("ǰ��֪ͨ==>��������");
	}
	/**�ύ����*/
	public void commitTx(){
		System.out.println("����֪ͨ==>�ύ����");
	}
	/**�ع�����
	 * @throws FileNotFoundException */
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
	public void close(){
		System.out.println("����֪ͨ==>�ر���Դ");
	}
	
	/**����֪ͨ
	 * Ŀ�귽��ִ��ǰ�󶼻�����
	 * JoinPoint ���ӵ㣬���ӵ�Ŀ�귽��
	 * @throws Throwable 
	 * */
	public Object around(ProceedingJoinPoint joinpoint) throws Throwable {
		System.out.println("==����֪ͨǰ==");
		//ִ��Ŀ�귽��
		Object proceed = joinpoint.proceed();
		System.out.println("proceed="+proceed);
		System.out.println("==����֪ͨ��==");
		return proceed;
	}
}
