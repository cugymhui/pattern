package com.learn.pattern.Observer;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author ymhui
 * @date 2019/7/23
 * @time 15:28
 * description 观察对象
 */
public abstract class Subject {
    List<Observer> observers = Lists.newArrayList();

    public void add(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public abstract void notifyObserver();
}
