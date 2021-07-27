package proxy.gxx.spring5.aopano;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author gxx
 * @create 2021-07-27 20:27
 */
@Component
@Aspect
@Order(1)
public class UserProxy {

    @Pointcut(value = "execution(* proxy.gxx.spring5.aopano.User.add(..))")
    public void pointdemo() {
    }

    @Before(value = "pointdemo()")
    public void before() {
        System.out.println("before.............");
    }

    @AfterReturning(value = "pointdemo()")
    public void afterReturning() {
        System.out.println("afterReturning......................");
    }

    @After(value = "pointdemo()")
    public void after() {
        System.out.println("after.....................");
    }

    @AfterThrowing(value = "pointdemo()")
    public void afterThrowing() {
        System.out.println("afterThrowing.....................");
    }

    @Around(value = "pointdemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前.................");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后....................");
    }
}
