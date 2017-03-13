package ioc.iocExample;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class InstantiatingContainerTest {

	@Test
	public void instantiatingContainerByFilePath(){
		ApplicationContext context = new FileSystemXmlApplicationContext("xml/person-spring-config.xml");;
		Person person = (Person) context.getBean("person");

		assertThat(person.getName(),is("Zhiheng"));
	}

    @Test
    public void instantiatingContainerByClassPath() {
        ApplicationContext context = context = new ClassPathXmlApplicationContext("ioc/iocExample/person-spring-config.xml");
        Person person = (Person) context.getBean("person");

        assertThat(person.getName(),is("Zhiheng"));


    }




}
