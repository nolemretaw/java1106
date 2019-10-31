package com.lanou.AbstractFactoryPattern;

import com.lanou.AbstractFactoryPattern.Factory.ColorFactory;
import com.lanou.AbstractFactoryPattern.Factory.ShapeFactory;

/**
 * @Author: HuTingrong
 * @Description: 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 * @Date: Created in 10:13 2019/10/31
 * @Modified By:
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if (choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
