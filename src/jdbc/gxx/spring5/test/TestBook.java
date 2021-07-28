package jdbc.gxx.spring5.test;

import jdbc.gxx.spring5.entity.Book;
import jdbc.gxx.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

        bookService.delete("1");
    }
}
