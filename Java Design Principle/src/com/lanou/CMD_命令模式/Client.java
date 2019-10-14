package com.lanou.CMD_命令模式;

/**
 * @Author: HuTingrong
 * @Description: 场景类
 * @Date: Created in 13:48 2019/10/14
 * @Modified By:
 *
 * receiver:接收者：干活的人，命令最终传递到这里执行
 * command: 命令：需要执行的命令都在这里声明，指定receiver
 * invoker: 调用者： 接收命令，并执行命令，指定command
 *
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver1 = new ConcreteReceiver1();
        Receiver receiver2 = new ConcreteReceiver2();

        Command command1 = new ConcreteCommand1(receiver1);
        Command command2 = new ConcreteCommand2(receiver2);

        invoker.setCommand(command1);
        invoker.action();

        invoker.setCommand(command2);
        invoker.action();


    }
}
