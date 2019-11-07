package com.htr.quartz.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Author: HuTingrong
 * @Description:
 * @Date: Created in 14:04 2019/11/4
 * @Modified By:
 */

//set/get/tostring/constructor/equals
@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Document(collection = "student")
public class StudentMongoEntity {
    @Id
    private int id;
    private String name;
    private Integer age;
    private Integer gender;
}
