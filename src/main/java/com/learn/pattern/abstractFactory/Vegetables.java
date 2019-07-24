package com.learn.pattern.abstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ymhui
 * @date 2019/7/20
 * @time 17:47
 * description
 */
public class Vegetables implements IAbstractPlant {
    private Logger logger = LoggerFactory.getLogger(Vegetables.class);

    @Override
    public void show(){
        logger.info("I am vegetables");
    }
}
