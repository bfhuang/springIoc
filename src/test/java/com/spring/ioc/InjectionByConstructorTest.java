package com.spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class InjectionByConstructorTest {
    private ApplicationContext context = new ClassPathXmlApplicationContext("ioc/person-spring-config.xml");
    private Person person;

    @Test
    public void should_inject_by_constructor_argument_type() {
       person = (Person) context.getBean("personInjectByConstructorType");

        assertThat(person.getName(), is("personInjectByConstructorTypeName"));
    }

    @Test
    public void should_inject_by_constructor_argument_index() {
        person = (Person) context.getBean("personInjectByConstructorIndex");

        assertThat(person.getName(), is("personInjectByConstructorIndexName"));
        assertThat(person.getAge(), is(1));
    }

    @Test
    public void should_inject_by_constructor_argument_name() {
        person = (Person) context.getBean("personInjectByConstructorArgumentName");

        assertThat(person.getName(), is("personInjectByConstructorArgumentName"));
        assertThat(person.getAge(), is(1));

        person= (Person) context.getBean("personInjectByConstructorArgumentNameWithAnnotation");

    }
}
