package proxy.gxx.spring5.aopano;

import org.springframework.stereotype.Component;

/**
 * @author gxx
 * @create 2021-07-27 20:26
 */
@Component
public class User {
    public void add() {
//        int a = 10/0;
        System.out.println("add............");
    }
}
