package com.learn.pattern.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * @author ymhui
 * @date 2019/7/24
 * @time 8:52
 * description 具体观察者，空方
 */
public class Bear implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Float price = ((Float) arg).floatValue();
        if (price > 0) {
            System.out.println("油价上涨" + price + "元，空方伤心了！");
        } else {
            System.out.println("油价下跌" + (-price) + "元，空方高兴了！");
        }
    }
}
