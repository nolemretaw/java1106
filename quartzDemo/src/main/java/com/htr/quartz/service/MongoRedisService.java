package com.htr.quartz.service;

import com.htr.quartz.entity.StudentEntity;
import com.htr.quartz.entity.StudentMongoEntity;

import java.util.List;
import java.util.Set;

/**
 * @Author: HuTingrong
 * @Description:
 * @Date: Created in 14:58 2019/11/4
 * @Modified By:
 */
public interface MongoRedisService {
    void  updateStudent(StudentMongoEntity entity);
    void insertStudent(List<StudentMongoEntity> entities);
    List<StudentMongoEntity> findAll();
    void deleteStudentByIds(List<Integer> ids);
    StudentEntity getListStudentByClass(String className);
    void setListStudent(List<StudentEntity> entities);

    String getString(String keyName);
    void setString(String studentName);

    void setSet(String studentName);
    Set getSet(String keyName);




}
