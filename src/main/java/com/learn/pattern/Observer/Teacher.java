package com.learn.pattern.Observer;

/**
 * @author ymhui
 * @date 2019/7/23
 * @time 15:56
 * description 具体观察者
 */
public class Teacher extends Observer {
    @Override
    public void response() {
        System.out.println("你注意了，小朋友");
    }
}
