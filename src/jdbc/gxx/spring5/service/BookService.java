package jdbc.gxx.spring5.service;

import jdbc.gxx.spring5.dao.BookDao;
import jdbc.gxx.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gxx
 * @create 2021-07-28 9:31
 */
@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public void addBook(Book book) {
        bookDao.add(book);
    }

    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    public void delete(String id) {
        bookDao.delete(id);
    }

    public int findCount() {
        return bookDao.selectCount();
    }

    public Book findOne(String id) {
        return bookDao.findBookInfo(id);
    }

    public List<Book> findAll() {
        return bookDao.findAllBook();
    }
}
