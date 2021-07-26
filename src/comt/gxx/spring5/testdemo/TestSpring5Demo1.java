package comt.gxx.spring5.testdemo;

import comt.gxx.spring5.collectiontype.Book;
import comt.gxx.spring5.collectiontype.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gxx
 * @create 2021-07-26 15:46
 */
public class TestSpring5Demo1 {

    @Test
    public void testCollection() {
        ApplicationContext context = new ClassPathXmlApplicationContext("comt_bean1.xml");

        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }

    @Test
    public void testCollection2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("comt_bean2.xml");

        Book book = context.getBean("book", Book.class);
        book.test();
    }
}
