package javaConfig.config.beanType;

import javaConfig.model.beanType.Scheduler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SchedulerConfig {

    @Bean(name="scheduler")
    @Scope("prototype")
    public Scheduler scheduler(){

        return new Scheduler();

    }

}