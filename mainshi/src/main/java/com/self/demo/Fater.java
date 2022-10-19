package com.self.demo;
public class Fater {
    static Output output = new Output("父类静态成员变量");
    Output output1 = new Output("父类非静态成员变量");

    static {
        System.out.println("父类静态代码块");
    }

    {
        System.out.println("父类非静态代码块");
    }

    public Fater() {
        System.out.println("父类构造函数");
    }

    public static void method() {
        System.out.println("父类类静态方法");
    }

    public void method1() {
        System.out.println("父类类非静态方法");
    }
}
