package com.learn.pattern.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ymhui
 * @date 2019/7/20
 * @time 16:01
 * description 具体动物马
 */
public class Horse implements IAnimal {

    private Logger logger = LoggerFactory.getLogger(Horse.class);

    @Override
    public void show() {
        logger.info("I am a horse");
    }
}
