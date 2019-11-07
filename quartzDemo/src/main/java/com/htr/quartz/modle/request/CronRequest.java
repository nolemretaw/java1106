package com.htr.quartz.modle.request;

import lombok.Data;

/**
 * @Author: HuTingrong
 * @Description:
 * @Date: Created in 11:48 2019/11/7
 * @Modified By:
 */
@Data
public class CronRequest {
    private String jobName;
    private String jobGroup;
    private  String cronStr;


}
