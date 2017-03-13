package javaConfig.app.hello;


import javaConfig.config.hello.HelloConfig;
import javaConfig.model.hello.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloApp {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfig.class);
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");

        obj.printHelloWorld("Spring3 Java Config");

    }

}
