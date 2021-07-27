package comth.gxx.spring5;

import comth.gxx.spring5.config.AppConfig;
import comth.gxx.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gxx
 * @create 2021-07-26 20:04
 */
public class TestSpring5Demo1 {

    @Test
    public void testService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("comth_bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }

    @Test
    public void testService2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
