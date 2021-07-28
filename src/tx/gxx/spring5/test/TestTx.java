package tx.gxx.spring5.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tx.gxx.spring5.config.TxConfig;
import tx.gxx.spring5.service.UserService;

/**
 * @author gxx
 * @create 2021-07-28 12:26
 */
public class TestTx {

    @Test
    public void testAccount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void testAccount1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
}
