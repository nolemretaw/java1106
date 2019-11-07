package com.lanou.DecoratorPattern;

/**
 * @Author: HuTingrong
 * @Description: 3、抽象装饰类
 * @Date: Created in 15:44 2019/11/1
 * @Modified By:
 */
public class ShapeDecorator implements Shape{
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
