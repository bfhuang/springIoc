package javaConfig.config.hello;


import javaConfig.model.hello.HelloWorld;
import javaConfig.model.hello.impl.HelloWorldImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {

    @Bean(name="helloBean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }

}
