package com.lanou.BridgePattern;

/**
 * @Author: HuTingrong
 * @Description: 2、实现桥接
 *
 *
 * @Date: Created in 10:25 2019/11/1
 * @Modified By:
 */
public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color :green," +
                "radius: "+radius+
                ",x:"+x+",y:"+y+"]");
    }
}
