package com.atguigu.demo;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author zhumengfei
 * @create --
 */
public class springTest {


    public ApplicationContext getcontext(){
        return new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void bean1() {
        ApplicationContext getcontext = getcontext();
        //HelloWorld helloworld = (HelloWorld) getcontext.getBean("helloworld");
        HelloWorld helloworld = (HelloWorld) getcontext.getBean("helloworld",HelloWorld.class);
        HelloWorld helloworld1 = (HelloWorld) getcontext.getBean(HelloWorld.class);
        helloworld.say();

    }

    @Test
    public void bean2(){
        ApplicationContext getcontext = getcontext();
        demo demo = (demo) getcontext.getBean("test");
        demo demo1 = (demo) getcontext.getBean("demo1");
        demo1 demo12 = (demo1)getcontext.getBean("demo13");
        demo1 demotest = (demo1)getcontext.getBean("demotest");
        System.out.println(demo);
    }

    @Test
    public void driverTest() throws SQLException {
        DataSource druidDataSource = (DataSource)getcontext().getBean("druidDataSource");
        Connection connection = druidDataSource.getConnection();
        System.out.println(connection);

    }
}
