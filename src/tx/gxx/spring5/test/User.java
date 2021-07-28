package tx.gxx.spring5.test;

import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author gxx
 * @create 2021-07-28 17:58
 */
public class User {

    @Test
    public void testGenericApplicationContext() {
        GenericApplicationContext context = new GenericApplicationContext();
        context.refresh();
        context.registerBean("user1", User.class, () -> new User());

        User user = (User) context.getBean("user1");
        System.out.println(user);
    }
}
