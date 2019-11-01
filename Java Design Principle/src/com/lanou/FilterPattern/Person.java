package com.lanou.FilterPattern;

/**
 * @Author: HuTingrong
 * @Description: 1、创建一个类，在该类上应用标准
 * @Date: Created in 14:14 2019/11/1
 * @Modified By:
 */
public class Person {
    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name,String gender,String maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }
}
