package com.lanou.BuilderPattern.Step4;

import com.lanou.BuilderPattern.Step3.Burger;

/**
 * @Author: HuTingrong
 * @Description:
 * @Date: Created in 13:38 2019/10/31
 * @Modified By:
 *
 * 拓展了Burger的实体类
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "chicken Burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
