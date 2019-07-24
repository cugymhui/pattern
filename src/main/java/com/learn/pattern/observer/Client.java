package com.learn.pattern.observer;

/**
 * @author ymhui
 * @date 2019/7/23
 * @time 17:07
 * description
 */
public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        student.add(teacher);
        student.notifyObserver();
    }
}
