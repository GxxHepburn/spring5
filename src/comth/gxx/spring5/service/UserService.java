package comth.gxx.spring5.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author gxx
 * @create 2021-07-26 20:12
 */
@Component(value = "userService")
public class UserService {

    public void add() {
        System.out.println("service add..............");
    }
}
