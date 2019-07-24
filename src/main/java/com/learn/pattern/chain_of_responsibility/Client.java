package com.learn.pattern.chain_of_responsibility;

/**
 * @author ymhui
 * @date 2019/7/24
 * @time 10:48
 * description
 */
public class Client {

    public static void main(String[] args) {
        ClassAdviser classAdviser = new ClassAdviser();
        DepartmentLeader departmentLeader = new DepartmentLeader();
        Dean dean = new Dean();
        classAdviser.setNext(departmentLeader);
        departmentLeader.setNext(dean);
        classAdviser.handleRequest(12);
    }
}
