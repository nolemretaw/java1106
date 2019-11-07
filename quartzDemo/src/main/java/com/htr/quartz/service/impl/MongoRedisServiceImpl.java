package com.htr.quartz.service.impl;

import com.htr.quartz.entity.StudentEntity;
import com.htr.quartz.entity.StudentMongoEntity;
import com.htr.quartz.service.MongoRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

/**
 * @Author: HuTingrong
 * @Description:
 * @Date: Created in 15:03 2019/11/4
 * @Modified By:
 */
@Service
@Transactional
public class MongoRedisServiceImpl implements MongoRedisService {
    @Autowired
    MongoTemplate mongoTemplate;

    //用于存储复杂对象类型(两者不互通)
    @Autowired
    RedisTemplate redisTemplate;

    //用于存储string类型(两者不互通)
    StringRedisTemplate stringRedisTemplate;

    @Override
    public void updateStudent(StudentMongoEntity entity) {
        Query query = Query.query(Criteria.where("_id").is(entity.getId()));
        Update update = Update.update("name", entity.getName()).set("age", entity.getAge()).set("gender", entity.getGender());
        mongoTemplate.upsert(query, update, "student");
    }

    @Override
    public void insertStudent(List<StudentMongoEntity> entities) {
        for (StudentMongoEntity entity : entities) {
            mongoTemplate.insert(entity, "student");
        }
    }

    @Override
    public List<StudentMongoEntity> findAll() {
        List<StudentMongoEntity> all = mongoTemplate.findAll(StudentMongoEntity.class);
        for (StudentMongoEntity studentMongoEntity : all) {
            System.out.println(studentMongoEntity);
        }
        return all;
    }

    @Override
    public void deleteStudentByIds(List<Integer> ids) {
        for (Integer id : ids) {
            Query query = Query.query(Criteria.where("_id").is(id));
            mongoTemplate.remove(query, "student");
        }
    }

    /**
     *  WRONGTYPE Operation against a key holding the wrong kind of value错误，是因为
     *  存取时k-v形式不对，e.g. 存时key--value,取时key--map 或 key--object 就会造成此错误
     *  因此 使用 opsForList() 存，就用opsForList()取
     *  使用 opsForValue() 存 ，就用opsForValue()取
     */

    /**
     * -------------------------------------List start-------------------------------------------------------------------
     */
    @Override
    public StudentEntity getListStudentByClass(String className) {
        if (redisTemplate.hasKey(className)) {
            //两种方式
//            Object classA = redisTemplate.opsForValue().get(className);
//            List<StudentEntity> classA1 = (List<StudentEntity>) classA;
//            return classA1.get(0);

            Object leftPop = redisTemplate.opsForList().leftPop(className);
            List<StudentEntity> leftPop1 = (List<StudentEntity>) leftPop;
            return leftPop1.get(0);
        }
        System.out.println("未存入");
        return null;
    }


    @Override
    public void setListStudent(List<StudentEntity> entities) {
        String className = entities.get(0).getClassName();
        for (StudentEntity entity : entities) {
            System.out.println(entities);
        }
        if (redisTemplate.hasKey(className)) {
            System.out.println("已存入");
//            redisTemplate.opsForList().rightPopAndLeftPush()
            return;
        }
        //两种方式
//        redisTemplate.opsForValue().set(className,entities);

        redisTemplate.opsForList().leftPushAll(className, entities);
    }


    /**
     * -------------------------------------List end-------------------------------------------------------------------
     */

    /**
     * -------------------------------------string start-------------------------------------------------------------------
     */
    @Override
    public String getString(String keyName) {
        if (!stringRedisTemplate.hasKey("name")) {
            return "尚未存入";
        }
        return stringRedisTemplate.opsForValue().get(keyName);
    }

    @Override
    public void setString(String name) {
        if (!stringRedisTemplate.hasKey("name")) {
            stringRedisTemplate.opsForValue().set("name", name);

            return;
        }
        stringRedisTemplate.opsForValue().append("name", "," + name);
    }


    /**
     -------------------------------------string end-------------------------------------------------------------------
     */
    /**
     * -------------------------------------Set start-------------------------------------------------------------------
     */

    @Override
    public void setSet(String name) {
        SetOperations<String, String> set = stringRedisTemplate.opsForSet();
//        if (!redisTemplate.hasKey("name")){
        set.add("name", name);
//            return;
//        }
//        set.a
    }

    @Override
    public Set getSet(String keyName) {
        SetOperations<String, String> set = stringRedisTemplate.opsForSet();
        return set.members("name");
    }
    /**
     -------------------------------------Set end-------------------------------------------------------------------
     */


}
