package com.kuang.mapper;

import com.kuang.pojo.User;

import java.util.List;

/**
 * @author Willam_xh
 * @create 2021-05-24 14:51
 */
public interface UserMapper {
    public List<User> selectUser();

    //添加一个用户、
    public int addUser(User user);

    //删除一个用户
    public int deleteUser(int id);






}
