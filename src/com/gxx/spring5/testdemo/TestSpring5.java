package com.gxx.spring5.testdemo;

import com.gxx.spring5.Book;
import com.gxx.spring5.Orders;
import com.gxx.spring5.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gxx
 * @create 2021-07-26 10:59
 */
public class TestSpring5 {

    @Test
    public void testAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testOrders() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.oredersTest();
    }
}
