package com.learn.pattern.Composite;

/**
 * @author ymhui
 * @date 2019/7/23
 * @time 11:46
 * description 客户端类
 */
public class Client {
    public static void main(String[] args){
        HeadQuarters headQuarters = new HeadQuarters("湖北通服");
        Department department = new Department("人力");
        headQuarters.add(department);
        HeadQuarters headQuarters1 = new HeadQuarters("设计院");
        headQuarters.add(headQuarters1);
        Department yanfa = new Department("研发中心");
        headQuarters1.add(yanfa);

        headQuarters.inform(0);
    }
}
