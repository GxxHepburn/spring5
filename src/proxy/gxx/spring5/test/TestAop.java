package proxy.gxx.spring5.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import proxy.gxx.spring5.aopano.User;
import proxy.gxx.spring5.aopxml.Book;

/**
 * @author gxx
 * @create 2021-07-27 20:36
 */
public class TestAop {
    @Test
    public void testAopAnno() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aopano.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testAopXml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aopxml.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
