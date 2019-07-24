package com.learn.pattern.abstractFactory;

/**
 * @author ymhui
 * @date 2019/7/20
 * @time 16:52
 * description 抽象工厂
 */
public interface IAbstractFactory {

    IAbstractAnimal newAnimal();

    IAbstractPlant newPlant();
}
