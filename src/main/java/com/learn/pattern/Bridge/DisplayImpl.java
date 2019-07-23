package com.learn.pattern.Bridge;

/**
 * @author ymhui
 * @date 2019/7/22
 * @time 11:41
 * description 实现类，定义实现化角色的接口，供扩展抽象化角色调用
 */
public abstract class DisplayImpl {

    public abstract void DrawOpen();

    public abstract void DrawPrint();

    public abstract void DrawClose();
}
