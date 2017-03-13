package ioc.iocExample;

/**
 * Created by twer on 6/22/14.
 */
public class PersonFactory {

    public static Person createPersonByStaticMethod() {
        return new Person("personFromFactoryStaticMethod");
    }

    public Person createPersonByInstanceMethod() {
        return new Person("personFromFactoryInstanceMethod");
    }
}
