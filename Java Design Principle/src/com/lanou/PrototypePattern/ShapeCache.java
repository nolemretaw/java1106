package com.lanou.PrototypePattern;

import java.util.Hashtable;

/**
 * @Author: HuTingrong
 * @Description: 3、从数据库获取实体类，并把它们存在一个hashtable中
 * @Date: Created in 17:39 2019/10/31
 * @Modified By:
 */
public class ShapeCache {
    private static Hashtable<String,Shape> shapeMap = new Hashtable<String,Shape>();
    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    //对于每种形状都运行数据库查询，并创建该形状
    //例如，我们要添加三种形状
    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
