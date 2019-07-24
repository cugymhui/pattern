package com.learn.pattern.composite;

/**
 * @author ymhui
 * @date 2019/7/23
 * @time 11:42
 * description 树叶构件
 */
public class Department extends Unit {

    public Department(String name) {
        setName(name);
    }

    @Override
    public void add(Unit unit) {
        System.out.println("无法添加部门");
    }

    @Override
    public void remove(Unit unit) {
        System.out.println("无法移除部门");
    }

    @Override
    public void inform(int depth) {
        String temp = "";
        for (int i = 0; i < depth; i++) {
            temp += "+";
        }
        System.out.println(temp + getName() + "收到通知");
    }
}
