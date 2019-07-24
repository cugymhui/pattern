package com.learn.pattern.chain_of_responsibility;

/**
 * @author ymhui
 * @date 2019/7/24
 * @time 10:34
 * description 具体处理者-院长
 */
public class Dean extends AbstractHandle {
    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 10) {
            System.out.println("可以");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(leaveDays);
            } else {
                System.out.println("不能批准");
            }
        }
    }
}
