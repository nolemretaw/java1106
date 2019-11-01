package com.lanou.BridgePattern;

/**
 * @Author: HuTingrong
 * @Description: 3、使用DrawAPI接口创建抽象类Shape
 * -------------------------------------------"抽象"
 *
 * @Date: Created in 10:56 2019/11/1
 * @Modified By:
 */
public abstract class Shape {
    protected DrawAPI drawAPI;//实现 桥接（抽象类 依赖 实现类）
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
