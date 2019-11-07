package com.lanou.DecoratorPattern;

/**
 * @Author: HuTingrong
 * @Description: 4、扩展了ShapeDecorator
 * @Date: Created in 15:52 2019/11/1
 * @Modified By:
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }

    private void setRedBorder(Shape decoratorShape) {
        System.out.println("Border Color: Red");
    }
}
