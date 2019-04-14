package com.ant.consumer;

import com.ant.api.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Consumer
 * @Description Consumer
 * @Author Ant
 * @Date 2019-03-23 20:04
 * @Version 1.0
 **/
public class Consumer {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        context.start();


        HelloService bean = context.getBean("helloService", HelloService.class);
        for (int i = 0; i < 5; i++) {

            String userName = bean.sayHello("ant");
            System.out.println(userName);
//            Thread.sleep(100L);
        }

    }
}
