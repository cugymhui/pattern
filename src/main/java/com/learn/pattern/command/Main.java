package com.learn.pattern.command;

/**
 * @author ymhui
 * @date 2019/7/24
 * @time 9:50
 * description
 */
public class Main {
    public static void main(String[] args){
        Barbecuer barbecuer = new Barbecuer();
        Waiter waiter_long = new Waiter();

        RoastHotDog roastHotDog = new RoastHotDog(barbecuer, 10);
        RoastChickenWing roastChickenWing = new RoastChickenWing(barbecuer, 5);
        RoastChickenLeg roastChickenLeg = new RoastChickenLeg(barbecuer, 10);

        waiter_long.add(roastChickenLeg);
        waiter_long.add(roastChickenWing);
        waiter_long.add(roastHotDog);

        waiter_long.notifyBarbecuer();

        waiter_long.remove(roastChickenLeg);
    }
}
