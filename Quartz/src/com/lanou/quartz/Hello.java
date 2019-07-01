package com.lanou.quartz;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.SimpleTrigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class Hello {

	public static void main(String[] args) throws SchedulerException {
		// 创建jobDetail
		JobDetail jobDetail = JobBuilder.newJob(HelloJob.class)
				.withIdentity("myjob").build();
		SimpleTrigger simpleTrigger = TriggerBuilder
				.newTrigger()//创建触发器
				.withIdentity("myTrigger")//命名
				.startNow()//开启
				.withSchedule(
					SimpleScheduleBuilder.simpleSchedule()
					.withIntervalInSeconds(2)//时间设置
					.repeatForever()//永久运行模式
						).build();
		//创建一个Schedule
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		scheduler.scheduleJob(jobDetail,simpleTrigger);
		scheduler.start();
	}

}
