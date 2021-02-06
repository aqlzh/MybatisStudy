package com.lzh.dao;

import com.lzh.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserDao {


    //模糊查询
    List<User> getUserLike(String name) ;

    // 分页
    List<User> getUserByLimit(Map<String,Integer> map) ;


    // 注意： 以上为使用注解注释前

    // 方法存在多个参数，所有的参数前面必须加上 @Param("id) 注解
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id) ;
//
//    @Insert("insert into user(id,name,pwd) value(#{id),#{name},#{password}")
//    int addUser (User user) ;
//
//    @Update("update user set name=#{name},pwd=#{password} where id=#{id}")
//    int updateUser(User user) ;


    @Delete("delete from user where id=#{id}")
    int deleteUser(@Param("id") int id) ;

}
