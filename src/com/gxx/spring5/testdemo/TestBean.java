package com.gxx.spring5.testdemo;

import com.gxx.spring5.User;
import com.gxx.spring5.bean.Emp;
import com.gxx.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gxx
 * @create 2021-07-26 13:38
 */
public class TestBean {

    @Test
    public void testRefBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void testInBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }

    @Test
    public void testBean4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }
}
