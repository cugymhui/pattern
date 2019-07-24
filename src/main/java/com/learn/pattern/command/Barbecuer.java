package com.learn.pattern.command;

/**
 * @author ymhui
 * @date 2019/7/24
 * @time 9:18
 * description 烧烤摊主，命令接收者
 */
public class Barbecuer {
    public void roastChickenWings(int num) {
        System.out.println( num + "串烤鸡翅...");
    }

    public void roastChickenLeg(int num) {
        System.out.println( num + "只烤鸡腿...");
    }

    public void roastHotDog(int num) {
        System.out.println( num + "根热狗...");
    }
}
