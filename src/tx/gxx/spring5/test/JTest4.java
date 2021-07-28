package tx.gxx.spring5.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tx.gxx.spring5.service.UserService;

/**
 * @author gxx
 * @create 2021-07-28 18:24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:jdbc.xml")
public class JTest4 {

    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        userService.accountMoney();
    }
}
