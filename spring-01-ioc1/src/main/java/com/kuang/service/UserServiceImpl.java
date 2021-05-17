package com.kuang.service;

import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDapMySqlImpl;

/**
 * @author Willam_xh
 * @create 2021-05-06 9:20
 */
public class UserServiceImpl implements UserService{
    //业务层就做一个事情 调取dao层去查
    private UserDao userDao;//=new UserDapMySqlImpl() 本来是程序去控制创建对象

    //利用set实现动态值的输入 程序的主动性交给了客户 是被动的接收对象
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
