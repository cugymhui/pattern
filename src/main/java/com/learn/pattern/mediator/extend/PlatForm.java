package com.learn.pattern.mediator.extend;

/**
 * @author ymhui
 * @date 2019/7/25
 * @time 15:50
 * description
 */
public class PlatForm {
    public static void main(String[] args) {
        SimpleColleague c1, c2;
        c1 = new SimpleColleague1();
        c2 = new SimpleColleague2();
        c1.send("最是一年春好处，落花时节又逢君。");
        System.out.println("-----------------");
        c2.send("等闲识得东风面，万紫千红总是春。");
    }
}
