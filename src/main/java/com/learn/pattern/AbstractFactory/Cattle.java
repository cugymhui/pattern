package com.learn.pattern.AbstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ymhui
 * @date 2019/7/20
 * @time 17:44
 * description
 */
public class Cattle implements IAbstractAnimal {

    private Logger logger = LoggerFactory.getLogger(Cattle.class);

    @Override
    public void show() {
        logger.info("I am cattle");
    }
}
