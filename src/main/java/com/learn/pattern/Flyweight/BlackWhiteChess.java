package com.learn.pattern.Flyweight;

/**
 * @author ymhui
 * @date 2019/7/23
 * @time 9:49
 * description 具体棋子类
 */
public class BlackWhiteChess extends Chess {
    public BlackWhiteChess(String type) {
        super(type);
    }

    @Override
    public void operation(Local local) {  // Local表示位置类
        System.out.println(getType() + " " + local);
    }
}
