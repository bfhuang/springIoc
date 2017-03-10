package javaConfig.config;

import javaConfig.model.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CustomerConfig {

    @Bean(name="customer")
//    @Scope("prototype")
    public Customer customer(){

        return new Customer();

    }
}