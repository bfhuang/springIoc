package xmlobjectconverting.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xmlobjectconverting.Customer;
import xmlobjectconverting.XmlConverter;

import java.io.IOException;

/**
 * Created by bfhuang on 3/13/17.
 */
public class App {

    private static final String XML_FILE_NAME = "customer.xml";

    public static void main(String[] args) throws IOException {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("xmlobjectconverting/spring.xml");
        XmlConverter converter = (XmlConverter) appContext.getBean("xmlConverter");

        Customer customer = new Customer();
        customer.setName("mkyong");
        customer.setAge(30);
        customer.setFlag(true);
        customer.setAddress("This is address");

        System.out.println("Convert Object to XML!");
        //from object to XML file
        converter.convertFromObjectToXML(customer, XML_FILE_NAME);
        System.out.println("Done \n");

        System.out.println("Convert XML back to Object!");
        //from XML to object
        Customer customer2 = (Customer)converter.convertFromXMLToObject(XML_FILE_NAME);
        System.out.println(customer2);
        System.out.println("Done");

    }
}
