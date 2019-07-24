package com.learn.pattern.chain_of_responsibility;

import lombok.Data;

/**
 * @author ymhui
 * @date 2019/7/24
 * @time 10:20
 * description 抽象处理者
 */
@Data
public abstract class AbstractHandle {
    private AbstractHandle next;

    public abstract void handleRequest(int leaveDays);
}
