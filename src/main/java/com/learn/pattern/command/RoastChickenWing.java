package com.learn.pattern.command;

/**
 * @author ymhui
 * @date 2019/7/24
 * @time 9:41
 * description 具体命令类，烤鸡腿
 */
public class RoastChickenWing extends Command {
    private Barbecuer barbecuer;
    private int num;

    public RoastChickenWing(Barbecuer barbecuer, int num) {
        this.barbecuer = barbecuer;
        this.num = num;
    }

    @Override
    public void execute() {
        barbecuer.roastChickenWings(num);
    }

    @Override
    public String toString() {
        return num + "只鸡翅";
    }
}
