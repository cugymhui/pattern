package com.learn.pattern.abstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ymhui
 * @date 2019/7/20
 * @time 17:50
 * description
 */
public class Fruit implements IAbstractPlant {
    private Logger logger = LoggerFactory.getLogger(Fruit.class);

    @Override
    public void show() {
        logger.info("I am fruit");
    }
}
