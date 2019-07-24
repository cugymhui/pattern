package com.learn.pattern.command;

/**
 * @author ymhui
 * @date 2019/7/24
 * @time 9:39
 * description 具体命令，烤鸡腿
 */
public class RoastChickenLeg extends Command {

    private Barbecuer barbecuer;
    private int num;   // 订单数量

    public RoastChickenLeg(Barbecuer barbecuer, int num) {
        this.barbecuer = barbecuer;
        this.num = num;
    }

    @Override
    public void execute() {
        barbecuer.roastChickenLeg(num);
    }

    @Override
    public String toString() {
        return num + "只鸡腿";
    }
}
