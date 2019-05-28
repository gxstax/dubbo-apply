package com.ant.consumer;

import com.ant.api.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

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


        HelloService helloService = context.getBean("helloService", HelloService.class);

        for (int i = 0; i < 500; i++) {

            try {
                String userName = helloService.sayHello("ant");
                System.out.println(userName);

                TimeUnit.SECONDS.sleep(1);
            }catch (Exception e){
                System.out.println("报错了.....");
            }

        }

    }
}
