package com.learn.pattern.AbstractFactory;

/**
 * @author ymhui
 * @date 2019/7/20
 * @time 17:53
 * description
 */
public class SRFarm implements IAbstractFactory {
    @Override
    public IAbstractAnimal newAnimal() {
        return new Cattle();
    }

    @Override
    public IAbstractPlant newPlant() {
        return new Vegetables();
    }
}
