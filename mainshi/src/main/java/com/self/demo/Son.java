package com.self.demo;

public class Son extends Fater {
    static Output output = new Output("子类静态成员变量");
    Output output1 = new Output("子类非静态成员变量");

    static {
        System.out.println("子类静态代码块");
    }

    {
        System.out.println("子类非静态代码块");
    }

    public Son() {
        System.out.println("子类构造函数");
    }

    public static void method() {
        System.out.println("子类静态方法");
    }

    public void method1() {
        System.out.println("子类非静态方法");
    }
}
