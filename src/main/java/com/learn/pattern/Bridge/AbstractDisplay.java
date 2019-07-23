package com.learn.pattern.Bridge;

/**
 * @author ymhui
 * @date 2019/7/22
 * @time 11:44
 * description 抽象化
 */
public class AbstractDisplay {
    private DisplayImpl displayImpl;

    public AbstractDisplay(DisplayImpl displayImpl) {
        this.displayImpl = displayImpl;
    }

    public void open() {
        displayImpl.DrawOpen();
    }

    public void print() {
        displayImpl.DrawPrint();
    }

    public void close() {
        displayImpl.DrawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}
