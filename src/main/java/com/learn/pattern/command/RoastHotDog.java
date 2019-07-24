package com.learn.pattern.command;

/**
 * @author ymhui
 * @date 2019/7/24
 * @time 9:44
 * description 具体命令类，烤火腿肠
 */
public class RoastHotDog extends Command {
    private Barbecuer barbecuer;
    private int num;

    public RoastHotDog(Barbecuer barbecuer, int num) {
        this.barbecuer = barbecuer;
        this.num = num;
    }

    @Override
    public void execute() {
        barbecuer.roastHotDog(num);
    }

    @Override
    public String toString() {
        return num + "只热狗";
    }
}
