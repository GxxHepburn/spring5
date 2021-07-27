package proxy.gxx.spring5.aopano;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author gxx
 * @create 2021-07-27 21:35
 */
@Component
@Aspect
public class PersonProxy {

    @Before(value = "execution(* proxy.gxx.spring5.aopano.User.add(..))")
    public void before() {
        System.out.println("Person Before..............");
    }
}
