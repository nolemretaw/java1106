package com.lanou.AbstractFactoryPattern;

import com.lanou.AbstractFactoryPattern.color.Interface.Color;
import com.lanou.AbstractFactoryPattern.shape.Interface.Shape;

/**
 * @Author: HuTingrong
 * @Description: 为 Color 和 Shape 对象创建抽象类来获取工厂。
 * @Date: Created in 9:56 2019/10/31
 * @Modified By:
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);

}
