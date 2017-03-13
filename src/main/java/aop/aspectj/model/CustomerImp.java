package aop.aspectj.model;

/**
 * Created by bfhuang on 3/13/17.
 */
public class CustomerImp {


    public void addCustomer() {
        System.out.println("addCustomer() is running ");
    }

    public String addCustomerReturnValue() {
        System.out.println("addCustomerReturnValue() is running ");
        return "abc";
    }

    public void addCustomerThrowException() throws Exception {
        System.out.println("addCustomerThrowException() is running ");
        throw new Exception("Generic Error");
    }

    public void addCustomerAround(String name) {
        System.out.println("addCustomerAround() is running, args : " + name);
    }
}
