package com.learn.pattern.mediator.extend;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author ymhui
 * @date 2019/7/25
 * @time 15:34
 * description 简单中介者
 */
public class SimpleMediator {
    private static SimpleMediator simpleMediator = new SimpleMediator();
    private List<SimpleColleague> simpleColleagues = Lists.newArrayList();

    private SimpleMediator() {
    }

    public static SimpleMediator getInstance() {
        return simpleMediator;
    }

    public void register(SimpleColleague simpleColleague) {
        if (!simpleColleagues.contains(simpleColleague)) {
            simpleColleagues.add(simpleColleague);
        }
    }

    public void relay(SimpleColleague simpleColleague){
        for (SimpleColleague simpleColleague1:simpleColleagues){
            if (!simpleColleague.equals(simpleColleague1)){
                simpleColleague1.receive();
            }
        }
    }
}
