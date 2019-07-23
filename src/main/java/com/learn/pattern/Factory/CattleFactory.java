package com.learn.pattern.Factory;

/**
 * @author ymhui
 * @date 2019/7/20
 * @time 16:05
 * description 具体工厂-牛
 */
public class CattleFactory implements IFactory {
    @Override
    public IAnimal newAnimal(){
        return new Cattle();
    }
}
