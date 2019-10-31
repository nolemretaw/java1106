package com.lanou.BuilderPattern.Step1;

/**
 * @Author: HuTingrong
 * @Description:
 * @Date: Created in 11:57 2019/10/31
 * @Modified By:
 * 创建一个表示食物条目的接口
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
