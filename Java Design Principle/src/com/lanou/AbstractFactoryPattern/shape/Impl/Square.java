package com.lanou.AbstractFactoryPattern.shape.Impl;

import com.lanou.AbstractFactoryPattern.shape.Interface.Shape;

/**
 * @Author: HuTingrong
 * @Description:
 * @Date: Created in 11:04 2019/10/24
 * @Modified By:
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
