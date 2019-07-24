package com.learn.pattern.chain_of_responsibility;

/**
 * @author ymhui
 * @date 2019/7/24
 * @time 10:30
 * description 具体处理者-系主任
 */
public class DepartmentLeader extends AbstractHandle {

    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 5) {
            System.out.println("同意");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(leaveDays);
            } else {
                System.out.println("不能批准");
            }
        }
    }
}
