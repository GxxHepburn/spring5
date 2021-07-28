package tx.gxx.spring5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tx.gxx.spring5.dao.UserDao;

/**
 * @author gxx
 * @create 2021-07-28 12:26
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional(readOnly = false, timeout = 5, propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
    public void accountMoney() {
        userDao.reduceMoney();
        int i = 10 / 0;
        userDao.addMoney();
    }
}
