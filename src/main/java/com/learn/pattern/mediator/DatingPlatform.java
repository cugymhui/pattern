package com.learn.pattern.mediator;

/**
 * @author ymhui
 * @date 2019/7/25
 * @time 14:48
 * description 交易平台
 */
public class DatingPlatform {
    public static void main(String[] args) {
        Medium md = new EstateMedium();    //房产中介
        Customer member1, member2;
        member1 = new Seller("张三(卖方)");
        member2 = new Buyer("李四(买方)");
        md.register(member1); //客户注册
        md.register(member2);
    }
}
