package com.lanou.FactoryPattern;

/**
 * @Author: HuTingrong
 * @Description:
 * 工厂类，生成基于给定信息的实体类的对象
 * @Date: Created in 11:07 2019/10/24
 * @Modified By:
 */
public class ShapeFactory {
    //使用 getShape 方法获取类型的对象
    public Shape getShape(String shapeType){
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
