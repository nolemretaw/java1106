package com.lanou.aspect;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;


/**
 * 切面（代理者）
 * 封装共通的业务逻辑
 * */
public class EmpAspect {
	/**开启事物*/
	public void beginTx(){
		System.out.println("前置通知==>开启事物");
	}
	/**提交事物*/
	public void commitTx(){
		System.out.println("后置通知==>提交事物");
	}
	/**回滚事物
	 * @throws FileNotFoundException */
	public void rollBackTx(Exception e) throws FileNotFoundException{
		System.out.println("e:"+e);
		System.out.println("异常通知==>回滚事物");
		//记录异常日志
		PrintWriter out ;
		if (e instanceof NullPointerException) {
			out= new PrintWriter("NullPointerException.txt");
		}else if (e instanceof ArrayIndexOutOfBoundsException) {
			out = new PrintWriter("ArrayIndexOutOfBoundsException.txt");
		}else {
			out = new PrintWriter("otherlog.txt");
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		out.println("异常产生时间："+sdf.format(new Date()));
		out.println("异常产生原因："+e.getCause());
		out.println("异常产生类型："+e.getClass());
		out.println("==========异常产生详情===========");
		e.printStackTrace(out);
		out.close();
	}
	/**最终通知*/
	public void close(){
		System.out.println("最终通知==>关闭资源");
	}
	
	/**环绕通知
	 * 目标方法执行前后都会作用
	 * JoinPoint 连接点，连接到目标方法
	 * @throws Throwable 
	 * */
	public Object around(ProceedingJoinPoint joinpoint) throws Throwable {
		System.out.println("==环绕通知前==");
		//执行目标方法
		Object proceed = joinpoint.proceed();
		System.out.println("proceed="+proceed);
		System.out.println("==环绕通知后==");
		return proceed;
	}
}
