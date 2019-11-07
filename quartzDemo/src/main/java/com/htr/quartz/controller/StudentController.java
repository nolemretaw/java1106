package com.htr.quartz.controller;

import com.htr.quartz.entity.StudentEntity;
import com.htr.quartz.entity.StudentMongoEntity;
import com.htr.quartz.job.MyJob;
import com.htr.quartz.modle.request.CronRequest;
import com.htr.quartz.service.MongoRedisService;
import com.htr.quartz.utils.JobUtils;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

/**
 * @Author: HuTingrong
 * @Description:
 * @Date: Created in 15:19 2019/11/4
 * @Modified By:
 */
@RestController
//@Controller
@RequestMapping(value = "/testQuartz")
public class StudentController {

    @Autowired
    MongoRedisService mongoRedisService;

    @Autowired
    public JobUtils jobUtils;


    @GetMapping(value = "/findAll")
//    @ResponseBody
    public ResponseEntity getAllMongoStudent(){
        List<StudentMongoEntity> all = mongoRedisService.findAll();
        return ResponseEntity.ok(all);
    }

    @GetMapping(value = "/hello")
//    @ResponseBody
    public String hello(){
        return "hello quartz";
    }

    @PostMapping(value = "/insert")
    public ResponseEntity insertMongoStudent(@RequestBody List<StudentMongoEntity> entities){
        mongoRedisService.insertStudent(entities);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity deleteMongoStudent(@RequestBody List<Integer> ids){
        mongoRedisService.deleteStudentByIds(ids);
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/update")
    public ResponseEntity updateMongoStudent(@RequestBody StudentMongoEntity entity){
        mongoRedisService.updateStudent(entity);
        return ResponseEntity.ok().build();
    }

    @PostMapping(value = "/setListRedis")
    public ResponseEntity setRedis(@RequestBody List<StudentEntity> entities){
        mongoRedisService.setListStudent(entities);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/getListRedis/{className}")
    public ResponseEntity getRedis(@PathVariable String className){
        StudentEntity student = mongoRedisService.getListStudentByClass(className);
        return ResponseEntity.ok(student);
    }

    @PostMapping(value = "/setStudentName")
    public ResponseEntity setStudentName(@RequestParam String studentName){
        mongoRedisService.setString(studentName);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/getStudentName")
    public ResponseEntity getStudentName(){
        String name = mongoRedisService.getString("name");
        return ResponseEntity.ok(name);

    }

    @PostMapping(value = "/setSetName")
    public ResponseEntity setSetName(@RequestParam String studentName){
        mongoRedisService.setSet(studentName);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/getSetName")
    public ResponseEntity getSetName(){
        Set name = mongoRedisService.getSet("name");
        return ResponseEntity.ok(name);

    }

    @PostMapping(value = "/job2")
    public ResponseEntity scheduleJob2(@RequestBody CronRequest request){
        try {
            jobUtils.startJobByCron(request.getJobName(), request.getJobGroup(), request.getCronStr(), MyJob.class);//每五秒执行一次
            return ResponseEntity.ok("定时器启动成功");
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        return  ResponseEntity.ok("定时器启动失败");
    }

    @PostMapping(value = "del_job2")
    public ResponseEntity deleteScheduleJob2(@RequestBody CronRequest request){
        try {
            jobUtils.deleteJob(request.getJobName(),request.getJobGroup());
            return ResponseEntity.ok("定时器删除成功");
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
            return ResponseEntity.ok("定时器删除失败");
    }


}
