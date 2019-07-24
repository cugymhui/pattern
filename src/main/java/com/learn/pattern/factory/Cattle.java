package com.learn.pattern.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ymhui
 * @date 2019/7/20
 * @time 16:02
 * description 具体动物牛
 */
public class Cattle implements IAnimal {

    private Logger logger = LoggerFactory.getLogger(Cattle.class);

    @Override
    public void show() {
        logger.info("I am a cattle");
    }
}
