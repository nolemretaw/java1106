package com.lanou.BuilderPattern.Step4;

import com.lanou.BuilderPattern.Step3.ColdDrink;

/**
 * @Author: HuTingrong
 * @Description:
 * @Date: Created in 13:38 2019/10/31
 * @Modified By:
 *
 * 拓展了ColdDrink的实体类
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}
