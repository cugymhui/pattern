package com.learn.pattern.AbstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ymhui
 * @date 2019/7/20
 * @time 16:58
 * description
 */
public class Horse implements IAbstractAnimal {

    private Logger logger = LoggerFactory.getLogger(Horse.class);
    @Override
    public void show(){
        logger.info("I am horse");
    }
}
