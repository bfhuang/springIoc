package aop.springaop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by bfhuang on 3/13/17.
 */
public class HijackAroundMethod implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        System.out.println("before method execute");

        Object proceed = invocation.proceed();

        System.out.println("after method execute");
        return null;
    }
}
