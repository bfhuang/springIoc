package aop.aspectj.model;

/**
 * Created by bfhuang on 3/13/17.
 */
public interface CustomerInterface {
    void addCustomer();

    String addCustomerReturnValue();

    void addCustomerThrowException() throws Exception;

    void addCustomerAround(String name);
}
