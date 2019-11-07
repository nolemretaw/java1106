package com.htr.quartz.config;

import com.htr.quartz.job.MyJob;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.calendar.HolidayCalendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Properties;

/**
 * @Author: HuTingrong
 * @Description:
 * @Date: Created in 14:20 2019/11/6
 * @Modified By:
 */
@Configuration
public class QuartzDataSourceConfig {
    @Autowired
    private MyJobFactory myJobFactory;

    //导入多数据源配置
    @Bean(name = "SchedulerFactory")
    public SchedulerFactoryBean schedulerFactoryBean() throws IOException {

        //创建SchedulerFactoryBean
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        schedulerFactoryBean.setQuartzProperties(quartzProperties());
        schedulerFactoryBean.setJobFactory(myJobFactory);
        schedulerFactoryBean.setWaitForJobsToCompleteOnShutdown(
                true);//这样当spring关闭时，会等待所有已经启动的quartz job结束后spring才能完全shutdown。
        schedulerFactoryBean.setOverwriteExistingJobs(false);
//        schedulerFactoryBean.setStartupDelay(20);//初始化后。开始之前的延迟时间
//        schedulerFactoryBean.setAutoStartup(true);//设置是否自动运行调度器，默认为true
        //设置上下文spring bean name
//        schedulerFactoryBean.setApplicationContextSchedulerContextKey("applicationContext");
        return schedulerFactoryBean;
    }

    @Bean
    public Properties quartzProperties() throws IOException {
        //获取配置属性
        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
        propertiesFactoryBean.setLocation(new ClassPathResource("quartz.properties"));
        //配置文件中属性配读取后再初始化对象
        propertiesFactoryBean.afterPropertiesSet();
        return propertiesFactoryBean.getObject();
    }


    /*
     * 通过SchedulerFactoryBean获取Scheduler的实例
     */
    @Bean(name = "scheduler")
    public Scheduler scheduler() throws IOException, SchedulerException {
        Scheduler scheduler = schedulerFactoryBean().getScheduler();
        /*排除不执行的节假日*/
        HolidayCalendar cal = new HolidayCalendar();
//        cal.addExcludedDate(new GregorianCalendar(2019,11,7).getTime());
        cal.addExcludedDate(new GregorianCalendar(2019,10,1).getTime());
        scheduler.addCalendar("htrHolidays",cal,true,false);

        return scheduler;
    }

    @Bean
    public JobDetailFactoryBean simpleJobDetail()
    {
        JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();

        factoryBean.setJobClass(MyJob.class);
        factoryBean.setGroup("group1");
        factoryBean.setName("job1");

        return factoryBean;
    }

    /**
     * 静态方式配置定时任务
     * @param jobDetail
     * @return
     */
    @Bean
    public CronTriggerFactoryBean simpleJobTrigger(@Qualifier("simpleJobDetail")JobDetail jobDetail){
        CronTriggerFactoryBean factoryBean = new CronTriggerFactoryBean();
        factoryBean.setJobDetail(jobDetail);
        factoryBean.setStartDelay(1000L);
        factoryBean.setName("trigger1");
        factoryBean.setGroup("group1");
        //周1至周5，每天上午8点至下午18点，每分钟执行一次
        factoryBean.setCronExpression("0 0/1 8-18 ? * 2-6");

        return factoryBean;
    }


}
