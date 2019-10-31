package com.lanou.AbstractFactoryPattern.Factory;

import com.lanou.AbstractFactoryPattern.AbstractFactory;
import com.lanou.AbstractFactoryPattern.color.Interface.Color;
import com.lanou.AbstractFactoryPattern.shape.Impl.Circle;
import com.lanou.AbstractFactoryPattern.shape.Interface.Shape;
import com.lanou.AbstractFactoryPattern.shape.Impl.Rectangle;
import com.lanou.AbstractFactoryPattern.shape.Impl.Square;

/**
 * @Author: HuTingrong
 * @Description:
 * 工厂类，生成基于给定信息的实体类的对象
 * @Date: Created in 11:07 2019/10/24
 * @Modified By:
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    //使用 getShape 方法获取类型的对象
    public Shape getShape(String shapeType) {
        if (shapeType == null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }


}
