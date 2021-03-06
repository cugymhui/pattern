package com.learn.pattern.mediator.extend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ymhui
 * @date 2019/7/25
 * @time 15:42
 * description
 */
public class SimpleColleague1 implements SimpleColleague {

    private Logger logger = LoggerFactory.getLogger(SimpleColleague1.class);

    public SimpleColleague1() {
        SimpleMediator simpleMediator = SimpleMediator.getInstance();
        simpleMediator.register(this);
    }

    @Override
    public void send(String message) {
        logger.info(message);
    }

    @Override
    public void receive() {
        SimpleMediator simpleMediator = SimpleMediator.getInstance();
        simpleMediator.relay(this);
    }
}
