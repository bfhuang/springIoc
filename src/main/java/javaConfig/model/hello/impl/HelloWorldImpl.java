package javaConfig.model.hello.impl;

import javaConfig.model.hello.HelloWorld;

public class HelloWorldImpl implements HelloWorld {

    @Override
    public void printHelloWorld(String msg) {

        System.out.println("Hello : " + msg);
    }

}