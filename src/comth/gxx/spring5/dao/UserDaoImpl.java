package comth.gxx.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @author gxx
 * @create 2021-07-27 16:29
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("dao add..........");
    }
}
