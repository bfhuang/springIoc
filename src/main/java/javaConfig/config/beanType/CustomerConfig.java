package javaConfig.config.beanType;

import javaConfig.model.beanType.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {

    @Bean(name="customer")
//    @Scope("prototype")
    public Customer customer(){

        return new Customer();

    }
}