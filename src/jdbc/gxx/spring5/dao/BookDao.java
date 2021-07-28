package jdbc.gxx.spring5.dao;

import jdbc.gxx.spring5.entity.Book;

/**
 * @author gxx
 * @create 2021-07-28 9:31
 */
public interface BookDao {
    public void add(Book book);

    public void updateBook(Book book);

    public void delete(String id);
}
