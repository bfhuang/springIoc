package aop.springaop.app;

import aop.springaop.CustomerImp;
import aop.springaop.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by bfhuang on 3/13/17.
 */
public class App {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/springaop/spring.xml");

        CustomerImp customer = (CustomerImp) context.getBean("customerProxy");
        customer.addCustomer();

        Product product = (Product) context.getBean("productProxy");
        product.addProduct();
    }
}
