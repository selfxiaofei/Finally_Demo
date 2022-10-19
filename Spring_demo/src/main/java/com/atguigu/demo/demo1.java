package com.atguigu.demo;

/**
 * @author zhumengfei
 * @create --
 */
public class demo1 {

    private demo demo;

    private String id;

    public demo1(com.atguigu.demo.demo demo, String id) {
        this.demo = demo;
        this.id = id;
    }

    public demo1() {
    }

    @Override
    public String toString() {
        return "demo1{" +
                "demo=" + demo +
                ", id='" + id + '\'' +
                '}';
    }

    public com.atguigu.demo.demo getDemo() {
        return demo;
    }

    public void setDemo(com.atguigu.demo.demo demo) {
        this.demo = demo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
