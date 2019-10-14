package com.lanou.CMD_命令模式;

/**
 * @Author: HuTingrong
 * @Description:Receiver 接受者角色：该角色就是干活的角色，命令传递到这里是应该被执行的
 *                          通用Receiver类
 * @Date: Created in 13:31 2019/10/14
 * @Modified By:
 */
public abstract class Receiver {
    public abstract void doSomething();
}
