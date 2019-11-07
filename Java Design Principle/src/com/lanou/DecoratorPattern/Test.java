package com.lanou.DecoratorPattern;

/**
 * @Author: HuTingrong
 * @Description: 5、使用RedShapeDecorator来装饰Shape对象
 * @Date: Created in 16:01 2019/11/1
 * @Modified By:
 */
public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redShapeDecorator = new RedShapeDecorator(new Circle());

    }
}
