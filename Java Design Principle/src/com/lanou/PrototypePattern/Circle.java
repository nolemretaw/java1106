package com.lanou.PrototypePattern;

/**
 * @Author: HuTingrong
 * @Description:
 * @Date: Created in 11:04 2019/10/24
 * @Modified By:
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
