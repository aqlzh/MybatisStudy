package com.lzh.dao;

import com.lzh.pojo.User;

import java.util.List;

public interface UserDao {
    // 查询全部用户
    List<User> getUserList() ;
    // 根据ID查询用户
    User getUserById(int id) ;

    // insert 一个用户
    int addUser(User user) ;   // 前者为返回值，后者为添加值

    // 修改用户
    int updateUser(User user) ;

    //删除一个用户
    int deleteUser(int id) ;

    //模糊查询
    List<User> getUserLike(String name) ;
}
