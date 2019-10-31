package com.lanou.BuilderPattern.Step2;

import com.lanou.BuilderPattern.Step1.Packing;

/**
 * @Author: HuTingrong
 * @Description:
 * @Date: Created in 13:23 2019/10/31
 * @Modified By:
 *
 * 创建实现Packing接口的实体类
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
