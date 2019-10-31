package com.lanou.AbstractFactoryPattern.Factory;

import com.lanou.AbstractFactoryPattern.AbstractFactory;
import com.lanou.AbstractFactoryPattern.color.Impl.Blue;
import com.lanou.AbstractFactoryPattern.color.Impl.Green;
import com.lanou.AbstractFactoryPattern.color.Impl.Red;
import com.lanou.AbstractFactoryPattern.color.Interface.Color;
import com.lanou.AbstractFactoryPattern.shape.Interface.Shape;

/**
 * @Author: HuTingrong
 * @Description:
 * @Date: Created in 10:10 2019/10/31
 * @Modified By:
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
