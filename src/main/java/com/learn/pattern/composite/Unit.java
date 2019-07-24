package com.learn.pattern.composite;

import lombok.Data;

/**
 * @author ymhui
 * @date 2019/7/23
 * @time 10:32
 * description 基本抽象类
 * Component（抽象构建）：是节点的抽象类，包含所有节点类的行为和实现，如部门类和公司类；
 * 针对节点公司类，抽象构建中含有增加、移除和遍历自身的功能；
 * 组合模式的关键是定义了一个抽象构件类，它既可以代表叶子，又可以代表容器，
 * 而客户端针对该抽象构件类进行编程，无须知道它到底表示的是叶子还是容器，可以对其进行统一处理。
 * 同时容器对象与抽象构件类之间还建立一个聚合关联关系，在容器对象中既可以包含叶子，也可以包含容器，
 * 以此实现递归组合，形成一个树形结构。
 * ---------------------
 * 作者：Starry-
 * 来源：CSDN
 * 原文：https://blog.csdn.net/nobody_1/article/details/86652885
 * 版权声明：本文为博主原创文章，转载请附上博文链接！
 */

@Data
public abstract class Unit {
    private String name;

    public abstract void add(Unit unit);

    public abstract void remove(Unit unit);

    public abstract void inform(int dept);

}
