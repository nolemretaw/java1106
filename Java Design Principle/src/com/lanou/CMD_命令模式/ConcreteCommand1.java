package com.lanou.CMD_命令模式;

/**
 * @Author: HuTingrong
 * @Description: 具体的Command类
 * @Date: Created in 13:38 2019/10/14
 * @Modified By:
 */
public class ConcreteCommand1 extends Command{
//    对哪个Receiver类进行命令处理
    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
