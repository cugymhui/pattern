package com.learn.pattern.prototype;

/**
 * @author ymhui
 * @date 2019/7/16
 * @time 16:38
 * description
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderLinePen underlinePen=new UnderLinePen('~');
        MessageBox mbox=new MessageBox('*');
        MessageBox sbox=new MessageBox('/');
        manager.register("Strong message", underlinePen);
        manager.register("Waring Box", mbox);
        manager.register("Slash Box", sbox);
        Product p1=manager.create("Strong message");
        p1.use("hello world");
        Product p2=manager.create("Waring Box");
        p2.use("hello world");
        Product p3=manager.create("Slash Box");
        p3.use("hello world");

        Product p4 = manager.create("Slash Box");
        p4.use("clone");
    }
}
