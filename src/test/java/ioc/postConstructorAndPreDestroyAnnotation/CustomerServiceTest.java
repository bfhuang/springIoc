package ioc.postConstructorAndPreDestroyAnnotation;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CustomerServiceTest {

    @Test
    public void testAfterPropertySetAndDestroyMethond() throws Exception {

        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("ioc/postConstructorAndPreDestroyAnnotation/spring-customer.xml");

        CustomerService customerService = (CustomerService) context.getBean("customerService");

        System.out.println(customerService);

        context.close();

    }
}