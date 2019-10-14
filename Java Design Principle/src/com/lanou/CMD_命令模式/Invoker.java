package com.lanou.CMD_命令模式;

/**
 * @Author: HuTingrong
 * @Description: 调用者Invoker类
 * @Date: Created in 13:46 2019/10/14
 * @Modified By:
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }
}
