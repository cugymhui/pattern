package com.learn.pattern.command;

import com.google.common.collect.Lists;

import java.util.Date;
import java.util.List;

/**
 * @author ymhui
 * @date 2019/7/24
 * @time 9:21
 * description 命令调用者
 */
public class Waiter {
    List<Command> commands = Lists.newArrayList();

    public void add(Command command) {
        System.out.println("新增订单：" + command + ", 订单时间：" + new Date());
        commands.add(command);
    }

    public void remove(Command command) {
        System.out.println("取消订单：" + command + ", 订单时间：" + new Date());
        commands.remove(command);
    }

    public void notifyBarbecuer() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
