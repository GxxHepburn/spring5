package comth.gxx.spring5.service;

import comth.gxx.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author gxx
 * @create 2021-07-26 20:12
 */
@Component(value = "userService")
public class UserService {

    @Value(value = "abc")
    private String nname;

//    @Autowired
//    @Qualifier("userDaoImpl")
//    private UserDao userDao;

    @Resource(name = "userDaoImpl")
    private UserDao userDao;

    public void add() {
        System.out.println("service add.............." + nname);
        userDao.add();
    }
}
