package com.learn.pattern.abstractFactory;

/**
 * @author ymhui
 * @date 2019/7/20
 * @time 17:54
 * description
 */
public class Main {
    public static void main(String[] args) {
        SGFarm sgFarm = new SGFarm();
        sgFarm.newAnimal().show();
        sgFarm.newPlant().show();

        SRFarm srFarm = new SRFarm();
        srFarm.newAnimal().show();
        srFarm.newPlant().show();
    }
}
