package com.ant.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ClassName Provider
 * @Description Provider
 * @Author Ant
 * @Date 2019-03-23 19:19
 * @Version 1.0
 **/
public class Provider {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("dubbo-provider.xml");

        classPathXmlApplicationContext.start();

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
