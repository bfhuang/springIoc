package aop.aspectj.app;

import aop.aspectj.model.CustomerImp;
import aop.aspectj.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by bfhuang on 3/13/17.
 */
public class AopApp {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/aspectj/spring.xml");

        CustomerImp customer = (CustomerImp) context.getBean("customer");
        customer.addCustomer();

        Product product = (Product) context.getBean("product");
        product.addProduct();

    }

}
