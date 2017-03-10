package javaConfig.config;

import javaConfig.model.Scheduler;
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