package jdbc.gxx.spring5.dao;

import jdbc.gxx.spring5.entity.Book;

import java.util.List;

/**
 * @author gxx
 * @create 2021-07-28 9:31
 */
public interface BookDao {
    public void add(Book book);

    public void updateBook(Book book);

    public void delete(String id);

    public int selectCount();

    public Book findBookInfo(String id);

    public List<Book> findAllBook();
}
