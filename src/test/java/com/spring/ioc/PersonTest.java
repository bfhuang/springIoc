package com.spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PersonTest {

	@Test
	public void should_inject_name_to_person_through_constructor(){
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/ioc/applicationContext.xml");
		Person person = (Person) context.getBean("person");

		assertThat(person.getName(),is("Zhiheng"));
	}


}
