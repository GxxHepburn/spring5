package com.gxx.spring5.service;

import com.gxx.spring5.dao.UserDao;

/**
 * @author gxx
 * @create 2021-07-26 13:10
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add () {
        System.out.println("service add ...................");
    }
}
