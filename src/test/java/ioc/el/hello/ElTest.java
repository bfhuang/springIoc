package ioc.el.hello;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by bfhuang on 3/13/17.
 */
public class ElTest {

    @Test
    public void testEl() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc/el/hello/Spring.xml");

        Customer obj = (Customer) context.getBean("customerBean");

        System.out.println(obj);
    }

}
