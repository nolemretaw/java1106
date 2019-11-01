package com.lanou.BridgePattern;

/**
 * @Author: HuTingrong
 * @Description: 4、创建实现了Shape接口的实体类
 *
 * --------------------------------------------------------"抽象"
 *
 * @Date: Created in 11:02 2019/11/1
 * @Modified By:
 */
public class Circle extends Shape {
    private int x,y,radius;

    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
