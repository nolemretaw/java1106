package com.htr.quartz.job;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.quartz.*;

import java.util.Date;

/**
 * @Author: HuTingrong
 * @Description: 用于实现具体的业务
 * @Date: Created in 16:26 2019/11/6
 * @Modified By:
 */
@Slf4j
@NoArgsConstructor
public class YourJob implements Job {
//    String jobSays;
//    float jobFloatValue;
//
//    public void setJobSays(String jobSays) {
//        this.jobSays = jobSays;
//    }
//
//    public void setJobFloatValue(float jobFloatValue) {
//        this.jobFloatValue = jobFloatValue;
//    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        //可从jobDataMap中取出数据使用
        JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
        String jobSays = jobDataMap.getString("jobSays");
        float jobFloatValue = jobDataMap.getFloat("jobFloatValue");
        JobKey key = context.getJobDetail().getKey();
//        jobDataMap = context.getJobDetail().getJobDataMap();

        log.info("执行我的定时任务，时间：{}", new Date());
        log.info("执行我的数据，任务jobDataMap内容{} : {},{}", key, jobSays, jobFloatValue);
    }
}
