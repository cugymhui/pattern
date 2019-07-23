package com.learn.pattern.Factory;

/**
 * @author ymhui
 * @date 2019/7/20
 * @time 16:12
 * description
 */
public class Main {
    public static void main(String[] args){
        CattleFactory cattleFactory = new CattleFactory();
        cattleFactory.newAnimal().show();
        HorseFactory horseFactory = new HorseFactory();
        horseFactory.newAnimal().show();
    }
}
