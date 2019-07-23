package com.learn.pattern.Bridge;

/**
 * @author ymhui
 * @date 2019/7/22
 * @time 11:47
 * description 扩展实现类
 */
public class StringDisplayImpl extends DisplayImpl {

    String name;

    public StringDisplayImpl(String name) {
        this.name = name;
    }

    @Override
    public void DrawOpen() {
        printLine();
    }

    @Override
    public void DrawPrint() {
        System.out.println("|||||" + name + "|||||");
    }

    @Override
    public void DrawClose() {
        printLine();
    }

    private void printLine() {
        System.out.println("================");
    }
}
