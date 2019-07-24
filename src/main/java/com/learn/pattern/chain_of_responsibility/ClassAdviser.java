package com.learn.pattern.chain_of_responsibility;

/**
 * @author ymhui
 * @date 2019/7/24
 * @time 10:27
 * description 具体处理者-班主任
 */
public class ClassAdviser extends AbstractHandle {
    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 2) {
            System.out.println("批准了！");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(leaveDays);
            } else {
                System.out.println("不能批准");
            }
        }
    }
}
