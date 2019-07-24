package com.learn.pattern.composite;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author ymhui
 * @date 2019/7/23
 * @time 11:29
 * description 公司类，树枝构件
 */
public class HeadQuarters extends Unit {

    private List<Unit> units = Lists.newArrayList();

    public HeadQuarters(String name) {
        setName(name);
    }

    @Override
    public void add(Unit unit) {
        units.add(unit);
    }

    @Override
    public void remove(Unit unit) {
        units.remove(unit);
    }

    @Override
    public void inform(int depth) {
        String temp = "";
        for (int i = 0; i < depth; i++) {
            temp += "+";
        }
        System.out.println(temp + getName());
        // 若含有子公司，应该遍历各子公司，直到部门层级
        for (Unit unit : units) {
            unit.inform(depth + 3);
        }
    }
}
