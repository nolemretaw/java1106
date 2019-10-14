package com.lanou.CMD_命令模式;

/**
 * @Author: HuTingrong
 * @Description: 具体Receiver类
 * @Date: Created in 13:34 2019/10/14
 * @Modified By:
 */
public class ConcreteReceiver2 extends Receiver {
    @Override
    public void doSomething() {
        System.out.println("接收者 2 处理 业务2");
    }
}
