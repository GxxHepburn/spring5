package comt.gxx.spring5.testdemo;

import comt.gxx.spring5.autowire.Emp;
import comt.gxx.spring5.bean.Orders;
import comt.gxx.spring5.collectiontype.Book;
import comt.gxx.spring5.collectiontype.Course;
import comt.gxx.spring5.collectiontype.Stu;
import comt.gxx.spring5.factorybean.MyBean;
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

        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
//        book.test();
        System.out.println(book1);
        System.out.println(book2);
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("comt_bean3.xml");

        Course course = context.getBean("mybean", Course.class);
        System.out.println(course);
    }

    @Test
    public void testBean3() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("comt_bean4.xml");

        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(orders);
        context.close();
    }

    @Test
    public void test4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("comt_bean5.xml");

        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
