package com.lanou.AbstractFactoryPattern.color.Impl;

import com.lanou.AbstractFactoryPattern.color.Interface.Color;

/**
 * @Author: HuTingrong
 * @Description:
 * @Date: Created in 9:52 2019/10/31
 * @Modified By:
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
