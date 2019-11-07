package com.htr.quartz.utils;

import com.htr.quartz.listener.MyJobListener;
import org.quartz.*;
import org.quartz.impl.matchers.KeyMatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: HuTingrong
 * @Description:
 * @Date: Created in 13:40 2019/11/6
 * @Modified By:
 */
@Component
public class JobUtils {

    //quartz调度器工厂
    @Autowired
    @Qualifier(value = "SchedulerFactory")
    private SchedulerFactoryBean schedulerFactoryBean;

    //quartz调度器
    @Autowired
    @Qualifier(value = "scheduler")
    private Scheduler scheduler;

    @Autowired
    private MyJobListener myJobListener;


    /**
     * 根据开始时间设置定时任务
     *
     * @param startTime 任务执行时刻
     * @param jobName   任务名称
     * @param jobGroup  任务组名称
     * @param jobBean   具体任务
     */
    public void startJobByStartAt(long startTime, String jobName, String jobGroup, Class jobBean) throws SchedulerException {
        //设置自定义监听器
        if (myJobListener == null) {
            myJobListener = new MyJobListener();
        }
        scheduler.getListenerManager().addJobListener(myJobListener);
        //也可指定任务添加监听器
//        scheduler.getListenerManager().addJobListener(myJobListener, KeyMatcher.keyEquals(
//                new JobKey("job1", "jobGroup1")));

        //该任务触发器若不存在，则新建一个
        JobKey jobKey = new JobKey(jobName, jobGroup);
        if (!scheduler.checkExists(jobKey)) {
            Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("trigger2", "triggerGroup2")
                    .startAt(new Date(startTime))
                    .build();
            startJob(jobName, jobGroup, trigger, jobBean);
        }
    }

    /**
     * 根据cron设置定时任务
     *
     * @param jobName  任务名称
     * @param jobGroup 任务组名称
     * @param cron     cron表达式
     * @param jobBean  具体任务
     */
    public void startJobByCron(String jobName, String jobGroup, String cron, Class jobBean) throws SchedulerException {
        //设置自定义监听器
        if (myJobListener == null) {
            myJobListener = new MyJobListener();
        }
        scheduler.getListenerManager().addJobListener(myJobListener);

        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(cron);
        //该任务触发器若不存在，则新建一个
        JobKey jobKey = new JobKey(jobName, jobGroup);
        if (!scheduler.checkExists(jobKey)) {
            CronTrigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("trigger2", "triggerGroup2")
                    .withSchedule(scheduleBuilder)
                    .forJob(jobName, jobGroup)
                    .modifiedByCalendar("htrHolidays")//排除不执行的时间段，e.g.节假日
                    .build();
            startJob(jobName, jobGroup, trigger, jobBean);
        }
    }

    /**
     * 移除定时任务
     *
     * @param jobName
     * @param jobGroup
     */
    public void deleteJob(String jobName, String jobGroup) throws SchedulerException {
        JobKey jobKey = new JobKey(jobName, jobGroup);
        scheduler.deleteJob(jobKey);
    }

    /**
     * 暂停定时任务
     *
     * @param jobName
     * @param jobGroup
     */
    public void pauseJob(String jobName, String jobGroup) throws SchedulerException {
        JobKey jobKey = new JobKey(jobName, jobGroup);
        scheduler.pauseJob(jobKey);
    }

    /**
     * 恢复定时任务
     *
     * @param jobName
     * @param jobGroup
     */
    public void resumeJob(String jobName, String jobGroup) throws SchedulerException {
        JobKey jobKey = new JobKey(jobName, jobGroup);
        scheduler.resumeJob(jobKey);
    }

    /**
     * 清空所有当前scheduler对象下的定时任务
     */
    public void clearAllJob() throws SchedulerException {
        scheduler.clear();
    }

    /**
     * 动态创建job
     * <p>
     * trigger 和 job 是 多对一 关系，一个job,可由多个trigger 触发。但为了演示，此时为一对一
     *
     * @param jobName
     * @param jobGroup
     * @param trigger
     * @param jobBean
     * @throws SchedulerException
     */
    private void startJob(String jobName, String jobGroup, Trigger trigger, Class jobBean) throws SchedulerException {
        //创建任务，定义并绑定job
        JobDetail jobDetail = JobBuilder.newJob(jobBean)
                //存入数据 法1：将数据放入JobDataMap,供job执行时使用
                .usingJobData("jobSays", "hello world")
                .usingJobData("jobFloatValue", 3.14f)
                .withIdentity(jobName, jobGroup)
                .build();
        //存入数据，法2，注意此时存入的是obj类型，取的时候要进行转换
//        Map<String, Object> map = new HashMap<>();
//        map.put("jobSays", "hello world");
//        map.put("jobFloatValue", 3.14f);
//        trigger.getJobDataMap().putAll(map);
//
        //将触发器与任务绑定, 并存入到调度器内
        scheduler.scheduleJob(jobDetail, trigger);
    }
}
