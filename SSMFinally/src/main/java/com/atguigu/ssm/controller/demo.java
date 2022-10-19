package com.atguigu.ssm.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhumengfei
 * @create --
 */
public class demo {

    public demo() {
        super();
    }

    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        reentrantLock.unlock();
        new StringBuilder();
        new StringBuffer().append(1);
        List list = new ArrayList();
        LinkedList<Object> objects = new LinkedList<>();
        Set set = new HashSet();
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        //Collections.min();
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("");


    }
}
