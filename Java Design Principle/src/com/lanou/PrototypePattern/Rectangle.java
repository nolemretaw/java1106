package com.lanou.PrototypePattern;

/**
 * @Author: HuTingrong
 * @Description: 2 、创建扩展了上抽象类的实体类。
 * @Date: Created in 11:04 2019/10/24
 * @Modified By:
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
