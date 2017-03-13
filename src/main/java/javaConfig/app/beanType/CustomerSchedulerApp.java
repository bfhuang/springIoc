package javaConfig.app.beanType;

import javaConfig.config.beanType.CustomerSchedulerAppConfig;
import javaConfig.model.beanType.Customer;
import javaConfig.model.beanType.Scheduler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by bfhuang on 3/10/17.
 */
public class CustomerSchedulerApp {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(
                CustomerSchedulerAppConfig.class);

        Customer customer1 = (Customer) context.getBean("customer");
        Customer customer2 = (Customer) context.getBean("customer");

//        this is to test singleton
        customer1.setName("name from customer1");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());

        Scheduler scheduler1 = (Scheduler) context.getBean("scheduler");
        Scheduler scheduler2 = (Scheduler) context.getBean("scheduler");

        scheduler1.setName("name from scheduler1");
        System.out.println(scheduler1.getName());
        System.out.println(scheduler2.getName());

    }
}
