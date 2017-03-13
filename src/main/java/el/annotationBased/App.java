package el.annotationBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by bfhuang on 3/13/17.
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("el/annotationBased/spring.xml");

        Customer obj = (Customer) context.getBean("customerBean");
        System.out.println(obj.getItem().getName());
        System.out.println(obj.getItemName());
    }
}
