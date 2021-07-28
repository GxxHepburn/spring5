package jdbc.gxx.spring5.test;

import jdbc.gxx.spring5.entity.Book;
import jdbc.gxx.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gxx
 * @create 2021-07-28 9:57
 */
public class TestBook {

    @Test
    public void testJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("java");
//        book.setUstatus("a");
//        bookService.addBook(book);

//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("javaupup");
//        book.setUstatus("gxxxxxxxxx");
//        bookService.updateBook(book);

//        bookService.delete("1");

//        int count = bookService.findCount();
//        System.out.println(count);

//        Book book = bookService.findOne("1");
//        System.out.println(book);

//        List<Book> list = bookService.findAll();
//        System.out.println(list);

//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"3", "ccccc", "c"};
//        Object[] o2 = {"4", "dddddd", "d"};
//        Object[] o3 = {"5", "eeeeeee", "e"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchAdd(batchArgs);

//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"c+update", "c", "3"};
//        Object[] o2 = {"d+update", "d", "4"};
//        Object[] o3 = {"e+update", "e", "5"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchUpdate(batchArgs);

        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3"};
        Object[] o2 = {"4"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        bookService.batchDelete(batchArgs);
    }
}
