package com.lanou.BuilderPattern.Step3;

import com.lanou.BuilderPattern.Step1.Item;
import com.lanou.BuilderPattern.Step1.Packing;
import com.lanou.BuilderPattern.Step2.Wrapper;

/**
 * @Author: HuTingrong
 * @Description:
 * @Date: Created in 13:27 2019/10/31
 * @Modified By:
 *
 * 创建实现Item接口的抽象类，该类提供了默认的功能
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
