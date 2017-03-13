package ioc.afterPropertyAndDestroy;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CustomerServiceTest {

    @Test
    public void testAfterPropertySetAndDestroyMethond() throws Exception {

        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"ioc/afterPropertySetAndDestroy/spring-customer.xml"});

        CustomerService cust = (CustomerService)context.getBean("customerService");

        System.out.println(cust);

        context.close();

    }
}