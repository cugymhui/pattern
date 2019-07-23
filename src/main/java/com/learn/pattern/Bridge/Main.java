package com.learn.pattern.Bridge;

/**
 * @author ymhui
 * @date 2019/7/22
 * @time 11:51
 * description
 */
public class Main {
    public static void main(String[] args) {
        StringDisplayImpl stringDisplay = new StringDisplayImpl("千金方");
        AbstractDisplay abstractDisplay = new AbstractDisplay(stringDisplay);
        abstractDisplay.display();
    }
}
