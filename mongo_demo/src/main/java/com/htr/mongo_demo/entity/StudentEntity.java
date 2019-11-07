package com.htr.mongo_demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: HuTingrong
 * @Description:
 * @Date: Created in 13:49 2019/11/4
 * @Modified By:
 */
@Entity
@Table(name = "student")
@Data
public class StudentEntity implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;
    @Basic
    @Column(name = "age", nullable = true)
    private Integer age;
    @Basic
    @Column(name = "gender", nullable = true)
    private Integer gender;
    @Basic
    @Column(name = "class_name", nullable = true, length = 255)
    private String className;


}
