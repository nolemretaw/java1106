package com.lanou.BuilderPattern.Step5;

import com.lanou.BuilderPattern.Step1.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HuTingrong
 * @Description:
 * @Date: Created in 13:47 2019/10/31
 * @Modified By:
 *
 * 创建Meal类，带有item对象
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.println("item : " + item.name());
            System.out.println(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }

}
