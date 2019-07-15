package com.lanou.bean.quartz;

import com.lanou.controller.EmpController;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: springboot01
 * @description:
 * @author: hutingrong
 * @create: 2019-07-14 23:29
 */
public class TransforJob implements Job {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EmpController empController;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("transfor mysql to postgresql");
        empController.mysql2PostgresById(1);
    }
}
