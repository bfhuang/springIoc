package ioc.javaConfig.model.hello.impl;

import ioc.javaConfig.model.hello.HelloWorld;

public class HelloWorldImpl implements HelloWorld {

    @Override
    public void printHelloWorld(String msg) {

        System.out.println("Hello : " + msg);
    }

}