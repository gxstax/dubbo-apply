package com.ant.provider;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.rpc.RpcContext;
import com.ant.api.HelloService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName HelloServiceImpl
 * @Description HelloServiceImpl
 * @Author Ant
 * @Date 2019-03-23 19:07
 * @Version 1.0
 **/

public class HelloServiceImpl implements HelloService {
    public String sayHello(String userName)  {
        URL url = RpcContext.getContext().getUrl();


        System.out.println("调用了");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "hello" + userName +
                String.format("protocol is %s, address is %s", url.getProtocol(), url.getAddress());

//        return "Hello " + userName;
    }
}
