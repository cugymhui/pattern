package com.learn.pattern.observer.java;

import java.util.Observable;

/**
 * @author ymhui
 * @date 2019/7/24
 * @time 8:45
 * description 具体目标类，原油期货
 */
public class OilFutures extends Observable {
    private float price;

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        super.setChanged();
        super.notifyObservers(price);
        this.price = price;
    }
}
