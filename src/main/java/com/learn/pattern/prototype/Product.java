package com.learn.pattern.prototype;

/**
 * @author ymhui
 * @date 2019/7/16
 * @time 16:22
 * description 抽象原型
 */
public interface Product extends Cloneable {

    void use(String s);

    Product createClone();
}
