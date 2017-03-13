package ioc.iocExample;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class InstantiatingBeanTest {

    private ApplicationContext context = new ClassPathXmlApplicationContext("ioc/iocExample/person-spring-config.xml");
    private Person person;

    @Test
    public void instantiatingBeanByConstructor() {
        person = (Person) context.getBean("person");
        assertThat(person.getName(), is("Zhiheng"));
    }

    @Test
    public void instantiatingBeanByFactoryStaticMethod() {
        person = (Person) context.getBean("personFromFactoryStaticMethod");
        assertThat(person.getName(), is("personFromFactoryStaticMethod"));
    }

    @Test
    public void instantiatingBeanByFactoryInstanceMethod() {
        person = (Person) context.getBean("personFromFactoryInstanceMethod");
        assertThat(person.getName(), is("personFromFactoryInstanceMethod"));
    }

    @Test
    public void instantiatingInnerClass() {
        Person.InnerPerson innerPerson = (Person.InnerPerson) context.getBean("innerPerson");
        assertThat(innerPerson.getName(), is("innerPersonName"));
    }
}
