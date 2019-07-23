package com.learn.pattern.Factory;

/**
 * @author ymhui
 * @date 2019/7/20
 * @time 16:03
 * description 具体工厂-马
 */
public class HorseFactory implements IFactory {
    @Override
    public IAnimal newAnimal(){
        return new Horse();
    }
}
