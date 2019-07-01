package com.lanou.quartz;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class CronSchedule {
	public static void main(String[] args) throws Exception{
		//创建jobDetail对象
		JobDetail jobDetail = JobBuilder.newJob(HelloJob.class)
				.withIdentity("cronJob").build();
		//每天的9:40触发任务
		CronTrigger cronTrigger = 
				TriggerBuilder.newTrigger().withIdentity("cronTrigger")
				.withSchedule(CronScheduleBuilder
						.cronSchedule("0/5 47,48 0 3,4 0 1 *")).build();
		//Schedule实例
		StdSchedulerFactory stdSchedulerFactory = new StdSchedulerFactory();
		Scheduler scheduler =  StdSchedulerFactory.getDefaultScheduler();
		scheduler.start();
		scheduler.scheduleJob(jobDetail, cronTrigger);
	}
}
