package com.learn.pattern.AbstractFactory;

/**
 * @author ymhui
 * @date 2019/7/20
 * @time 17:52
 * description
 */
public class SGFarm implements IAbstractFactory {
    @Override
    public IAbstractAnimal newAnimal(){
        return new Horse();
    }

    @Override
    public IAbstractPlant newPlant(){
        return new Fruit();
    }
}
