package com.fengdui.chapter_10_rpc.springRMI;

import chapter_10_rpc.springRMI.*;

/**
 * @author FD
 * @date 2017/1/20
 */
public class HelloServiceImpl implements chapter_10_rpc.springRMI.HelloService {

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }

    @Override
    public String sayYourAge(int age) {
        return null;
    }
}
