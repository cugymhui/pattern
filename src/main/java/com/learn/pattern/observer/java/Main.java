package com.learn.pattern.observer.java;

/**
 * @author ymhui
 * @date 2019/7/24
 * @time 8:54
 * description
 */
public class Main {
    public static void main(String[] args){
        OilFutures oilFutures = new OilFutures();
        Bull bull = new Bull();
        Bear bear = new Bear();
        oilFutures.addObserver(bull);
        oilFutures.addObserver(bear);
        oilFutures.setPrice(-8);
        oilFutures.setPrice(10);
    }
}
