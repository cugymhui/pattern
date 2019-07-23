package com.learn.pattern.Observer;

/**
 * @author ymhui
 * @date 2019/7/23
 * @time 15:51
 * description 具体观察对象
 */
public class Student extends Subject {
    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.response();
        }
    }
}
