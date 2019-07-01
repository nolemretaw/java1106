package com.lanou.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloJob implements Job{

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String format = sdf.format(date);
		System.out.println("当前时间:"+format);
		
		/**--------具体业务逻辑---------*/
		System.out.println("业务逻辑");
	}

	
	
	
}
