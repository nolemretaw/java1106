package com.htr.quartz.listener;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;
import org.springframework.stereotype.Component;

/**
 * @Author: HuTingrong
 * @Description: 定义一个监听器，用于在任务执行前后做一些操作
 * @Date: Created in 16:41 2019/11/6
 * @Modified By:
 */
@Slf4j
@Component
public class MyJobListener implements JobListener {
    public static final String LISTENER_NAME = "MyQuartzSchedulerListener";

    @Override
    public String getName() {
        return LISTENER_NAME;
    }

    //任务被调度之前
    @Override
    public void jobToBeExecuted(JobExecutionContext context) {
        String jobName = context.getJobDetail().getKey().toString();
        log.info("任务将被执行，Job : {} 即将开始", jobName);
    }

    //任务被拒
    @Override
    public void jobExecutionVetoed(JobExecutionContext context) {
        String jobName = context.getJobDetail().getKey().toString();
        log.info("任务 : {} 被拒", jobName);
    }

    //任务被调度后
    @Override
    public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {
        String jobName = context.getJobDetail().getKey().toString();
        log.info("任务 : {} 被调度", jobName);
        if (jobException != null && !jobException.getMessage().equals("")) {
            log.info("Exception thrown by : {} , Exception : {}", jobName, jobException.getMessage());
        }

    }
}
