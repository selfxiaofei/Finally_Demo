package com.atguigu.demo;

/**
 * @author zhumengfei
 * @create --
 */

public class demo {

    private String name;
    private Integer age;
    private String address;

    public demo(){

    }

    public demo(String name,Integer age,String address){
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "demo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
