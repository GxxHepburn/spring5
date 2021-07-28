package tx.gxx.spring5.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tx.gxx.spring5.service.UserService;

/**
 * @author gxx
 * @create 2021-07-28 12:26
 */
public class TestTx {

    @Test
    public void testAccount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
}
