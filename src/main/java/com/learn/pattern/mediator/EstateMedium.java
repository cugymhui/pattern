package com.learn.pattern.mediator;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author ymhui
 * @date 2019/7/25
 * @time 14:49
 * description 具体中介类，房地产中介
 */
public class EstateMedium implements Medium {
    private List<Customer> members = Lists.newArrayList();

    public void register(Customer member) {
        if (!members.contains(member)) {
            members.add(member);
            member.setMedium(this);
        }
    }

    public void relay(String from, String ad) {
        for (Customer ob : members) {
            String name = ob.getName();
            if (!name.equals(from)) {
                ob.receive(from, ad);
            }
        }
    }
}
