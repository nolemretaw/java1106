package com.lanou.PrototypePattern;

/**
 * @Author: HuTingrong
 * @Description: 1 、创建一个实现了 Cloneable 接口的抽象类。
 * @Date: Created in 15:31 2019/10/31
 * @Modified By:
 */
public abstract class Shape implements Cloneable{
    private String id;
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
