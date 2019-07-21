package com.lanou.util;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @program: springboot01
 * @description:
 * @author: hutingrong
 * @create: 2019-07-21 11:33
 */
public class TimeUtil {
    private ScheduledExecutorService scheduledExecutorService;
    /** 
    * @Description:
    * @Param:  runnable方法
    * @Param: time 延迟时间
    * @Param: period 执行周期
    * @return:  
    * @Author: hutingrong
    * @Date: 2019/7/21 
    */
    public void scheduleAtFixedRate(Runnable runnable,Long time,int period){
        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(runnable,time,period, TimeUnit.SECONDS);
    }

    public void shutdown(){
        if (!scheduledExecutorService.isShutdown()){
            scheduledExecutorService.shutdown();
        }
    }
}