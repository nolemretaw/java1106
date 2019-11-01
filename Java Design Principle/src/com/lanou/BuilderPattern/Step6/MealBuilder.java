package com.lanou.BuilderPattern.Step6;

import com.lanou.BuilderPattern.Step4.ChickenBurger;
import com.lanou.BuilderPattern.Step4.Coke;
import com.lanou.BuilderPattern.Step4.Pepsi;
import com.lanou.BuilderPattern.Step4.VegBurger;
import com.lanou.BuilderPattern.Step5.Meal;

/**
 * @Author: HuTingrong
 * @Description: 实际的builder类负责创建Meal对象
 * @Date: Created in 14:36 2019/10/31
 * @Modified By:
 *
 */
public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareMeatMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
