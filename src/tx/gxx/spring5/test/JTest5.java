package tx.gxx.spring5.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import tx.gxx.spring5.service.UserService;

/**
 * @author gxx
 * @create 2021-07-28 18:36
 */
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:jdbc.xml")

@SpringJUnitConfig(locations = "classpath:jdbc.xml")
public class JTest5 {

    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        userService.accountMoney();
    }
}
