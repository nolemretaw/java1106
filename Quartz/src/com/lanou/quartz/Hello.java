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
		// ����jobDetail
		JobDetail jobDetail = JobBuilder.newJob(HelloJob.class)
				.withIdentity("myjob").build();
		SimpleTrigger simpleTrigger = TriggerBuilder
				.newTrigger()//����������
				.withIdentity("myTrigger")//����
				.startNow()//����
				.withSchedule(
					SimpleScheduleBuilder.simpleSchedule()
					.withIntervalInSeconds(2)//ʱ������
					.repeatForever()//��������ģʽ
						).build();
		//����һ��Schedule
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		scheduler.scheduleJob(jobDetail,simpleTrigger);
		scheduler.start();
	}

}
